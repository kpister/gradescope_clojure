# Gradesope Clojure Autograder

Adapted from the gradescope docs.

### Navigation Help

Students submit a Clojure file (in this case called [scripts.clj](solution/scripts.clj)) 

That file is copied to [src/main/resources/interop/scripts.clj](src/main/resources/interop/scripts.clj)


The next place to look is [Interop.java](src/main/java/interop/Interop.java)

This is where we define the wrapper. For each function we want to test from `Clojure`, we create a Var that bridges into the Clojure function. E.g. `private static Var fib = = RT.var("scripts", "nth-fib");`
We can then invoke that function from Java as we would like, which leads into how we test. 

Looking at [src/main/java/interop/tests/InteropTest.java](src/main/java/interop/tests/InteropTest.java) you can see the very simple unit test I wrote. This structure is very similar to the Python autograder. 


### Other files

The folder [jh61b](src/main/java/jh61b) contains all the unit testing backend that instructors don't have to deal with.

[compile.sh](compile.sh) is how we compile all the java files. Importantly we include `src/main/resources/` as part of the classpath, this is how we find the clojure files submitted by the students.

[run.sh](run.sh) same as `compile.sh`

[setup.sh](setup.sh) all we need is java 8, everything else (including clojure) is just a jar file included in the repo.


### To Use:

Edit the test cases to suit the assignment. 

Run `./make_autograder.sh` to create a new autograder.zip file. Submit this to Gradescope.
