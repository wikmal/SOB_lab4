package factorial;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveFactorialTest {

    private RecursiveFactorial recursiveFactorial;

    @Before
    public void setUp() throws Exception {
        recursiveFactorial = new RecursiveFactorial();
    }

    @Test
    public void calculateCorrect() throws Exception {
        assertEquals(1, recursiveFactorial.calculateFactorial(1)); //first correct
        assertEquals(2, recursiveFactorial.calculateFactorial(2));
        assertEquals(6, recursiveFactorial.calculateFactorial(3));
        assertEquals(24, recursiveFactorial.calculateFactorial(4));
        assertEquals(120, recursiveFactorial.calculateFactorial(5));
        assertEquals(720, recursiveFactorial.calculateFactorial(6));
        assertEquals(5040, recursiveFactorial.calculateFactorial(7));
        assertEquals(479001600, recursiveFactorial.calculateFactorial(12)); //last correct
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError() throws Exception {
        assertEquals(1, recursiveFactorial.calculateFactorial(13)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError2() throws Exception {
        assertEquals(1, recursiveFactorial.calculateFactorial(10000));
    }

    @Test(expected = Exception.class)
    public void calculateTooSmallNumberError() throws Exception {
        assertEquals(1, recursiveFactorial.calculateFactorial(0)); //first too small
    }
}