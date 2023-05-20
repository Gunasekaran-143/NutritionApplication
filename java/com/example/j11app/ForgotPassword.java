package com.example.j11app;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class ForgotPassword  extends AppCompatActivity  {

    Button proceed;
    private static final Pattern PASSWORD_PATTERN =  Pattern.compile("^" +
            "(?=.*[A-Z])" +         //at least 1 upper case letter
            "(?=.*[a-zA-Z])" +      //any letter
            "(?=.*[@#$%^&+=])" +    //at least 1 special character
            "(?=\\S+$)" +           //no white spaces
            ".{6,}" +               //at least 6 characters
            "$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^" + "[0-9]{10}" + "$");
    private EditText password,rePassword,name;
    private EditText phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        proceed = (Button) findViewById(R.id.proceedBtn);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);
        rePassword = findViewById(R.id.reenterPassword);
    }
    private boolean phone()
    {
        String  phoneInput = phone.getText().toString().trim();
        if (phoneInput.isEmpty()) {
            phone.setError("Field can't be empty");
            phone.requestFocus();
            return false;
        } else if (!PHONE_PATTERN.matcher(phoneInput).matches()) {
            phone.setError("Enter only 10 numbers");
            phone.requestFocus();
            return false;
        } else {
            phone.setError(null);
            return true;
        }
    }

    private boolean validatePassword() {
        String passwordInput = password.getText().toString().trim();

        if (passwordInput.isEmpty()) {
            password.setError("Field can't be empty");
            password.requestFocus();
            return false;
        } else if (!PASSWORD_PATTERN.matcher(passwordInput).matches()) {
            password.setError("Password too weak");
            password.requestFocus();
            return false;
        } else {
            password.setError(null);
            return true;
        }
    }

    private boolean validateRePassword() {
        String RepasswordInput = rePassword.getText().toString().trim();
        String passwordInput = password.getText().toString().trim();


        if (RepasswordInput.isEmpty()) {
            rePassword.setError("Field can't be empty");
            rePassword.requestFocus();
            return false;
        } else if (!RepasswordInput.equals(passwordInput)) {
            rePassword.setError("Password doesn't match");
            rePassword.requestFocus();
            return false;
        }

        else if (!PASSWORD_PATTERN.matcher(RepasswordInput).matches()) {
            rePassword.setError("Password too weak");
            rePassword.requestFocus();
            return false;
        }
        else{
            rePassword.setError(null);
            return true;
        }

    }


    public void proceed(View view) {
        if ( !phone() | !validatePassword() | !validateRePassword()) {
            return;
        }

        String input = "Password: " + password.getText().toString();
        input += "\n";
        input = "Phone " + phone.getText().toString();
        input += "\n";
        input = "Password: " + rePassword.getText().toString();



        Toast.makeText(getApplicationContext(),"Password Changed successfully",Toast.LENGTH_SHORT).show();
        Intent mainactivityIntent =  new Intent(getApplicationContext(),MainActivity.class);
        Toast.makeText(getApplicationContext(), "Once again Login with your New Password", Toast.LENGTH_LONG).show();
        startActivity(mainactivityIntent);
        finish();

    }
}