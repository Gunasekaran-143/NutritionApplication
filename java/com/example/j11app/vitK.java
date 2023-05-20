package com.example.j11app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class vitK extends Fragment {

    public vitK() {
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

        vitTitle.setText("Vitamin K");
        vitFoods.setText("1) Spinach" + "\n" + "2) Nettle" + "\n" + "3) Cauliflower" + "\n" + "4) Carrots" + "\n" + "5) Tomato" +
                "\n" + "6) Green tea" );
        vitRes.setText(":) Fast Healing" + "\n" + ":) Normal blood coagulation" );
        vitQuantity.setText("1-2mg");
        return view;

    }

}