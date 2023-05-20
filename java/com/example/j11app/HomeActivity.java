package com.example.j11app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;  //tie together the functionality of DrawerLayout and the framework ActionBar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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
                drawerLayout,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState(); // will synchronize the drawer icon that rotates when the drawer is swiped
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView = findViewById(R.id.nav);
        navigationView.setNavigationItemSelectedListener(this);

        ListView listView = (ListView) findViewById(R.id.listview);

        String[] category = {"Age wise food","Diet Foods", "              Carbohydrate rich Foods","Fruits",
                "Protein rich Foods",//"Poultry products",
                  "Vitamins"};
        Integer[] pic = {R.drawable.agewisee,R.drawable.deitpage,R.drawable.carrbo,
                R.drawable.fruitt,//R.drawable.pregnancy,
                R.drawable.pro,//R.drawable.poultry1,
                 R.drawable.vitt}; //R.drawable.weight_gain};
       // ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, category);
        HomePageList adapter = new HomePageList(this,category,pic);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              //  Toast.makeText(getApplicationContext(), category[i] + " category is selected ", Toast.LENGTH_SHORT).show();
                if (i == 0) {
                     Intent intent = new Intent(getApplicationContext(), AgeWiseFood.class);
                    startActivity(intent);


                } else if (i == 1) {
                     Intent intent = new Intent(getApplicationContext(), DietFoodActivity.class);
                    startActivity(intent);
                } else if (i == 2) {
                     Intent intent = new Intent(getApplicationContext(), CarbActivity.class);
                    startActivity(intent);

                } else if (i == 3) {

                     Intent intent = new Intent(getApplicationContext(), FruitsActivity.class);
                    startActivity(intent);
                }
//                else if (i == 4) {
//                    Toast.makeText(getApplicationContext(), category[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(getApplicationContext(), PregnancyFoods.class);
//                    startActivity(intent);
//                }
                else if (i == 4) {

                     Intent intent = new Intent(getApplicationContext(), ProteinRichFoods.class);
                    startActivity(intent);


                }
//                else if (i == 6) {
//                    Toast.makeText(getApplicationContext(), category[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(getApplicationContext(), Poultry.class);
//                    startActivity(intent);
//                }
                else if (i == 5) {
                     Intent intent = new Intent(getApplicationContext(), Vitamins.class);
                    startActivity(intent);
                }

            }
        });
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
        else if (id == R.id.nav_dietChart) {
            Intent intent1 = new Intent(getApplicationContext(), DietChartActivity.class);
            startActivity(intent1);
        }


        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}