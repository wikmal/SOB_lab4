package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveFibonacciTest {

    RecursiveFibonacci recursiveFibonacci;

    @Before
    public void setUp() throws Exception {
        recursiveFibonacci = new RecursiveFibonacci();
    }

    @Test
    public void calculateCorrect() throws Exception {
        assertEquals(0, recursiveFibonacci.calculateFibonacci(0));
        assertEquals(1, recursiveFibonacci.calculateFibonacci(1));
        assertEquals(1, recursiveFibonacci.calculateFibonacci(2));
        assertEquals(2, recursiveFibonacci.calculateFibonacci(3));
        assertEquals(3, recursiveFibonacci.calculateFibonacci(4));
        assertEquals(5, recursiveFibonacci.calculateFibonacci(5));
        assertEquals(8, recursiveFibonacci.calculateFibonacci(6));
        assertEquals(13, recursiveFibonacci.calculateFibonacci(7));
        assertEquals(1836311903 , recursiveFibonacci.calculateFibonacci(46));
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError() throws Exception {
        assertEquals(1, recursiveFibonacci.calculateFibonacci(47)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError2() throws Exception {
        assertEquals(1, recursiveFibonacci.calculateFibonacci(10000));
    }

    @Test(expected = Exception.class)
    public void calculateTooSmallNumberError() throws Exception {
        assertEquals(1, recursiveFibonacci.calculateFibonacci(-1)); //first too small
    }
}