package cc.somkiat.basicunittesting.validation;

import cc.somkiat.basicunittesting.Validation;

/**
 * Created by Kawin on 16/11/2560.
 */

public class NameIsShort extends Validation {
    @Override
    public void validation(String name) {
        if (name.length() < 2){
            setResult(false);
            setErrorMessage("Name is too short.");
        }
    }
}
