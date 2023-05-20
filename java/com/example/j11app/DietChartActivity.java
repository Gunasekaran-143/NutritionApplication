package com.example.j11app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DietChartActivity extends AppCompatActivity {

    private EditText ageEditText;
    private EditText weightEditText;
    private Button generateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_chart);

        ageEditText = findViewById(R.id.editTextAge);
        weightEditText = findViewById(R.id.editTextWeight);
        generateButton = findViewById(R.id.buttonGenerate);
        resultTextView = findViewById(R.id.textViewResult);

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateDietChart();
            }
        });
    }

    private void generateDietChart() {
        String ageString = ageEditText.getText().toString();
        String weightString = weightEditText.getText().toString();

        if (ageString.isEmpty() || weightString.isEmpty()) {
            resultTextView.setText("Please enter valid age and weight values.");
            return;
        }

        int age = Integer.parseInt(ageString);
        double weight = Double.parseDouble(weightString);

        String dietChart;

        if (age <= 5) {
            dietChart = generateDietForAgeGroup("1-5 years", weight, 800, 1000);
        } else if (age <= 12) {
            dietChart = generateDietForAgeGroup("6-12 years", weight, 1200, 1600);
        } else if (age <= 18) {
            dietChart = generateDietForAgeGroup("13-18 years", weight, 1800, 2200);
        } else {
            dietChart = generateDietForAgeGroup("Above 18 years", weight, 2000, 2500);
        }

        resultTextView.setText(dietChart);
    }

    private String generateDietForAgeGroup(String ageGroup, double weight, int calorieLowerLimit, int calorieUpperLimit) {
        StringBuilder dietChart = new StringBuilder();
        dietChart.append("For age group ").append(ageGroup).append(" and weight ").append(weight).append(" kg:\n\n");

        int proteinLowerLimit = (int) (0.8 * weight);
        int proteinUpperLimit = (int) (1.2 * weight);

        dietChart.append("Calorie Intake: ").append(calorieLowerLimit).append(" - ").append(calorieUpperLimit).append(" calories/day\n");
        dietChart.append("Protein Intake: ").append(proteinLowerLimit).append(" - ").append(proteinUpperLimit).append(" grams/day\n");

        // Add more nutritional guidelines and recommendations for the specific age group and weight

        return dietChart.toString();
    }
}
