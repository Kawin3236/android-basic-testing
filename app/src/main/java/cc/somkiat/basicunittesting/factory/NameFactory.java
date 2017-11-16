package cc.somkiat.basicunittesting.factory;

import java.util.ArrayList;
import java.util.List;

import cc.somkiat.basicunittesting.Validation;
import cc.somkiat.basicunittesting.validation.NameIsEmpty;
import cc.somkiat.basicunittesting.validation.NameIsNull;
import cc.somkiat.basicunittesting.validation.NameIsAlphaBet;
import cc.somkiat.basicunittesting.validation.NameIsLong;
import cc.somkiat.basicunittesting.validation.NameIsNumeric;
import cc.somkiat.basicunittesting.validation.NameIsShort;

/**
 * Created by Kawin on 16/11/2560.
 */

public final class NameFactory {
    private List<Validation> validationRules;
    public NameFactory() {
    }

    public List<Validation> getValidationRules(){
        validationRules = new ArrayList<Validation>();
        validationRules.add(new NameIsEmpty());
        validationRules.add(new NameIsNull());
        validationRules.add(new NameIsNumeric());
        validationRules.add(new NameIsShort());
        validationRules.add(new NameIsAlphaBet());
        validationRules.add(new NameIsLong());


        return validationRules;
    }

}
