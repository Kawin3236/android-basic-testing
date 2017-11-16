package cc.somkiat.basicunittesting;

import org.junit.Test;

import cc.somkiat.basicunittesting.validation.EmailIsEmpty;
import cc.somkiat.basicunittesting.validation.EmailIsNull;
import cc.somkiat.basicunittesting.validation.EmailPattren;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Kawin on 16/11/2560.
 */

public class EmailValidationPassTest {
    @Test
    public void emailPattern(){
        Validation validation = new EmailPattren();
        validation.validation("5555@ldoe.com");
        assertTrue("Email is pattern", validation.getResult());
    }
    @Test
    public void emailNotEmpty(){
        Validation validation = new EmailIsEmpty();
        validation.validation("uggigig");
        assertTrue("Email is not empty", validation.getResult());
    }

    @Test
    public void emailNotNull(){
        Validation validation = new EmailIsNull();
        validation.validation("eefefew");
        assertTrue("Email is not null", validation.getResult());
    }
}
