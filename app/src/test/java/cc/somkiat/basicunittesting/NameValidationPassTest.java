package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.NameIsEmpty;
import cc.somkiat.basicunittesting.validation.NameIsNull;
import cc.somkiat.basicunittesting.validation.NameIsAlphaBet;
import cc.somkiat.basicunittesting.validation.NameIsLong;
import cc.somkiat.basicunittesting.validation.NameIsNumeric;
import cc.somkiat.basicunittesting.validation.NameIsShort;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Kawin on 16/11/2560.
 */

public class NameValidationPassTest {
    @Test
    public void nameNotEmpty(){
        Validation validation = new NameIsEmpty();
        validation.validation("sds");
        assertTrue("Name is not empty", validation.getResult());

    }
    @Test
    public void nameNotNull(){
        Validation validation = new NameIsNull();
        validation.validation("dwwddw");
        assertTrue("Name is not null", validation.getResult());

    }

    @Test
    public void nameNotLong(){
        Validation validation = new NameIsLong();
        validation.validation("aaaaaaaaaas");
        assertTrue("Name is not long", validation.getResult());

    }

    @Test
    public void nameNotShort(){
        Validation validation = new NameIsShort();
        validation.validation("aggggg");
        assertTrue("Name is not short", validation.getResult());

    }

    @Test
    public void nameIsAlpahbet(){
        Validation validation = new NameIsAlphaBet();
        validation.validation("lllgrg");
        assertTrue("Name is Alphabet", validation.getResult());

    }

    @Test
    public void nameNotNumeric(){
        Validation validation = new NameIsNumeric();
        validation.validation("gtrgtrgtr");
        assertTrue("Name is not Nummeric", validation.getResult());

    }
}
