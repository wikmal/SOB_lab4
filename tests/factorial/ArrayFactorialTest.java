package factorial;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFactorialTest {

    private ArrayFactorial arrayFactorial;

    @Before
    public void setUp() throws Exception {
        arrayFactorial = new ArrayFactorial();
    }

    @Test
    public void calculateCorrect() throws Exception {
        assertEquals(1, arrayFactorial.calculateFactorial(1)); //first correct
        assertEquals(2, arrayFactorial.calculateFactorial(2));
        assertEquals(6, arrayFactorial.calculateFactorial(3));
        assertEquals(24, arrayFactorial.calculateFactorial(4));
        assertEquals(120, arrayFactorial.calculateFactorial(5));
        assertEquals(720, arrayFactorial.calculateFactorial(6));
        assertEquals(5040, arrayFactorial.calculateFactorial(7));
        assertEquals(479001600, arrayFactorial.calculateFactorial(12)); //last correct
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError() throws Exception {
        assertEquals(1, arrayFactorial.calculateFactorial(13)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError2() throws Exception {
        assertEquals(1, arrayFactorial.calculateFactorial(10000)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooSmallNumberError() throws Exception {
        assertEquals(1, arrayFactorial.calculateFactorial(0)); //first too small
    }
}