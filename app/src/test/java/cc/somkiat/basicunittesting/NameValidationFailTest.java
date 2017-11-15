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

    @Test
    public void ชื่อมีตัวอักษรมากกว่า20(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isNameLong("ddddd");
        assertFalse("ต้องไม่ผ่านนะ เพราะชื่อตัวอักษรมีมากกว่า20ตัว", result);
    }
    @Test
    public void ชื่อมีตัวอักษรกว่ากว่า2(){
        NameValidation nameValidation = new NameValidation();
        boolean result = nameValidation.isNameShort("d");
        assertFalse("ต้องไม่ผ่านนะ เพราะชื่อตัวอักษรมีมากกว่า20ตัว", result);
    }


}
