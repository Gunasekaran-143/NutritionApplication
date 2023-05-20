package com.example.j11app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class AgeWiseFood  extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;

Button infants,age2,age4,age9,age14;
LinearLayout linearLayout,linearLayout2;
ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_wise_food);

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
        infants = (Button) findViewById(R.id.infants);
        age2 = (Button) findViewById(R.id.age2);
        age4 = (Button) findViewById(R.id.age4);
        age9 = (Button) findViewById(R.id.age9);
        age14 = (Button) findViewById(R.id.age14);
//
//        //Spinner spinner = (Spinner) findViewById(R.id.infantList);
//        linearLayout = (LinearLayout) findViewById(R.id.infantLinearLayout);
//        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
//        linearLayout2 = (LinearLayout) findViewById(R.id.linearLayout2);
//
//        TextView textView = (TextView) findViewById(R.id.txtView);
//        TextView textView2 = (TextView) findViewById(R.id.txtView2);
//        TextView textView3 = (TextView) findViewById(R.id.txtView3);
//
//        TextView contentHead = (TextView) findViewById(R.id.contentHead);
//        TextView content = (TextView) findViewById(R.id.content);
//        TextView content1 = (TextView) findViewById(R.id.content1);
//        TextView content2 = (TextView) findViewById(R.id.content2);
//        TextView content3 = (TextView) findViewById(R.id.content3);
//
//        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
//        ProgressBar progressBar1 = (ProgressBar) findViewById(R.id.progressBar1);
//        ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);
//
//        TextView ageTxt = (TextView) findViewById(R.id.ageTxt);
//        TextView headerTxt = (TextView) findViewById(R.id.headerTxt);
//        TextView topic = (TextView)findViewById(R.id.topic);
//        imageView = (ImageView)findViewById(R.id.ageWiseImg);
//
//        String ageArray[] = {"Proteins", "Fruits", "Vegetables", "Grains", "Dairy"};
//        ListView listView = (ListView) findViewById(R.id.ageList);

        age2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AgeFood.class);
                startActivity(intent);
            }
        });
        infants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),InfantActivity.class);
                startActivity(intent);
            }
        });
       age4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Age4activity.class);
                startActivity(intent);
            }
        });
        age9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Age9Activity.class);
                startActivity(intent);
            }
        });
        age14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Age14Activity.class);
                startActivity(intent);
            }
        });

