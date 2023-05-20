package com.example.j11app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class vitE extends Fragment {

    public vitE() {
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

        TextView vitTitle, vitFoods,vitQuantity,vitRes;
        vitTitle = (TextView) view.findViewById(R.id.vitTitle);
        vitFoods = (TextView) view.findViewById(R.id.vitFoods);
        vitQuantity = (TextView) view.findViewById(R.id.vitQuantity);
        vitRes = (TextView)view.findViewById(R.id.vitRes);


        vitTitle.setText("Vitamin E");
        vitFoods.setText("1) Meat" + "\n" + "2) Corn" + "\n" + "3) Pumpkin" + "\n" + "4) Dairy Products");
        vitQuantity.setText("30 - 50mg");
        vitRes.setText("* A Rejuvenated body " + "\n" + "* Normal operation of the reproductive system "+ "\n" + "* Protection from environment");

        return view;
    }

}