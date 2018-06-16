package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterativeFibonacciTest {

    IterativeFibonacci iterativeFibonacci;

    @Before
    public void setUp() throws Exception {
        iterativeFibonacci = new IterativeFibonacci();
    }

    @Test
    public void calculateCorrect() throws Exception {
        assertEquals(0, iterativeFibonacci.calculateFibonacci(0));
        assertEquals(1, iterativeFibonacci.calculateFibonacci(1));
        assertEquals(1, iterativeFibonacci.calculateFibonacci(2));
        assertEquals(2, iterativeFibonacci.calculateFibonacci(3));
        assertEquals(3, iterativeFibonacci.calculateFibonacci(4));
        assertEquals(5, iterativeFibonacci.calculateFibonacci(5));
        assertEquals(8, iterativeFibonacci.calculateFibonacci(6));
        assertEquals(13, iterativeFibonacci.calculateFibonacci(7));
        assertEquals(1836311903 , iterativeFibonacci.calculateFibonacci(46));
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError() throws Exception {
        assertEquals(1, iterativeFibonacci.calculateFibonacci(47)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError2() throws Exception {
        assertEquals(1, iterativeFibonacci.calculateFibonacci(10000));
    }

    @Test(expected = Exception.class)
    public void calculateTooSmallNumberError() throws Exception {
        assertEquals(1, iterativeFibonacci.calculateFibonacci(-1)); //first too small
    }
}