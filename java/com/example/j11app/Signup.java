

package com.example.j11app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import android.widget.Toast;


import java.util.regex.Pattern;

public class Signup  extends AppCompatActivity {
    Button signupButton;
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
    CheckBox chk;

    UserDetails userDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
userDetails =new UserDetails(this);
        signupButton = (Button) findViewById(R.id.signupBtn);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);
        rePassword = findViewById(R.id.reenterPassword);
        chk = (CheckBox)findViewById(R.id.chk);
        //sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);


        // set full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
    private boolean name() {
        String nameInput = name.getText().toString().trim();

        if (nameInput.isEmpty()) {
            name.setError("Field can't be empty");
            name.requestFocus();
            return false;
        } else if (nameInput.length() > 15) {
            name.setError("Username too long");
            name.requestFocus();
            return false;
        } else {
            name.setError(null);
            return true;
        }
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



    //After Signup moving to homepage
    public void signUp(View view) {
        if (!name() | !phone() | !validatePassword() | !validateRePassword()) {
            return;
        }


//
        String input1 = "Name: " + name.getText().toString();
//        input2 += "\n";
        String input2 = "Phone " + phone.getText().toString();
        String input3 = "Password: " + password.getText().toString();
//        input3 += "\n";
        String input4 = "Password: " + rePassword.getText().toString();
        boolean isInserted = userDetails.insertData(input1, input2, input3, input4);
        if (isInserted == true) {
            Toast.makeText(getApplicationContext(), "Registered successfully", Toast.LENGTH_SHORT).show();
            Intent homeactivityIntent = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(homeactivityIntent);
            finish();
        }
    }





}
