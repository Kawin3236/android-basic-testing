package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

/**
 * Created by student on 15/11/2017 AD.
 */

public class EmailValidationFailTest {
    @Test
    public void อีเมลเป็นค่าว่าง(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isEmpty("");
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามันมีค่าว่าง", result);
    }
}
