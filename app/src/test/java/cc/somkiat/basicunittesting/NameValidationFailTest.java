package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.NameValidation.NameEmpty;
import cc.somkiat.basicunittesting.NameValidation.NameIsAlphaBet;
import cc.somkiat.basicunittesting.NameValidation.NameIsLong;
import cc.somkiat.basicunittesting.NameValidation.NameIsNumeric;
import cc.somkiat.basicunittesting.NameValidation.NameIsShort;
import cc.somkiat.basicunittesting.NameValidation.NameNull;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by Kawin on 16/11/2560.
 */

public class NameValidationFailTest {

    @Test
    public void nameIsEmpty(){
        Validation validation = new NameEmpty();
        validation.validation("");
        assertFalse("Name is empty", validation.getResult());
    }

    @Test
    public void nameIsNull(){
        Validation validation = new NameNull();
        validation.validation(null);
        assertFalse("Name is null", validation.getResult());
    }

    @Test
    public void nameIsLong(){
        Validation validation = new NameIsLong();
        validation.validation("aaaaaaaaaasssssssssqddfqwdwqddqw");
        assertFalse("Name is long", validation.getResult());
    }

    @Test
    public void nameIsShort(){
        Validation validation = new NameIsShort();
        validation.validation("a");
        assertFalse("Name is short", validation.getResult());
    }

    @Test
    public void nameNotAlpahbet(){
        Validation validation = new NameIsAlphaBet();
        validation.validation("ggg@@g");
        assertFalse("Name is Alphabet", validation.getResult());
    }

    @Test
    public void nameIsNumeric(){
        Validation validation = new NameIsNumeric();
        validation.validation("4849");
        assertFalse("Name is Nummeric", validation.getResult());
    }
}
