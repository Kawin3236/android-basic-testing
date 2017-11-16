package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.Validation;

/**
 * Created by Kawin on 16/11/2560.
 */

public class EmailIsNull extends Validation {
    @Override
    public void validation(String input) {
        if(input == null){
            setResult(false);
            setErrorMessage("Email is null.");
        }
    }
}
