package cc.somkiat.basicunittesting;

/**
 * Created by student on 11/10/2017 AD.
 */

class NameValidation {
    public boolean validate() {
        return false;
    }

    public boolean isEmpty(String name) {
        if (name.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isNameLong(String s) {
        if (s.length() < 20) {
            return false;
        }
        return true;
    }

    public boolean isNameShort(String d) {
        if (d.length() < 2) {
            return false;
        }
        return true;
    }


}
