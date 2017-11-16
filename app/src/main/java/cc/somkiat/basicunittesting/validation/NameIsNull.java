package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.Validation;

/**
 * Created by Kawin on 16/11/2560.
 */

public class NameIsNull extends Validation {
    @Override
    public void validation(String input) {
        if(input == null){
            setResult(false);
            setErrorMessage("Name is null.");
        }
    }
}
