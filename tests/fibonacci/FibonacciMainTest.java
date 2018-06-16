package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciMainTest {
    FibonacciMain fibonacciMain;

    @Before
    public void setUp() throws Exception {
        fibonacciMain = new FibonacciMain();
    }

    @Test
    public void calculateCorrect() throws Exception {
        assertEquals(1, fibonacciMain.calculate(2)); //first correct
        assertEquals(2, fibonacciMain.calculate(3));
        assertEquals(3, fibonacciMain.calculate(4));
        assertEquals(5, fibonacciMain.calculate(5));
        assertEquals(8, fibonacciMain.calculate(6));
        assertEquals(13, fibonacciMain.calculate(7));
        assertEquals(1836311903 , fibonacciMain.calculate(46)); //last correct
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError() throws Exception {
        assertEquals(1, fibonacciMain.calculate(47)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError2() throws Exception {
        assertEquals(1, fibonacciMain.calculate(10000));
    }

    @Test(expected = Exception.class)
    public void calculateTooSmallNumberError() throws Exception {
        assertEquals(1, fibonacciMain.calculate(-1)); //first too small
    }

    @Test
    public void nasd1() throws Exception {
        assertEquals(0, fibonacciMain.calculate(0));
    }

    @Test
    public void asd2() throws Exception {
        assertEquals(1, fibonacciMain.calculate(1));
    }
}