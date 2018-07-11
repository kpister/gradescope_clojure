# Gradesope Clojure Autograder

Adapted from the gradescope docs.

# Navigation Help

Students submit a Clojure file (in this case called [scripts.clj](solution/scripts.clj)) 

That file is copied to [src/main/resources/interop/scripts.clj](src/main/resources/interop/scripts.clj)


The next place to look is [Interop.java](src/main/java/interop/Interop.java)

This is where we define the wrapper. For each function we want to test from `Clojure`, we create a Var that bridges into the Clojure function. E.g. `private static Var fib = = RT.var("scripts", "nth-fib");`
We can then invoke that function from Java as we would like, which leads into how we test. 

Looking at [src/main/java/interop/tests/InteropTest.java](src/main/java/interop/tests/InteropTest.java) you can see the very simple unit test I wrote. This structure is very similar to the Python autograder. 
