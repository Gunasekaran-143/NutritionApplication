package com.example.j11app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class vitB6 extends Fragment {

    public vitB6() {
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

        vitTitle.setText("Vitamin B6");
        vitFoods.setText("1) Cereal" + "\n" + "2) Green Salad" + "\n" + "3) Cabbage" + "\n" + "4) Bananas" + "\n" + "5) Walnuts" +
                "\n" + "6) Wheat bran" + "\n" + "7) Salmon" + "\n" + "8) Meat");

        vitRes.setText("* A Rejuvenated body" + "\n" +"* Strong nervous system" + "\n" + "* Healthy blood vessels");
        vitQuantity.setText("1.6-2mg");
        return view;
    }

}