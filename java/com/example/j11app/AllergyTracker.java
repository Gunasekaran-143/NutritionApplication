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

        import android.widget.Toast;
        import androidx.appcompat.app.ActionBarDrawerToggle;
        import androidx.core.view.GravityCompat;
        import androidx.drawerlayout.widget.DrawerLayout;
        import com.google.android.material.navigation.NavigationView;

        import java.util.ArrayList;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;




public class AllergyTracker extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;

    private CheckBox checkBoxPeanut;
    private CheckBox checkBoxDairy;
    private CheckBox checkBoxGluten;
    private Button buttonSubmit;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allery_tracker);
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

        checkBoxPeanut = findViewById(R.id.checkBoxPeanut);
        checkBoxDairy = findViewById(R.id.checkBoxDairy);
        checkBoxGluten = findViewById(R.id.checkBoxGluten);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewResult = findViewById(R.id.textViewResult);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAllergies();
            }
        });
    }

    private void checkAllergies() {
        List<String> allergies = new ArrayList<>();

        if (checkBoxPeanut.isChecked()) {
            allergies.add("Peanut");
        }

        if (checkBoxDairy.isChecked()) {
            allergies.add("Dairy");
        }

        if (checkBoxGluten.isChecked()) {
            allergies.add("Gluten");
        }

        displayFoodList(allergies);
    }

    private void displayFoodList(List<String> allergies) {
        StringBuilder foodList = new StringBuilder();

        if (allergies.contains("Peanut")) {
            foodList.append("Avoid: Peanut Butter, Peanut Oil, Peanut Brittle\n");
        }

        if (allergies.contains("Dairy")) {
            foodList.append("Avoid: Milk, Cheese, Ice Cream\n");
        }

        if (allergies.contains("Gluten")) {
            foodList.append("Avoid: Wheat, Barley, Rye\n");
        }

        if (foodList.length() > 0) {
            textViewResult.setText("You have the following allergies:\n\n" + foodList.toString());
        } else {
            textViewResult.setText("You don't have any allergies.");
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
        if (id == R.id.nav_cal) {
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
            Intent intent1 = new Intent(getApplicationContext(), HomeActivity.class);
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
