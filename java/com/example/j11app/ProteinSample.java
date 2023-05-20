package com.example.j11app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class ProteinSample  extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;

    ListView listView;
    String[] proteinList = {"1 Lentils", "2 Edamame Beans", "3 Green peas", "4 Black beans",
            "5 Black-eyed beans", "6 Baked beans", "7 Vital wheat gluten",
            "8 ChickPeas", "9 Quinoa", "10 Navy Beans", "11 Chia seeds"};
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein_sample);

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
        listView = (ListView) findViewById(R.id.proteinList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_expandable_list_item_1, proteinList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()

    {
        @Override
        public void onItemClick (AdapterView < ? > adapterView, View view,int i, long l){
        if (i == 0) {
            //custom alert dialog to display the nutrition
           final Dialog dialog = new Dialog(context);
           dialog.setContentView(R.layout.custom_protein);
           Button btn = (Button) dialog.findViewById(R.id.dialog);
           TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
           TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
           TextView diet = (TextView)dialog.findViewById(R.id.diet);
            TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);foodName.setText(proteinList[i]);
            calorie.setText("Calorie Content - 115Kcal");
            diet.setText("Diet - Simply baked and lightly seasoned, soup, stew, curry");
            protein.setText("Protein Content - 9gm");
            proContent.setText("Lentils or locally known as ‘masoor ki dal’ are lens-shaped seeds, are rich in dietary fiber like any other pulse seed and are known to greatly benefit the heart health and improve blood sugar levels in the body.");
            btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   dialog.dismiss();
               }
           });
           dialog.show();

                }
        else if (i == 1) {
            //Toast.makeText(getApplicationContext(), proteinList[i] + " category is selected ", Toast.LENGTH_SHORT).show();
           // proteinLinear.setVisibility(View.VISIBLE);

//custom alert dialog to display the nutrition
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom_protein);
            Button btn = (Button) dialog.findViewById(R.id.dialog);
            TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
            TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
            TextView diet = (TextView)dialog.findViewById(R.id.diet);
            TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);
            foodName.setText(proteinList[i]);
            calorie.setText("Calorie Content - 112Kcal");
            diet.setText("Diet - Roasted and lightly seasoned, hummus, salad");
            protein.setText("Protein Content - 11gm");
            proContent.setText("Fondly known as ‘bakla ki fali’ in the local markets and stores and is known to relieve as well as prevent the occurrence of prostate cancer, cardiovascular diseases, age-related brain diseases, and inflammation.");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();
        }
        else if (i == 2) {
           // Toast.makeText(getApplicationContext(), proteinList[i] + " category is selected ", Toast.LENGTH_SHORT).show();
          // proteinLinear.setVisibility(View.VISIBLE);
                  final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom_protein);
            Button btn = (Button) dialog.findViewById(R.id.dialog);
            TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
            TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
            TextView diet = (TextView)dialog.findViewById(R.id.diet);
            TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);foodName.setText(proteinList[i]);
            calorie.setText("Calorie Content - 84Kcal");
            diet.setText("Diet - cutlets, sandwiches, soup");
            protein.setText("Protein Content - 5gm");
            proContent.setText("Green peas or our very own ‘matar’ is not just significant because it gave us the knowledge of the very cherished, Mendelian genetics and heredity but also because it can easily be incorporated in any dish, be it salads, sandwiches, burger patties or the vegetarian delight ‘matar paneer’.");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();

        }else if (i == 3) {
            //Toast.makeText(getApplicationContext(), proteinList[i] + " category is selected ", Toast.LENGTH_SHORT).show();
           // proteinLinear.setVisibility(View.VISIBLE);
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom_protein);
            Button btn = (Button) dialog.findViewById(R.id.dialog);
            TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
            TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
            TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            TextView diet = (TextView)dialog.findViewById(R.id.diet);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);foodName.setText(proteinList[i]);
            calorie.setText("Calorie Content - 132Kcal");
            diet.setText("Diet - burritos, salads");
            protein.setText("Protein Content - 9gm");
            proContent.setText("Black beans or popularly known as ‘urad ki dal’ is the most sought after option when making ‘dal makhani’ and mostly used for making south Indian delicacies like dosa, idli or medu vada. These seeds are instrumental in maintaining healthy bones, managing diabetes, combating heart disease and aids in digestion.");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();
        }else if (i == 4) {
//            Toast.makeText(getApplicationContext(), proteinList[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//            proteinLinear.setVisibility(View.VISIBLE);
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom_protein);
            Button btn = (Button) dialog.findViewById(R.id.dialog);
            TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
            TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
            TextView diet = (TextView)dialog.findViewById(R.id.diet);
            TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);foodName.setText(proteinList[i]);
            protein.setText("Protein Content - 8gm");
            proContent.setText("Commonly known as ‘ Chawli or Lobia’, black-eyed beans make a good choice for curries that are eaten with a hot bowl of rice. Black-eyed beans are known to promote digestive health and support weight loss.");
            calorie.setText("Calorie Content - 115Kcal");
            diet.setText("Diet - Curry");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();

        }else if (i == 5) {
//            Toast.makeText(getApplicationContext(), proteinList[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//            proteinLinear.setVisibility(View.VISIBLE);
             final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom_protein);
            Button btn = (Button) dialog.findViewById(R.id.dialog);
            TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
            TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
            TextView diet = (TextView)dialog.findViewById(R.id.diet);
            TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);
            foodName.setText(proteinList[i]);
            calorie.setText("Calorie Content - 105Kcal");
            diet.setText("Diet - Salad,Tacos");
            protein.setText("Protein Content - 5gm");
            proContent.setText("It is a good plant-based protein, rich in minerals like zinc and selenium. Baked beans provide energy and highly improve thyroid health and immune function.");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();

        }else if (i == 6) {
//            Toast.makeText(getApplicationContext(), proteinList[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//            proteinLinear.setVisibility(View.VISIBLE);
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom_protein);
            Button btn = (Button) dialog.findViewById(R.id.dialog);
            TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
            TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
            TextView diet = (TextView)dialog.findViewById(R.id.diet);
            TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);
            foodName.setText(proteinList[i]);
            protein.setText("Protein Content- 75gm ");
            calorie.setText("Calorie Content - 370Kcal");
            diet.setText("Diet - Seitan");
            proContent.setText("It is a natural protein found in wheat, which is nearly gluten and almost no starch. It is used as an additive in baking and improves the rise in raw dough, texture and chewiness of the final product.");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();
        }else if (i == 7) {
//            Toast.makeText(getApplicationContext(), proteinList[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//            proteinLinear.setVisibility(View.VISIBLE);
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom_protein);
            Button btn = (Button) dialog.findViewById(R.id.dialog);
            TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
            TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
            TextView diet = (TextView)dialog.findViewById(R.id.diet);
            TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);foodName.setText(proteinList[i]);
            calorie.setText("Calorie Content - 164Kcal");
            diet.setText("Diet - curry");
            protein.setText("Protein Content- 9gm");
            proContent.setText("The first picture that comes to your mind when one thinks of chickpeas, also known as ‘chana’ or ‘chole’, is usually a plate of spicy chole and neatly cooked giant-sized ‘bhature’. But chickpeas is not just a one-time appealing snack item but provides benefits like good bone health, cholesterol, prevention of anaemia and management of diabetes in the long run.");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();

        }else if (i == 8) {
//            Toast.makeText(getApplicationContext(), proteinList[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//            proteinLinear.setVisibility(View.VISIBLE);
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom_protein);
            Button btn = (Button) dialog.findViewById(R.id.dialog);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
            TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
            TextView diet = (TextView)dialog.findViewById(R.id.diet);
            foodName.setText(proteinList[i]);
            calorie.setText("Calorie Content - 120Kcal");
            diet.setText("Diet- salads, upma, soup, pulao");
            protein.setText("Protein Content- 4gm");
            proContent.setText("Quinoa is known to be gluten-free, rich in protein and loaded with minerals. " +
                    "\n It helps maintain low blood sugar levels and boosts metabolism.\n");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();

        }else if (i == 9) {
//            Toast.makeText(getApplicationContext(), proteinList[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//            proteinLinear.setVisibility(View.VISIBLE);
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom_protein);
            Button btn = (Button) dialog.findViewById(R.id.dialog);
            TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
            TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
            TextView diet = (TextView)dialog.findViewById(R.id.diet);
            TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);foodName.setText(proteinList[i]);
            calorie.setText("Calorie Content - 67Kcal");
            diet.setText("Diet-salads, soup, hummus");
            protein.setText("Protein Content- 6gm");
            proContent.setText("Navy beans or commonly known as ‘white rajma’ are one of the most healthy seeds available for consumption. " +
                    "\nThey are rich in dietary fiber and packed with iron, potassium, which makes them capable of preventing heart disease, maintaining blood glucose levels, improving memory and also providing iron for energy.");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();
        }else if (i == 10) {
//            Toast.makeText(getApplicationContext(), proteinList[i] + " category is selected ", Toast.LENGTH_SHORT).show();
//            proteinLinear.setVisibility(View.VISIBLE);
            final Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.custom_protein);
            Button btn = (Button) dialog.findViewById(R.id.dialog);
            TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
            TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
            TextView diet = (TextView)dialog.findViewById(R.id.diet);
            TextView protein = (TextView)dialog.findViewById(R.id.protein);
            TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
            foodName.setText(proteinList[i]);
            protein.setText("Protein Content - 16gm");
            proContent.setText("Chia seeds or popularly known as ‘sabja seeds’ are fancy looking seeds that are mainly used in the preparation of juices or milkshake smoothies. " +
                    "\n Sabja is an excellent source of omega-3 fatty acid and is rich in iron and calcium. " +
                    "\n It helps maintain good heart health as well as prevents the incidence of stroke.");
            calorie.setText("Calorie Content - 490Kcal");
            diet.setText("Diet - pudding, grounded into smoothies, juices, and salads");
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                }
            });
            dialog.show();
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

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}