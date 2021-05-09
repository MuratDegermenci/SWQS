import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(13, calculator.addition(10, 3));
    }

    @Test
    public void testNegativeAdd(){
        assertEquals(-7, calculator.addition(-2, -5));
    }

    @Test
    public void testZeroAdd() {
        assertEquals(1, calculator.addition(0, 1));
    }

    @Test
    public void testSub() {
        assertEquals(7, calculator.subtraction(10, 3));
    }

    @Test
    public void testNegativeSub() {
        assertEquals(3, calculator.subtraction(-2, -5));
    }

    @Test
    public void testZeroSub() {
        assertEquals(-5, calculator.subtraction(-5, 0));
    }

    @Test
    public void testMul() {
        assertEquals(30, calculator.multiplication(10, 3));
    }

    @Test
    public void testNegativeMul() {
        assertEquals(30, calculator.multiplication(-10, -3));
    }

    @Test
    public void testZeroMul() {
        assertEquals(0, calculator.multiplication(1000, 0));
    }

    @Test
    public void testDiv() {
        assertEquals(5, calculator.division(10, 2));
    }

    @Test
    public void testNegativeDiv() {
        assertEquals(-5, calculator.division(10, -2));
    }

    @Test(expected = ArithmeticException.class)
    public void testZeroDiv() {
        calculator.division(0, 0);
        assertEquals(2, calculator.division(10, 0));
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }
}