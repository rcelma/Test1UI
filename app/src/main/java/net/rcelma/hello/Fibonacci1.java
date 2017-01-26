package net.rcelma.hello;

/**
 * Created by User on 1/25/2017.
 */

public class Fibonacci1 {

    public static Integer getNth(Integer n) {
        int actual = 0;
        int prev1 = 0;
        int prev2 = 1;
        for (int i = 0; i < n; i++) {
            actual = prev1 + prev2;
            prev2 = prev1;
            prev1 = actual;
        }
        return actual;
    }
}
