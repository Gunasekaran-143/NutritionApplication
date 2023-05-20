package com.example.j11app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class vitB1 extends Fragment {

    public vitB1() {
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

        vitTitle.setText("Vitamin B1");
        vitFoods.setText("1) Brewing Yeast" + "\n" + "2) Pork" + "\n" + "3) Nuts" + "\n" + "4) Oats" + "\n" + "5) Wheat grass" +
                "\n" + "6) Legumes" );
vitRes.setText(":) An Efficient brain function" + "\n" + ":) Good Digestion" + "\n" + ":) Healthy muscles" + "\n" + ":) Healthy Heart" + "\n" + ":) Quality Sleep");
vitQuantity.setText("1.3 - 2mg");
        return view;
    }

}