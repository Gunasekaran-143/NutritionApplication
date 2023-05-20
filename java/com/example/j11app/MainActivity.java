package com.example.j11app;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity  extends AppCompatActivity {
    Button loginButton;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginButton = (Button) findViewById(R.id.button_login);
        name = findViewById(R.id.phone);
        // set full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }
    private boolean name()
    {
        String  nameInput = name.getText().toString().trim();
        if (nameInput.isEmpty()) {
            name.setError("Field can't be empty");
            name.requestFocus();
            return false;
        }
        else if(nameInput.equals("J11")){
            return true;
        }
        else{
            name.setError("Invalid");
            name.requestFocus();
            return false;
        }
    }

    //After Login moving to homepage
    public void newActivity(View view)
    {
        if (!name()) {
            return;
        }

       // Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT).show();
        Intent homeactivityIntent =  new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(homeactivityIntent);

        name.setText("");
    }
    }

