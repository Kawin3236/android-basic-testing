package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.Validation;

/**
 * Created by Kawin on 16/11/2560.
 */

public class NameIsAlphaBet extends Validation {
    @Override
    public void validation(String input) {
        if(!input.matches("^[a-zA-Z]*$")){
            setResult(false);
            setErrorMessage("Name is not Alphabet.");
        }
    }
}
