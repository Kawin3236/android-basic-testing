package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.NameIsEmpty;
import cc.somkiat.basicunittesting.validation.NameIsAlphaBet;
import cc.somkiat.basicunittesting.validation.NameIsLong;
import cc.somkiat.basicunittesting.validation.NameIsNumeric;
import cc.somkiat.basicunittesting.validation.NameIsShort;
import cc.somkiat.basicunittesting.validation.NameIsNull;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Kawin on 16/11/2560.
 */

public class NameValidationFailTest {

    @Test
    public void nameIsEmpty(){
        Validation validation = new NameIsEmpty();
        validation.validation("");
        assertFalse("Name is empty.", validation.getResult());
        assertEquals("Name is empty.", validation.getErrorMessage());
    }



    @Test
    public void nameIsNull(){
        Validation validation = new NameIsNull();
        validation.validation(null);
        assertFalse("Name is null", validation.getResult());
        assertEquals("Name is null.", validation.getErrorMessage());
    }



    @Test
    public void nameIsLong(){
        Validation validation = new NameIsLong();
        validation.validation("aaaaaaaaaasssssssssqddfqwdwqddqw");
        assertFalse("Name is long", validation.getResult());
        assertEquals("Name is too long.", validation.getErrorMessage());
    }

    @Test
    public void nameIsShort(){
        Validation validation = new NameIsShort();
        validation.validation("a");
        assertFalse("Name is short", validation.getResult());
        assertEquals("Name is too short.", validation.getErrorMessage());
    }

    @Test
    public void nameNotAlpahbet(){
        Validation validation = new NameIsAlphaBet();
        validation.validation("ggg@@g");
        assertFalse("Name is not Alphabet.", validation.getResult());
        assertEquals("Name is not Alphabet.", validation.getErrorMessage());
    }

    @Test
    public void nameIsNumeric(){
        Validation validation = new NameIsNumeric();
        validation.validation("4849");
        assertFalse("Name is Nummeric", validation.getResult());
        assertEquals("Name is number", validation.getErrorMessage());
    }
}
