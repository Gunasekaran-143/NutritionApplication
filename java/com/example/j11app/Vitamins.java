package com.example.j11app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class Vitamins  extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Button vitA,vitB1,vitB2,vitB5,vitB6,vitB12,vitC,vitD,vitE,vitK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamins);

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

        vitA = (Button) findViewById(R.id.vitA);
        vitB1 = (Button) findViewById(R.id.vitB1);
        vitB2 = (Button) findViewById(R.id.vitB2);
        vitB5 = (Button) findViewById(R.id.vitB5);
        vitB6 = (Button) findViewById(R.id.vitB6);
        vitB12 = (Button) findViewById(R.id.vitB12);
        vitC = (Button) findViewById(R.id.vitC);
        vitD = (Button) findViewById(R.id.vitD);
        vitE = (Button) findViewById(R.id.vitE);
        vitK = (Button) findViewById(R.id.vitK);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        vitA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new SimpleFragment1());

            }
        });

        vitB1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                com.example.j11app.vitB1 vitB1 = new vitB1();
                fragmentTransaction.replace(R.id.frameLayout, vitB1);
                fragmentTransaction.commit();
            }
        });
        vitB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.j11app.vitB2 vitB2 = new vitB2();
                fragmentTransaction.replace(R.id.frameLayout, vitB2);
                fragmentTransaction.commit();
            }
        });
        vitB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.j11app.vitB5 vitB5 = new vitB5();
                fragmentTransaction.replace(R.id.frameLayout, vitB5);
                fragmentTransaction.commit();
            }
        });
        vitB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.j11app.vitB6 vitB6 = new vitB6();
                fragmentTransaction.replace(R.id.frameLayout, vitB6);
                fragmentTransaction.commit();
            }
        });
        vitB12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.j11app.vitB12 vitB12 = new vitB12();
                fragmentTransaction.replace(R.id.frameLayout, vitB12);
                fragmentTransaction.commit();
            }
        });
        vitC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.j11app.vitC vitC = new vitC();
                fragmentTransaction.replace(R.id.frameLayout, vitC);
                fragmentTransaction.commit();

            }
        });
        vitD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.j11app.vitD vitD = new vitD();
                fragmentTransaction.replace(R.id.frameLayout, vitD);
                fragmentTransaction.commit();
            }
        });
        vitE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.j11app.vitE vitE = new vitE();
                fragmentTransaction.replace(R.id.frameLayout, vitE);
                fragmentTransaction.commit();
            }
        });
        vitK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.example.j11app.vitK vitK= new vitK();
                fragmentTransaction.replace(R.id.frameLayout, vitK);
                fragmentTransaction.commit();
            }
        });
    }
        private void loadFragment(Fragment fragment) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fragmentTransaction.replace(R.id.frameLayout, fragment);
            fragmentTransaction.commit();
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