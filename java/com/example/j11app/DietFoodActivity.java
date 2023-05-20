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
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TableLayout;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class DietFoodActivity  extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;

    TableLayout tableLayout, tableLayout1, tableLayout2, tableLayout3, tableLayout4, tableLayout5,
            tableLayout6, tableLayout7;
    Button btn;
    LinearLayout day1Frag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_food);

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

        btn = (Button) findViewById(R.id.days);
        tableLayout = (TableLayout) findViewById(R.id.tableLayout);
        tableLayout1 = (TableLayout) findViewById(R.id.firstDay);
        tableLayout2 = (TableLayout) findViewById(R.id.secondDay);
        tableLayout3 = (TableLayout) findViewById(R.id.thirdDay);
        tableLayout4 = (TableLayout) findViewById(R.id.fourthDay);
        tableLayout5 = (TableLayout) findViewById(R.id.fifthDay);
        tableLayout6 = (TableLayout) findViewById(R.id.sixthDay);
        tableLayout7 = (TableLayout) findViewById(R.id.seventhDay);
        day1Frag = (LinearLayout) findViewById(R.id.day1Frag);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tableLayout.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.INVISIBLE);
//                tableLayout1.setVisibility(View.INVISIBLE);
//                tableLayout2.setVisibility(View.INVISIBLE);
//                tableLayout3.setVisibility(View.INVISIBLE);
//                tableLayout4.setVisibility(View.INVISIBLE);
//                tableLayout5.setVisibility(View.INVISIBLE);
//                tableLayout6.setVisibility(View.INVISIBLE);
//                tableLayout7.setVisibility(View.INVISIBLE);
                PopupMenu popup = new PopupMenu(DietFoodActivity.this, btn);
                //Inflating the Popup using xml file
                popup.getMenuInflater().inflate(R.menu.dietmenu, popup.getMenu());

                //registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
//                        Toast.makeText(DietFoodActivity.this,"You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
//                        return true;
                        switch (item.getItemId()) {
                            case R.id.day1:
                                firstDay(view);

                                break;

                            case R.id.day2:
                                secondDay(view);

                                break;

                            case R.id.day3:
                                thirdDay(view);

                                break;

                            case R.id.day4:
                                fourthDay(view);

                                break;

                            case R.id.day5:
                                fifthDay(view);

                                break;

                            case R.id.day6:
                                sixthDay(view);

                                break;

                            case R.id.day7:
                                seventhDay(view);

                                break;


                        }
                        return true;
                    }

                });
                popup.show();
            }
        });
    }

    public void firstDay(View view) {
        Toast.makeText(this, "Diet food for DAY 1", Toast.LENGTH_SHORT).show();

        tableLayout.setVisibility(View.INVISIBLE);
        tableLayout1.setVisibility(View.VISIBLE);
        tableLayout2.setVisibility(View.INVISIBLE);
        tableLayout3.setVisibility(View.INVISIBLE);
        tableLayout4.setVisibility(View.INVISIBLE);
        tableLayout5.setVisibility(View.INVISIBLE);
        tableLayout6.setVisibility(View.INVISIBLE);
        tableLayout7.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.VISIBLE);

        //day1Frag.setVisibility(View.VISIBLE);


    }

    public void secondDay(View view) {
        Toast.makeText(this, "Diet food for DAY 2", Toast.LENGTH_SHORT).show();
        tableLayout.setVisibility(View.INVISIBLE);
        tableLayout1.setVisibility(View.INVISIBLE);
        tableLayout2.setVisibility(View.VISIBLE);
        tableLayout3.setVisibility(View.INVISIBLE);
        tableLayout4.setVisibility(View.INVISIBLE);
        tableLayout5.setVisibility(View.INVISIBLE);
        tableLayout6.setVisibility(View.INVISIBLE);
        tableLayout7.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.VISIBLE);
      //  day1Frag.setVisibility(View.VISIBLE);

    }

    public void thirdDay(View view) {
        Toast.makeText(this, "Diet food for DAY 3", Toast.LENGTH_SHORT).show();
        tableLayout.setVisibility(View.INVISIBLE);
        tableLayout1.setVisibility(View.INVISIBLE);
        tableLayout2.setVisibility(View.INVISIBLE);
        tableLayout3.setVisibility(View.VISIBLE);
        tableLayout4.setVisibility(View.INVISIBLE);
        tableLayout5.setVisibility(View.INVISIBLE);
        tableLayout6.setVisibility(View.INVISIBLE);
        tableLayout7.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.VISIBLE);
       // day1Frag.setVisibility(View.VISIBLE);
    }

    public void fourthDay(View view) {
        Toast.makeText(this, "Diet food for DAY 4", Toast.LENGTH_SHORT).show();
        tableLayout.setVisibility(View.INVISIBLE);
        tableLayout1.setVisibility(View.INVISIBLE);
        tableLayout2.setVisibility(View.INVISIBLE);
        tableLayout3.setVisibility(View.INVISIBLE);
        tableLayout4.setVisibility(View.VISIBLE);
        tableLayout5.setVisibility(View.INVISIBLE);
        tableLayout6.setVisibility(View.INVISIBLE);
        tableLayout7.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.VISIBLE);
        //day1Frag.setVisibility(View.VISIBLE);
    }

    public void fifthDay(View view) {
        Toast.makeText(this, "Diet food for DAY 5", Toast.LENGTH_SHORT).show();
        tableLayout.setVisibility(View.INVISIBLE);
        tableLayout1.setVisibility(View.INVISIBLE);
        tableLayout2.setVisibility(View.INVISIBLE);
        tableLayout3.setVisibility(View.INVISIBLE);
        tableLayout4.setVisibility(View.INVISIBLE);
        tableLayout5.setVisibility(View.VISIBLE);
        tableLayout6.setVisibility(View.INVISIBLE);
        tableLayout7.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.VISIBLE);
        //day1Frag.setVisibility(View.VISIBLE);
    }

    public void sixthDay(View view) {
        Toast.makeText(this, "Diet food for DAY 6", Toast.LENGTH_SHORT).show();
        tableLayout.setVisibility(View.INVISIBLE);
        tableLayout1.setVisibility(View.INVISIBLE);
        tableLayout2.setVisibility(View.INVISIBLE);
        tableLayout3.setVisibility(View.INVISIBLE);
        tableLayout4.setVisibility(View.INVISIBLE);
        tableLayout5.setVisibility(View.INVISIBLE);
        tableLayout6.setVisibility(View.VISIBLE);
        tableLayout7.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.VISIBLE);
       // day1Frag.setVisibility(View.VISIBLE);
    }

    public void seventhDay(View view) {
        Toast.makeText(this, "Diet food for DAY 7", Toast.LENGTH_SHORT).show();
        tableLayout.setVisibility(View.INVISIBLE);
        tableLayout1.setVisibility(View.INVISIBLE);
        tableLayout2.setVisibility(View.INVISIBLE);
        tableLayout3.setVisibility(View.INVISIBLE);
        tableLayout4.setVisibility(View.INVISIBLE);
        tableLayout5.setVisibility(View.INVISIBLE);
        tableLayout6.setVisibility(View.INVISIBLE);
        tableLayout7.setVisibility(View.VISIBLE);
        btn.setVisibility(View.VISIBLE);
       // day1Frag.setVisibility(View.VISIBLE);
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