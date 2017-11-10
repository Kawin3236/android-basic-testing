package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

/**
 * Created by student on 11/10/2017 AD.
 */

public class NameValidationFailTest {
    @Test
    public void ชื่อเป็นค่าว่าง(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isEmpty("");
        assertFalse("ต้องไม่ผ่านนะ เพราะว่ามั้นมีค่าว่าง", result);
    }


}
