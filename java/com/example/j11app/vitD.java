package com.example.j11app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class vitD extends Fragment {

    public vitD() {
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

        vitTitle.setText("Vitamin D");
        vitQuantity.setText("2-5mg");
vitRes.setText("* Healthy Bones" + "\n" + "* Good blood circulation" + "\n" + "*  Immunity to colds"+ "\n" + "* Elimination of toxins");
        vitFoods.setText("1) Vegetables" + "\n" + "2) Potato" + "\n" + "3) Cheese" + "\n" + "4) Sea foods" + "\n" +
                "\n" + "5)  Egg yolk " + "\n" + "6) Fish");


        return view;
    }

}