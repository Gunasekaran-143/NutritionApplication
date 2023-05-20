package com.example.j11app;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.ActionBarDrawerToggle;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;
        import androidx.constraintlayout.widget.ConstraintLayout;
        import androidx.core.view.GravityCompat;
        import androidx.drawerlayout.widget.DrawerLayout;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.google.android.material.navigation.NavigationView;

public class Age4activity  extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Button age4;
    LinearLayout linearLayout, linearLayout2;
    ConstraintLayout constraintLayout;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age4activity);

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
        age4 = (Button) findViewById(R.id.age4);


        linearLayout = (LinearLayout) findViewById(R.id.infantLinearLayout);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        linearLayout2 = (LinearLayout) findViewById(R.id.linearLayout2);

        TextView ageTxt = (TextView) findViewById(R.id.ageTxt);
        TextView headerTxt = (TextView) findViewById(R.id.headerTxt);
        TextView topic = (TextView) findViewById(R.id.topic);
        imageView = (ImageView) findViewById(R.id.ageWiseImg);

        String ageArray[] = {"Proteins", "Fruits", "Vegetables", "Grains", "Dairy"};
        ListView listView = (ListView) findViewById(R.id.ageList);

        topic.setText("Foods for 4-8 years");
        imageView.setVisibility(View.VISIBLE);

        ArrayAdapter<String> age2Adp = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ageArray);
        listView.setAdapter(age2Adp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
                if (i == 0) {
                    Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();

                    listView.setVisibility(View.VISIBLE);
                    headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
                    ageTxt.setText("Pulses, chicken breast, soya nuggets, egg whites"
                            + "\n For Boys: 30-40 gm\t\t\t\t For Girls: 30-40 gm");

                } else if (i == 1) {
                    Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();

                    listView.setVisibility(View.VISIBLE);
                    headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
                    ageTxt.setText("Apples, bananas, seasonal fruits, papaya, watermelon"
                            + "\n For Boys: 1-1.5 cups\t\t\t\t For Girls: 1-2 cups");
                } else if (i == 2) {
                    Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();

                    listView.setVisibility(View.VISIBLE);
                    headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
                    ageTxt.setText("Potato, eggplant, ladies finger, radish, carrots, beets, yams, sweet potato, seasonal fresh vegetables"
                            + "\n For Boys: 1.5-2.5 cups\t\t\t\t For Girls: 1.5-2.5 cups");
                } else if (i == 3) {
                    Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
                    listView.setVisibility(View.VISIBLE);
                    headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
                    ageTxt.setText("Rice, whole wheat, millets like jowar and bajra"
                            + "\n For Boys: 250gm\t\t\t\t For Girls: 250gm");
                } else if (i == 4) {
                    Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
                    listView.setVisibility(View.VISIBLE);
                    headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
                    ageTxt.setText("Milk, curds, fresh cheese"
                            + "\n For Boys: 2.5 cups\t\t\t\t For Girls: 2.5 cups");
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
        } else if (id == R.id.nav_about) {
            Intent intent1 = new Intent(getApplicationContext(), AboutUs.class);
            startActivity(intent1);
        } else if (id == R.id.nav_home) {
            Intent intent1 = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(intent1);
        }     else if (id == R.id.nav_log) {
            Intent intent1 = new Intent(getApplicationContext(), LogoutActivity.class);
            startActivity(intent1);
        }  

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}