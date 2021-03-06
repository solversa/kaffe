/*
 * alpha/sysdepCallMethod.h
 * Dynamically build function calls.
 *
 * Copyright (c) 1996, 1997, 1998, 1999
 *	Transvirtual Technologies, Inc.  All rights reserved.
 *
 * See the file "license.terms" for information on usage and redistribution 
 * of this file. 
 *
 * by Alexandre Oliva <oliva@dcc.unicamp.br>
 */

/* Needed for callMethodInfo declaration */
#include "support.h"

/* This file is supposed to be included twice, once with LONG_SYSDEP
   defined, once without it.  The first version cannot be inlined by
   gcc/egcs at least up to 1.2, because it contains variable-sized
   arrays, but it is only used for functions with many arguments.  For
   functions with few arguments, the second, inlinable version is
   used.  */

/* egcs 1.1.* fail to compile the sysdepCallMethod, but older releases
   of gcc, as well as egcs 1.0 and pre-1.2 snapshots, compile it
   successfully.  So, with egcs 1.1.*, we have to fallback to a
   single, non-inlinable version of sysdepCallMethod.  :-( */
#ifndef SYSDEP_ONE_VERSION
#if __GNUC__ == 2 && __GNUC_MINOR__ == 91
# define SYSDEP_ONE_VERSION 1
# undef LONG_SYSDEP
#endif

/* This define will cause callMethodV and callMethodA to promote every
   integer type to a 64bit word, and every float to double, so that
   every value can be loaded as a single 64bit word.  It also causes
   float arguments to be marked as 'D'.  */
#ifndef PROMOTE_TO_64bits
# define PROMOTE_TO_64bits 1
#endif

#ifndef PROMOTE_jfloat2jdouble
# define PROMOTE_jfloat2jdouble 0
#endif

  /* ARG_TYPE is the type of a register used for passing arguments.  */
#define ARG_TYPE long
  /* ARG_TYPES is a parameter list declaration for a function type
     that takes all possible arguments in registers.  */
#define ARG_TYPES ARG_TYPE, ARG_TYPE, ARG_TYPE, ARG_TYPE, ARG_TYPE, ARG_TYPE
  /* ARG_LIST is the argument list for such a function.  */
#define ARG_LIST a0, a1, a2, a3, a4, a5
  /* ARG_COUNT is the number of registers for passing arguments.  */
#define ARG_COUNT 6
  /* AG_DISPLACEMENT is the offset between the beginning of a
     variable-sized array, allocated in the stack, and the position of
     the first argument that can't be passed in a register.  */
#define ARG_DISPLACEMENT 0
  /* ARG_REG a case label and a statement that arranges for one
     argument to be passed. */
#define ARG_REG(n) \
case n+1: (calltype[n]==D) ? (d##n = callargs[n].d) \
        : (calltype[n]==F) ? (f##n = callargs[n].f) \
        : (a##n = callargs[n].j)

/*
 * Make a call to a native or Java (JIT) method.
 *  This assembly code should build a standard C call using the passed
 *  call information.  By its nature this is highly processor specific.
 *  This function is mandatory for both JIT and Interpreter (since stubs
 *  have now been deprecated).
 */
#ifndef LONG_SYSDEP
/* In a perfect world, this function would always be inlined, and we
   could declare it as extern inline.  However, since inlining isn't
   performed without optimization, we'd be unable to compile it
   without optimization, for debugging.  */
static inline void sysdepCallMethod(callMethodInfo *call) {
  unsigned args = call->nrargs;
  void *func = call->function;
  jvalue *callargs;
  char *calltype;
  char D = 'D', F = 'F';
#ifdef SYSDEP_ONE_VERSION
  ARG_TYPE extraargs[((args>ARG_COUNT)?(args-ARG_COUNT-ARG_DISPLACEMENT):0)];
#endif

  if (args == 0)
    goto noargs;
  
  callargs = call->args;
  calltype = call->calltype;

#else
/* This version cannot be inlined, because it contains variable-sized
   arrays.  It should only be called by the first version, when it
   finds there are too many arguments to be passed, so that some must
   be passed on the stack.  Although it cannot be inlined, it is
   declared as such, because some day gcc may be able to inline such
   functions.  Furthermore, declaring it inline means it will only be
   emitted if it is actually used.  */
static inline void
longSysdepCallMethod(callMethodInfo *call,
		     unsigned args,
		     void *func,
		     jvalue *callargs,
		     char *calltype) {
  char D = 'D', F = 'F';
  ARG_TYPE extraargs[args-ARG_COUNT-ARG_DISPLACEMENT];

  goto manyargs;
#endif

  switch(args) {
    register ARG_TYPE a0 asm("$16");
    register ARG_TYPE a1 asm("$17");
    register ARG_TYPE a2 asm("$18");
    register ARG_TYPE a3 asm("$19");
    register ARG_TYPE a4 asm("$20");
    register ARG_TYPE a5 asm("$21");

    register double d0 asm("$f16");
    register double d1 asm("$f17");
    register double d2 asm("$f18");
    register double d3 asm("$f19");
    register double d4 asm("$f20");
    register double d5 asm("$f21");

    register float f0 asm("$f16");
    register float f1 asm("$f17");
    register float f2 asm("$f18");
    register float f3 asm("$f19");
    register float f4 asm("$f20");
    register float f5 asm("$f21");

  default:
#if ! defined(LONG_SYSDEP) && ! defined(SYSDEP_ONE_VERSION)
    return longSysdepCallMethod(call, args, func, callargs, calltype);
#else
  manyargs:
    memcpy(extraargs+ARG_DISPLACEMENT,
	   &callargs[ARG_COUNT],
	   (args-ARG_COUNT)*sizeof(ARG_TYPE));
#endif

    ARG_REG(5);
    ARG_REG(4);
    ARG_REG(3);
    ARG_REG(2);
    ARG_REG(1);
    ARG_REG(0);

  case 0:
#ifndef LONG_SYSDEP
  noargs:
#endif
    /* Ensure that the assignments to f* registers won't be optimized away. */
    asm ("" :: "f" (f0), "f" (f1), "f" (f2), "f" (f3), "f" (f4), "f" (f5) );
    asm ("" :: "f" (d0), "f" (d1), "f" (d2), "f" (d3), "f" (d4), "f" (d5) );

    switch(call->retsize) {
    case 0:
      /* Must be void.  */
      ((void (*)(ARG_TYPES))(func))(ARG_LIST);
      break;

    case 1:
      if (call->rettype == 'F')
	call->ret->f = ((jfloat (*)(ARG_TYPES))(func))(ARG_LIST);
      else /* Must be 32-bit or smaller int.  */
	call->ret->i = ((jint (*)(ARG_TYPES))(func))(ARG_LIST);
      break;

    default:
      /* It could've been `case 2;', but then we'd get an additional cmp
       * that we don't really need.  */
      if (call->rettype == 'D')
	call->ret->d = ((jdouble (*)(ARG_TYPES))(func))(ARG_LIST);
      else /* Must be jlong.  */
	call->ret->j = ((jlong (*)(ARG_TYPES))(func))(ARG_LIST);
      break;
    }
  }
}

#undef ARG_TYPE
#undef ARG_TYPES
#undef ARG_LIST
#undef ARG_COUNT
#undef ARG_DISPLACEMENT
#undef ARG_REG

#endif /* SYSDEP_ONE_VERSION */
