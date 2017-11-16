package cc.somkiat.basicunittesting.NameValidation;

import cc.somkiat.basicunittesting.Validation;
import cc.somkiat.basicunittesting.model.User;

/**
 * Created by Kawin on 16/11/2560.
 */

public class NameEmpty extends Validation {


    @Override
    public void validation(String input) {
        if (input.isEmpty()) {
            setResult(false);
        }
    }
}