//        age9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                linearLayout.setVisibility(view.INVISIBLE);
//                linearLayout2.setVisibility(view.VISIBLE);
//                constraintLayout.setVisibility(View.INVISIBLE);
//                topic.setText("Foods for 9-13 years");
//                imageView.setVisibility(View.VISIBLE);
//
//                ArrayAdapter<String> age2Adp = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ageArray);
//                listView.setAdapter(age2Adp);
//                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                        Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//                        if (i == 0) {
//                            Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//
//                            listView.setVisibility(View.VISIBLE);
//                            headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
//                            ageTxt.setText("Pulses, chicken breast, soya nuggets, egg whites"
//                                    + "\n For Boys: 55gm\t\t\t\t For Girls: 55gm");
//
//                        } else if (i == 1) {
//                            Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//
//                            listView.setVisibility(View.VISIBLE);
//                            headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
//                            ageTxt.setText("Apples, bananas, seasonal fruits, papaya, watermelon"
//                                    + "\n For Boys: 1.5-2 cups\t\t\t\t For Girls: 1.5-2 cups");
//                        } else if (i == 2) {
//                            Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//
//                            listView.setVisibility(View.VISIBLE);
//                            headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
//                            ageTxt.setText("Potato, eggplant, ladies finger, radish, carrots, beets, yams, sweet potato, seasonal fresh vegetables"
//                                    + "\n For Boys: 1.5-2.5 cups\t\t\t\t For Girls: 1.5-2.5 cups");
//                        } else if (i == 3) {
//                            Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//
//                            listView.setVisibility(View.VISIBLE);
//                            headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
//                            ageTxt.setText("Rice, whole wheat, millets like jowar and bajra"
//                                    + "\n For Boys: 300gm\t\t\t\t For Girls: 300gm");
//                        } else if (i == 4) {
//                            Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//
//                            listView.setVisibility(View.VISIBLE);
//                            headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
//                            ageTxt.setText("Milk, curds, fresh cheese"
//                                    + "\n For Boys: 3cups\t\t\t\t For Girls: 3cups");
//                        }
//                    }
//                });
//            }
//        });
//
//        age14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                linearLayout.setVisibility(view.INVISIBLE);
//                linearLayout2.setVisibility(view.VISIBLE);
//                constraintLayout.setVisibility(View.INVISIBLE);
//                topic.setText("Foods for 14-18 years");
//                imageView.setVisibility(View.VISIBLE);
//
//                ArrayAdapter<String> age2Adp = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, ageArray);
//                listView.setAdapter(age2Adp);
//                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                        Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//                        if (i == 0) {
//                            Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//
//                            listView.setVisibility(View.VISIBLE);
//                            headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
//                            ageTxt.setText("Pulses, chicken breast, soya nuggets, egg whites"
//                                    + "\n For Boys: 70-80 gm\t\t\t\t For Girls: 65-70 gm");
//
//                        } else if (i == 1) {
//                            Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//
//                            listView.setVisibility(View.VISIBLE);
//                            headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
//                            ageTxt.setText("Apples, bananas, seasonal fruits, papaya, watermelon"
//                                    + "\n For Boys: 2-2.5 cups\t\t\t\t For Girls: 1.5-2 cups");
//                        } else if (i == 2) {
//                            Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//
//                            listView.setVisibility(View.VISIBLE);
//                            headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
//                            ageTxt.setText("Potato, eggplant, ladies finger, radish, carrots, beets, yams, sweet potato, seasonal fresh vegetables"
//                                    + "\n For Boys: 2.5-4 cups\t\t\t\t For Girls: 2.5-3 cups");
//                        } else if (i == 3) {
//                            Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//
//                            listView.setVisibility(View.VISIBLE);
//                            headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
//                            ageTxt.setText("Rice, whole wheat, millets like jowar and bajra"
//                                    + "\n For Boys: 400gm\t\t\t\t For Girls: 400gm");
//                        } else if (i == 4) {
//                            Toast.makeText(getApplicationContext(), ageArray[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//
//                            listView.setVisibility(View.VISIBLE);
//                            headerTxt.setText("The Food items under " + ageArray[i] + " are: ");
//                            ageTxt.setText("Milk, curds, fresh cheese"
//                                    + "\n For Boys: 3 cups\t\t\t\t For Girls: 3 cups");
//                        }
//                    }
//                });
//            }
//        });
//
//        infants.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//        Intent intent = new Intent(getApplicationContext(),AgeFood.class);
//        startActivity(intent);
//                linearLayout.setVisibility(View.VISIBLE);
//                constraintLayout.setVisibility(View.INVISIBLE);
//                topic.setText("Foods for Infants");
//                //imageView.setVisibility(View.VISIBLE);
//
//                progressBarValue = progressBar.getProgress();
//                new Thread(new Runnable() {
//                    public void run() {
//                        while (progressBarValue < 15) {
//                            progressBarValue += 1;
//                            handler.post(new Runnable() {
//                                public void run() {
//                                    progressBar.setProgress(progressBarValue);
//                                    textView.setText(progressBarValue + "%");
//                                }
//                            });
//                            try {
//                                Thread.sleep(100);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                }).start();
//
//                progressBarValue = progressBar1.getProgress();
//                new Thread(new Runnable() {
//                    public void run() {
//                        while (progressBarValue < 55) {
//                            progressBarValue += 1;
//                            handler.post(new Runnable() {
//                                public void run() {
//                                    progressBar1.setProgress(progressBarValue);
//                                    textView2.setText(progressBarValue + "%");
//                                }
//                            });
//                            try {
//                                Thread.sleep(100);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                }).start();
//
//                progressBarValue = progressBar2.getProgress();
//                new Thread(new Runnable() {
//                    public void run() {
//                        while (progressBarValue < 51) {
//                            progressBarValue += 1;
//                            handler.post(new Runnable() {
//                                public void run() {
//                                    progressBar2.setProgress(progressBarValue);
//                                    textView3.setText(progressBarValue + "%");
//                                }
//                            });
//                            try {
//                                Thread.sleep(100);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//                }).start();
//
//
//                String[] foodList = {"Click here to view the list", "Breast milk", "Fruits", "Juices", "Cereals and other starchy foods",
//                        "Meat, poultry, eggs, fish, cooked dried beans, peanut butter", "Plain yogurt", "Water"};
//                ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, foodList);
//                spinner.setAdapter(adapter);
//                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                    @Override
//                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                        Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
//                        if (i == 0) {
//                            //default-ly selected by the spinner
//                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
//
//                        } else if (i == 1) {
//                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
//                            contentHead.setText(foodList[i]);
//                            content.setText("0-3 months  ---- 18-32 ounces");
//                            content1.setText("4-6 months ---- 28-40 ounces");
//                            content2.setText("7-9 months --- 24-36 ounces");
//                            content3.setText("10-12 months --- 18-30 ounces");
//                        } else if (i == 2) {
//                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
//                            contentHead.setText(foodList[i]);
//                            content.setText("0-3 months  ---- None");
//                            content1.setText("4-6 months ---- 1/4-1/2 cup, pureed");
//                            content2.setText("7-12 months --- 1/2-1 cup pureed, canned, or soft fresh fruits, such as bananas");
//                        } else if (i == 3) {
//                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
//                            contentHead.setText(foodList[i]);
//                            content.setText("0-4 months  ---- None");
//                            content1.setText("5-8 months ---- 1/4-1/2 cup");
//                            content2.setText("9-12 months --- 1/2");
//                        } else if (i == 4) {
//                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
//                            contentHead.setText(foodList[i]);
//                            content.setText("0-3 months  ---- None");
//                            content1.setText("4-6 months ---- 1/4-1/2 cup cereal (mixed)");
//                            content2.setText("7-9 months --- 1-2 1/2 cup servings, including mashed potatoes, pasta, rice, breads, crackers, toast, rolls, soft muffins");
//                            content3.setText("10-12 months --- 3-4 1/2 cup servings");
//                        } else if (i == 5) {
//                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
//                            contentHead.setText(foodList[i]);
//                            content.setText("0-5 months  ---- None");
//                            content1.setText("6-8 months ---- 1-2 Tbsp pureed");
//                            content2.setText("9-12 months --- 1/4-1/2 cup (include cottage and regular cheese, fish, eggs, small pieces of tender meats, or chopped meats.)");
//                        } else if (i == 6) {
//                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
//                            contentHead.setText(foodList[i]);
//                            content.setText("0-5 months  ---- None");
//                            content1.setText("6-12 months ---- 1-2 Tbsp/day after 6 months of age");
//
//                        } else if (i == 7) {
//                            Toast.makeText(getApplicationContext(), foodList[i] + " foodList is selected ", Toast.LENGTH_SHORT).show();
//                            contentHead.setText(foodList[i]);
//                            content.setText("0-5 months  ---- None");
//                            content1.setText("6-12 months ---- As often as infant will drink");
//                        }
//                    }
//
//                    @Override
//                    public void onNothingSelected(AdapterView<?> adapterView) {
//                    }
//                });
     //}
     //   });
   // }

//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//        switch (item.getItemId()) {
//            case R.id.share:
//                Toast.makeText(getApplicationContext(), "Share menu selected", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.help:
//                Toast.makeText(getApplicationContext(), "Help menu selected", Toast.LENGTH_SHORT).show();
//                break;
//           case R.id.contact:
//                startActivity(new Intent(getApplicationContext()
//                        , AboutUs.class));
//                overridePendingTransition(0, 0);
//                break;
//            case R.id.rateUs:
//                startActivity(new Intent(getApplicationContext()
//                        , RatingPage.class));
//                overridePendingTransition(0, 0);
//                break;
//            case R.id.faq:
//                startActivity(new Intent(getApplicationContext()
//                        , FAQ.class));
//                overridePendingTransition(0, 0);
//            case R.id.logout:
//                startActivity(new Intent(getApplicationContext()
//                        , LogoutActivity.class));
//                overridePendingTransition(0, 0);
//                break;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
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
