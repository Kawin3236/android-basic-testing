package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.Validation;

/**
 * Created by Kawin on 16/11/2560.
 */

public class NameIsNumeric extends Validation {
    @Override
    public void validation(String input) {
        if(input.matches("^[0-9]+")){
            setResult(false);
            setErrorMessage("Name is number");
        }
    }
}
