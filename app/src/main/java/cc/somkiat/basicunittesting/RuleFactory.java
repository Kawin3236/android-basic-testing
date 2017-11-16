package cc.somkiat.basicunittesting;

import java.util.ArrayList;
import java.util.List;

import cc.somkiat.basicunittesting.NameValidation.NameEmpty;

/**
 * Created by Kawin on 16/11/2560.
 */

public final class RuleFactory {
    public RuleFactory() {
    }

    public static List<Validation> getValidationRules(){
        List<Validation> validationRules = new ArrayList<Validation>();
        validationRules.add(new NameEmpty());

        return validationRules;
    }
}
