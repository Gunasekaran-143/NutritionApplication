package com.example.j11app;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.LinearLayout;
        import android.widget.ProgressBar;
        import android.widget.Spinner;
        import android.widget.TextView;
        import android.widget.Toast;
        import androidx.appcompat.app.ActionBarDrawerToggle;
        import androidx.core.view.GravityCompat;
        import androidx.drawerlayout.widget.DrawerLayout;
        import com.google.android.material.navigation.NavigationView;

        public class  InfantActivity   extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    LinearLayout linearLayout,linearLayout2;
        int progressBarValue = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infant);

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


        Spinner spinner = (Spinner) findViewById(R.id.infantList);
        linearLayout = (LinearLayout) findViewById(R.id.infantLinearLayout);
        linearLayout2 = (LinearLayout) findViewById(R.id.linearLayout2);

        TextView textView = (TextView) findViewById(R.id.txtView);
        TextView textView2 = (TextView) findViewById(R.id.txtView2);
        TextView textView3 = (TextView) findViewById(R.id.txtView3);

        TextView contentHead = (TextView) findViewById(R.id.contentHead);
        TextView content = (TextView) findViewById(R.id.content);
        TextView content1 = (TextView) findViewById(R.id.content1);
        TextView content2 = (TextView) findViewById(R.id.content2);
        TextView content3 = (TextView) findViewById(R.id.content3);

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        ProgressBar progressBar1 = (ProgressBar) findViewById(R.id.progressBar1);
        ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);

        TextView topic = (TextView)findViewById(R.id.topic);
             linearLayout.setVisibility(View.VISIBLE);
                topic.setText("Foods for Infants");
                 progressBarValue = progressBar.getProgress();
                new Thread(new Runnable() {
                    public void run() {
                        while (progressBarValue < 15) {
                            progressBarValue += 1;
                            handler.post(new Runnable() {
                                public void run() {
                                    progressBar.setProgress(progressBarValue);
                                    textView.setText(progressBarValue + "%");
                                }
                            });
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();

                progressBarValue = progressBar1.getProgress();
                new Thread(new Runnable() {
                    public void run() {
                        while (progressBarValue < 55) {
                            progressBarValue += 1;
                            handler.post(new Runnable() {
                                public void run() {
                                    progressBar1.setProgress(progressBarValue);
                                    textView2.setText(progressBarValue + "%");
                                }
                            });
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();

                progressBarValue = progressBar2.getProgress();
                new Thread(new Runnable() {
                    public void run() {
                        while (progressBarValue < 51) {
                            progressBarValue += 1;
                            handler.post(new Runnable() {
                                public void run() {
                                    progressBar2.setProgress(progressBarValue);
                                    textView3.setText(progressBarValue + "%");
                                }
                            });
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();


                String[] foodList = {"Click here to view the list", "Breast milk", "Fruits", "Juices", "Cereals and other starchy foods",
                        "Meat, poultry, eggs, fish, cooked dried beans, peanut butter", "Plain yogurt", "Water"};
                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, foodList);
                spinner.setAdapter(adapter);
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        if (i == 0) {
                            //default-ly selected by the spinner
                        //    Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();

                        } else if (i == 1) {
                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
                            contentHead.setText(foodList[i]);
                            content.setText("0-3 months  ---- 18-32 ounces");
                            content1.setText("4-6 months ---- 28-40 ounces");
                            content2.setText("7-9 months --- 24-36 ounces");
                            content3.setText("10-12 months --- 18-30 ounces");
                        } else if (i == 2) {
                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
                            contentHead.setText(foodList[i]);
                            content.setText("0-3 months  ---- None");
                            content1.setText("4-6 months ---- 1/4-1/2 cup, pureed");
                            content2.setText("7-12 months --- 1/2-1 cup pureed, canned, or soft fresh fruits, such as bananas");
                        } else if (i == 3) {
                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
                            contentHead.setText(foodList[i]);
                            content.setText("0-4 months  ---- None");
                            content1.setText("5-8 months ---- 1/4-1/2 cup");
                            content2.setText("9-12 months --- 1/2");
                        } else if (i == 4) {
                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
                            contentHead.setText(foodList[i]);
                            content.setText("0-3 months  ---- None");
                            content1.setText("4-6 months ---- 1/4-1/2 cup cereal (mixed)");
                            content2.setText("7-9 months --- 1-2 1/2 cup servings, including mashed potatoes, pasta, rice, breads, crackers, toast, rolls, soft muffins");
                            content3.setText("10-12 months --- 3-4 1/2 cup servings");
                        } else if (i == 5) {
                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
                            contentHead.setText(foodList[i]);
                            content.setText("0-5 months  ---- None");
                            content1.setText("6-8 months ---- 1-2 Tbsp pureed");
                            content2.setText("9-12 months --- 1/4-1/2 cup (include cottage and regular cheese, fish, eggs, small pieces of tender meats, or chopped meats.)");
                        } else if (i == 6) {
                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
                            contentHead.setText(foodList[i]);
                            content.setText("0-5 months  ---- None");
                            content1.setText("6-12 months ---- 1-2 Tbsp/day after 6 months of age");

                        } else if (i == 7) {
                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
                            contentHead.setText(foodList[i]);
                            content.setText("0-5 months  ---- None");
                            content1.setText("6-12 months ---- As often as infant will drink");
                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
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

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}