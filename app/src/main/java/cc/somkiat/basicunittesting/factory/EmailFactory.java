package cc.somkiat.basicunittesting.factory;

import java.util.ArrayList;
import java.util.List;

import cc.somkiat.basicunittesting.Validation;
import cc.somkiat.basicunittesting.validation.EmailIsEmpty;
import cc.somkiat.basicunittesting.validation.EmailIsNull;
import cc.somkiat.basicunittesting.validation.EmailPattren;
import cc.somkiat.basicunittesting.validation.NameIsEmpty;
import cc.somkiat.basicunittesting.validation.NameIsNull;

/**
 * Created by Kawin on 16/11/2560.
 */

public final class EmailFactory {
    private List<Validation> validationRules;
    public EmailFactory() {
    }

    public List<Validation> getEmailValidationRules(){
        validationRules = new ArrayList<Validation>();
        validationRules.add(new EmailIsEmpty());
        validationRules.add(new EmailIsNull());
        validationRules.add(new EmailPattren());


        return validationRules;
    }
}
