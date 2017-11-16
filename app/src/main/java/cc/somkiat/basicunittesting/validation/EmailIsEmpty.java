package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.Validation;

/**
 * Created by Kawin on 16/11/2560.
 */

public class EmailIsEmpty extends Validation {
    @Override
    public void validation(String input) {
        if (input.isEmpty()) {
            setResult(false);
            setErrorMessage("Email is empty.");
        }
    }
}
