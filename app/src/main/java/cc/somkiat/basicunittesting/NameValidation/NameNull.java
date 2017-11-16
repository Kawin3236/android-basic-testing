package cc.somkiat.basicunittesting.NameValidation;

import cc.somkiat.basicunittesting.Validation;

/**
 * Created by Kawin on 16/11/2560.
 */

public class NameNull extends Validation {
    @Override
    public void validation(String input) {
        if(input == null){
            setResult(false);
        }
    }
}
