package factorial;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialMainTest {

    FactorialMain factorialMain;

    @Before
    public void setUp() throws Exception {
        factorialMain = new FactorialMain();
    }

    @Test
    public void calculateTest() throws Exception {
        assertEquals(1, factorialMain.calculate(1)); //first correct
        assertEquals(2, factorialMain.calculate(2));
        assertEquals(6, factorialMain.calculate(3));
        assertEquals(24, factorialMain.calculate(4));
        assertEquals(120, factorialMain.calculate(5));
        assertEquals(720, factorialMain.calculate(6));
        assertEquals(5040, factorialMain.calculate(7));
        assertEquals(479001600, factorialMain.calculate(12)); //last correct
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError() throws Exception {
        assertEquals(1, factorialMain.calculate(13)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooBigNumberError2() throws Exception {
        assertEquals(1, factorialMain.calculate(10000)); //first too big
    }

    @Test(expected = Exception.class)
    public void calculateTooSmallNumberError() throws Exception {
        assertEquals(1, factorialMain.calculate(0)); //first too small
    }
}
