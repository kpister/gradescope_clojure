package interop;

import clojure.lang.*;
import java.io.IOException;

public class Interop {
    static {
        try {
            RT.loadResourceScript("interop/scripts.clj");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Var fib = RT.var("interop.scripts", "nth-fib");

    //Bridge function
    public static long nthFib(long n){
        return ((BigInt) fib.invoke(n)).longValue();
    }
}
