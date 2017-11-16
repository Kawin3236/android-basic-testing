package cc.somkiat.basicunittesting;

/**
 * Created by Kawin on 16/11/2560.
 */

public abstract class Validation {
    private boolean result = true;
    private String errorMessage;


    public abstract void validation(String input);

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
