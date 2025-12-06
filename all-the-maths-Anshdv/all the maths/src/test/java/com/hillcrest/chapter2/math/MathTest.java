package test.java.com.hillcrest.chapter2.math;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class MathTest {

    @Test
    public void testPow() {
        double expected = 243.0;
        double actual = Math.pow(3, 5);
        Assertions.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testSqrt() {
        double expected = 4;
        double actual = Math.sqrt(16);
        Assertions.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testAbs() {
        int expected = 6;
        int actual = Math.abs(-6);
        Assertions.assertEquals(expected, actual);
    }
}
