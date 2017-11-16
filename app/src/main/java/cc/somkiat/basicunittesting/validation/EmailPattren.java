package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.Validation;

/**
 * Created by Kawin on 16/11/2560.
 */

public class EmailPattren extends Validation {
    @Override
    public void validation(String email) {
        if (!email.matches("^[A-Za-z0-9]+[A-Za-z0-9_%+-]+@([A-Za-z]+)\\.([A-Za-z]{2,})$")) {
            setResult(false);
            setErrorMessage("The email is not valid.");
        }
    }
}
