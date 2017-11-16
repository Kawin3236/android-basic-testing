package cc.somkiat.basicunittesting.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import cc.somkiat.basicunittesting.factory.EmailFactory;
import cc.somkiat.basicunittesting.R;
import cc.somkiat.basicunittesting.factory.NameFactory;
import cc.somkiat.basicunittesting.Validation;

public class MainActivity extends AppCompatActivity {
    private EditText inputName;
    private EditText inputEmail;
    private NameFactory validation;
    private EmailFactory validationEmail;
    private List<Validation> validationList;
    private List<Validation> emailValidationList;
    private boolean status = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOtherView();
        validation = new NameFactory();
        validationList = validation.getValidationRules();
        validationEmail = new EmailFactory();
        emailValidationList = validationEmail.getEmailValidationRules();


    }

    public void setOtherView() {
        inputName = findViewById(R.id.userNameInput);
        inputEmail = findViewById(R.id.emailInput);
    }

    public void checkInputname() {

        for (Validation validation : validationList) {
            validation.validation(inputName.getText().toString());
            if (!validation.getResult()) {
                Toast.makeText(this, validation.getErrorMessage(), Toast.LENGTH_SHORT).show();
                status = false;
                break;
            }
        }

    }

    public void CheckEmail() {

        for (Validation validation : emailValidationList) {
            validation.validation(inputEmail.getText().toString());
            if (!validation.getResult()) {
                Toast.makeText(this, validation.getErrorMessage(), Toast.LENGTH_SHORT).show();
                status = false;
                break;
            }

        }
    }

    public void onSaveClick(View view) {
        checkInputname();
        CheckEmail();
        if(status)
            Toast.makeText(this, "Complete", Toast.LENGTH_SHORT).show();
    }

    public void onRevertClick(View view) {
        inputEmail.setText("");
        inputName.setText("");
    }
}
