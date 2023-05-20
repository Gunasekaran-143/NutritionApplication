package com.example.j11app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class vitB12 extends Fragment {

    public vitB12() {
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

        vitTitle.setText("Vitamin B12");
        vitFoods.setText("1) Soya beans" + "\n" + "2) Hops" + "\n" + "3) Spinach" + "\n" + "4) Kelps" + "\n" + "5) Oyster" + "\n" + "6) Milk" +
                "\n" + "7) Egg yolk" + "\n" + "8) Fish" + "\n" + "9) Cheese" );

        vitRes.setText("* Normal Weight" + "\n" +"* Good immunity" + "\n" + "* Sound memory" + "\n" + "* Healthy gastrointestinal tract");
        vitQuantity.setText("2-5mg");
        return view;
    }

}