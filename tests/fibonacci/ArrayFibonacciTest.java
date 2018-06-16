package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFibonacciTest {

    ArrayFibonacci arrayFibonacci;

    @Before
    public void setUp() throws Exception {
        arrayFibonacci = new ArrayFibonacci();
    }

    @Test
    public void calculateCorrect() throws Exception {
        assertEquals(1, arrayFibonacci.calculateFibonacci(2)); //first correct
        assertEquals(2, arrayFibonacci.calculateFibonacci(3));
        assertEquals(3, arrayFibonacci.calculateFibonacci(4));
        assertEquals(5, arrayFibonacci.calculateFibonacci(5));
        assertEquals(8, arrayFibonacci.calculateFibonacci(6));
        assertEquals(13, arrayFibonacci.calculateFibonacci(7));
        assertEquals(1836311903 , arrayFibonacci.calculateFibonacci(46)); //last correct
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError() throws Exception {
        assertEquals(1, arrayFibonacci.calculateFibonacci(47)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError2() throws Exception {
        assertEquals(1, arrayFibonacci.calculateFibonacci(10000));
    }

    @Test(expected = Exception.class)
    public void calculateTooSmallNumberError() throws Exception {
        assertEquals(1, arrayFibonacci.calculateFibonacci(-1)); //first too small
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void arrayOutOfBoundTest() throws Exception {
        assertEquals(0, arrayFibonacci.calculateFibonacci(0)); //arrayIndexOutOfBoundException
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void arrayOutOfBoundTest2() throws Exception {
        assertEquals(0, arrayFibonacci.calculateFibonacci(1)); //arrayIndexOutOfBoundException
    }
}