package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.EmailIsEmpty;
import cc.somkiat.basicunittesting.validation.EmailIsNull;
import cc.somkiat.basicunittesting.validation.EmailPattren;
import cc.somkiat.basicunittesting.validation.NameIsEmpty;
import cc.somkiat.basicunittesting.validation.NameIsNull;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by Kawin on 16/11/2560.
 */

public class EmailValidationFailTest {
    @Test
    public void emailIsEmpty(){
        Validation validation = new EmailIsEmpty();
        validation.validation("");
        assertFalse("Email is empty", validation.getResult());
        assertEquals("Email is empty.", validation.getErrorMessage());
    }

    @Test
    public void emailIsNull(){
        Validation validation = new EmailIsNull();
        validation.validation(null);
        assertFalse("Email is null", validation.getResult());
        assertEquals("Email is null.", validation.getErrorMessage());
    }

    @Test
    public void emailNotPattern(){
        Validation validation = new EmailPattren();
        validation.validation("thege@kikwedwefewm");
        assertFalse("Email is not pattern", validation.getResult());
        assertEquals("The email is not valid.", validation.getErrorMessage());
    }
}
