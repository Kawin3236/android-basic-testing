package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by student on 11/10/2017 AD.
 */

public class CalculatorTest {

    @Test
    public void สองบวกสองต้องได้สี่(){
        Calculator calculator = new Calculator();
        int result = calculator.plus(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void เจ็ดบวกสองต้องได้เก้า(){
        Calculator calculator = new Calculator();
        int result = calculator.plus(7, 2);
        assertEquals(9, result);
    }
}
