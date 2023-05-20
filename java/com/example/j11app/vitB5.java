package com.example.j11app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class vitB5 extends Fragment {

    public vitB5() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple1, container, false);

        TextView vitTitle, vitFoods,vitRes,vitQuantity;
        vitTitle = (TextView) view.findViewById(R.id.vitTitle);
        vitFoods = (TextView) view.findViewById(R.id.vitFoods);
        vitRes = (TextView)view.findViewById(R.id.vitRes);
        vitQuantity = (TextView)view.findViewById(R.id.vitQuantity);

        vitTitle.setText("Vitamin B5");
        vitFoods.setText("1) Chicken" + "\n" + "2) Egg yolk" + "\n" + "3) Dairy products" + "\n" + "4) Caviar" + "\n" + "5) Legumes" +
                "\n" + "6) Nuts" + "\n" + "7) Yeast" + "\n" + "8) Oat Meal" + "\n" + "9) Rice" + "\n" + "10) Broccoli");

        vitRes.setText("* Good Memory" + "\n" + "* Cheerful mood" + "\n" + "* Healthy blood vessels  and heart");
        vitQuantity.setText("70mg");
        return view;
    }

}