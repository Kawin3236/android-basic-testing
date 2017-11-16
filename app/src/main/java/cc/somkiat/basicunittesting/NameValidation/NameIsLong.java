package cc.somkiat.basicunittesting.NameValidation;

import cc.somkiat.basicunittesting.Validation;

/**
 * Created by Kawin on 16/11/2560.
 */

public class NameIsLong extends Validation {
    @Override
    public void validation(String name) {
        if (name.length() > 20){
            setResult(false);
        }
    }
}
