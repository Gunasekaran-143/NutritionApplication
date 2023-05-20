package com.example.j11app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class BMI_calc  extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    EditText height,weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calc);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        //mToolbar.setTitle(getString(R.string.app_name));
        mToolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_ios_new_24);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        drawerLayout = findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,
                drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView = findViewById(R.id.nav);
        navigationView.setNavigationItemSelectedListener(this);

        TextView content = (TextView)findViewById(R.id.content);
        height = (EditText) findViewById(R.id.height);
        weight = (EditText) findViewById(R.id.weight);
        Button calculate = (Button) findViewById(R.id.calculate);
        TextView res = (TextView)findViewById(R.id.result);
        TextView stage = (TextView)findViewById(R.id.stage);
       // ImageView img = (ImageView)findViewById(R.id.img);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkHeight()| !checkWeight()) {
                    return;
                }

                Double weightDouble = Double.parseDouble(weight.getText().toString());
                Double heightDouble = Double.parseDouble(height.getText().toString());
                Double height1 = (heightDouble / 100);
                Double bmi = (weightDouble / (height1 * height1));
                res.setText("Your BMI is: " + String.valueOf(bmi));
                res.setVisibility(View.VISIBLE);
                stage.setVisibility(View.VISIBLE);
               // img.setVisibility(View.VISIBLE);

                height.setVisibility(View.INVISIBLE);
                weight.setVisibility(View.INVISIBLE);
                calculate.setVisibility(View.INVISIBLE);
                content.setVisibility(View.INVISIBLE);

                if(bmi < 18.5)
                {
                    stage.setText("You are under weight!" +
                            "\n *  Get Quality sleep." + "\n\n *  Do not stress yourself" + "\n *  Use bigger plates and eat well"+
                            "\n *  Do not drink water before your meals");
                }
                else if(bmi >= 18.5 && bmi <= 25.1)
                {

                    stage.setText("You have a normal weight!" + "\n\n *  Have quality amount of sleep"
                            + "\n *  Eat healthy food like you do");
                }
                else if(bmi > 25)
                {
                    stage.setText("You are over weight!" + "\n\n *  Do exercises"+ "\n *  Do not get stressed" + "\n *  Eat protein rich foods"
                    +"\n *  Avoid sugars" + "\n *  Sleep well" + "\n *  Eat foods at the right time");
                }

            }
        });
            }
    private boolean checkHeight()
    {
        String  heightInput = height.getText().toString().trim();
        if (heightInput.isEmpty()) {
            height.setError("Field can't be empty");
            height.requestFocus();
            return false;
        }  else {
            height.setError(null);
            return true;
        }
    }
    private boolean checkWeight() {
        String weightInput = weight.getText().toString().trim();

        if (weightInput.isEmpty()) {
            weight.setError("Field can't be empty");
            weight.requestFocus();
            return false;
        }  else {
            weight.setError(null);
            return true;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) { //this line for 3 dots
            Toast.makeText(getApplicationContext(), "selected", Toast.LENGTH_SHORT).show();
            return true;
        }

        switch (item.getItemId()) {
           
                
             

            case R.id.logout:
                startActivity(new Intent(getApplicationContext()
                        , LogoutActivity.class));
                overridePendingTransition(0, 0);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if      (id == R.id.nav_cal) {
            Intent intent1 = new Intent(getApplicationContext(), BMI_calc.class);
            startActivity(intent1);
        }
        else if (id == R.id.nav_about) {
            Intent intent1 = new Intent(getApplicationContext(), AboutUs.class);
            startActivity(intent1);
        }
        else if (id == R.id.nav_home) {
            Intent intent1 = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent1);
        }
     else if (id == R.id.nav_allergy) {
            Intent intent1 = new Intent(getApplicationContext(), AllergyTracker.class);
            startActivity(intent1);
        }
        else if (id == R.id.nav_log) {
            Intent intent1 = new Intent(getApplicationContext(), LogoutActivity.class);
            startActivity(intent1);
        }  

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}