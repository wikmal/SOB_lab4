package factorial;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterativeFactorialTest {

    private IterativeFactorial iterativeFactorial;

    @Before
    public void setUp() throws Exception {
        iterativeFactorial = new IterativeFactorial();
    }

    @Test
    public void calculateCorrect() throws Exception {
        assertEquals(1, iterativeFactorial.calculateFactorial(1)); //first correct
        assertEquals(2, iterativeFactorial.calculateFactorial(2));
        assertEquals(6, iterativeFactorial.calculateFactorial(3));
        assertEquals(24, iterativeFactorial.calculateFactorial(4));
        assertEquals(120, iterativeFactorial.calculateFactorial(5));
        assertEquals(720, iterativeFactorial.calculateFactorial(6));
        assertEquals(5040, iterativeFactorial.calculateFactorial(7));
        assertEquals(479001600, iterativeFactorial.calculateFactorial(12)); //last correct
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError() throws Exception {
        assertEquals(1, iterativeFactorial.calculateFactorial(13)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError2() throws Exception {
        assertEquals(1, iterativeFactorial.calculateFactorial(10000)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooSmallNumberError() throws Exception {
        assertEquals(1, iterativeFactorial.calculateFactorial(0)); //first too small
    }
}