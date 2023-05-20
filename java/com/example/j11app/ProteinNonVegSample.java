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

public class ProteinNonVegSample  extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;


    ListView listView;
    String[] proteinList = {"1 Chicken breast", "2 Shrimps","3 Egg Whites",
            "4 Chicken liver", "5 Salmon",
            "6 Sardines", "7 Halibut", "8 Anchovies", "9 Cod fillet/Gobro",
            "10 Tuna", "11 Prawns"};
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
            public void onItemClick (AdapterView < ? > adapterView, View view, int i, long l){
                if (i == 0) {
                    //custom alert dialog to display the nutrition
                    final Dialog dialog = new Dialog(context);
                    dialog.setContentView(R.layout.custom_protein);
                    Button btn = (Button) dialog.findViewById(R.id.dialog);
                    TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
                    foodName.setText(proteinList[i]);
                    protein.setText("Protein Content - 23.5gm");
                    calorie.setText("Calorie Content - 195Kcal");
                    diet.setText("Diet-Simply baked and lightly seasoned, soup, stew, curry");
                    proContent.setText("Chicken breast is the most sought after piece for making fried chicken appetizers or soup." +
                            "\nIt is loaded with fiber, potassium, cholesterol, and proteins and does not have carbs.");
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
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    foodName.setText(proteinList[i]);
                    protein.setText("Protein Content- 18.4gm");
                    calorie.setText("Calorie Content - 100Kcal");
                    diet.setText("Diet - Grilled or baked with seasoning, pasta");
                    proContent.setText("Shrimp is a rich source of antioxidants and promotes heart health. ");
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
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);

                    foodName.setText(proteinList[i]);
                    protein.setText("Protein Content - 11gm");
                    calorie.setText("Calorie Content - 52Kcal");
                    diet.setText("Diet - Boiled, scrambled, souffle");
                    proContent.setText("Egg whites are the most preferred over egg yolk as they do not have cholesterol and are loaded with essential minerals like potassium and sodium.");
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
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
                    foodName.setText(proteinList[i]);
                    protein.setText("Protein Content - 24gm");
                    calorie.setText("Calorie Content - 167Kcal");
                    diet.setText("Diet - Fried, roasted and seasoned with spices");
                    proContent.setText("Chicken livers are also packed with a basket of nutrients including antioxidants, fats, and cholesterol.");
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
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    foodName.setText(proteinList[i]);
                    protein.setText("Protein Content- 23gm");
                    calorie.setText("Calorie Content - 200Kcal");
                    diet.setText("Diet - baked and seasoned with spices");
                    proContent.setText("Salmon or fondly called ‘Rawas’ is a seawater fish that is known to occur in the coastal waters of Maharashtra and Gujarat.");
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
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    foodName.setText(proteinList[i]);
                    proContent.setText("Sardines are also known as ‘Pedve’ is again a seawater fish, popular in the konkan belt of the country and along the coasts of the state of Kerala.");
                    protein.setText("Protein Content - 25gm");
                    calorie.setText("Calorie Content - 208Kcal");
                    diet.setText("Diet - Grilled and fried, baked and seasoned with spices, used in tacos and pasta");
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
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
                    foodName.setText(proteinList[i]);
                    protein.setText("Protein Content - 27gm");
                    calorie.setText("Calorie Content - 140Kcal");
                    diet.setText("Diet - grilled and seasoned with spices");
                    proContent.setText("Halibut is also known as ‘bakas’ are ocean fishes that are usually found in the shores of the great Pacific and Atlantic oceans.");
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
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    foodName.setText(proteinList[i]);
                    protein.setText("Protein Content - 29gm");
                    calorie.setText("Calorie Content - 210Kcal");
                    diet.setText("Diet - salads, roasted and spiced");
                    proContent.setText("Anchovies are also known as ‘kati’, they contain the highest amount of omega-3fatty acids along with calcium, iron, and phosphorus." +
                            "\nIt reduces the risk of heart disease, lowers blood pressure and helps relieve any kind of menstrual pain and discomfort.");
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
                    TextView foodName = (TextView)dialog.findViewById(R.id.foodName);
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
                    foodName.setText(proteinList[i]);
                    protein.setText("Protein Content - 17gm");
                    calorie.setText("Calorie Content - 97Kcal");
                    diet.setText("Diet - crispy fried, baked and seasoned");
                    proContent.setText("Cod is popularly known as ‘gobro’ and is rich in vitamins and essential minerals, especially vitamin D. " +
                            "\nIt helps enrich bone health and regulate body metabolism.");
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
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
                    foodName.setText(proteinList[i]);
                    protein.setText("Protein Content- 23.8gm");
                    calorie.setText("Calorie Content - 108Kcal");
                    diet.setText("Diet - patties, pasta");
                    proContent.setText("Tuna or locally known as ‘chura’ is one of the most nutritious seafood and is packed with the goodness of omega 3 fatty acids and helps in weight loss, repairs immune function, provides a healthy heart and prevents the risk of cancer.");
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
                    TextView protein = (TextView)dialog.findViewById(R.id.protein);
                    TextView calorie = (TextView)dialog.findViewById(R.id.calorie);
                    TextView diet = (TextView)dialog.findViewById(R.id.diet);
                    TextView proContent = (TextView)dialog.findViewById(R.id.proContent);
                    foodName.setText(proteinList[i]);
                    protein.setText("Protein Content- 17gm");
                    calorie.setText("Calorie Content - 99Kcal");
                    diet.setText("Diet - dry roasted, baked and seasoned");
                    proContent.setText("Prawns are locally more popular as ‘jhinga’ , and are mostly savoured in the southern coasts of Karnataka, Kerala and Andhra Pradesh. " +
                            "\nIt is loaded with high concentrations of zinc, magnesium, and phosphorus and helps improve immune functions.");
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