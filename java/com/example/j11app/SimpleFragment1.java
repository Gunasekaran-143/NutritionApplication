package com.example.j11app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SimpleFragment1 extends Fragment {

    public SimpleFragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simple1, container, false);

        TextView vitTitle, vitFoods,vitRes,vitQuantity,vitResTitle,vitQuantityTitle;
        vitTitle = (TextView) view.findViewById(R.id.vitTitle);
        vitFoods = (TextView) view.findViewById(R.id.vitFoods);
        vitRes = (TextView)view.findViewById(R.id.vitRes);
        vitQuantity = (TextView)view.findViewById(R.id.vitQuantity);

        vitTitle.setText("Vitamin A");
        vitFoods.setText("1) Carrots" + "\n" + "2) Citrus fruits" + "\n" + "3) Hard Cheese" + "\n" + "4) Spinach" + "\n" +
                "5) Milk Cottage" +
                "\n" + "6) Cheese" + "\n" + "7) Eggs" + "\n" + "8) Fish" + "\n" + "9) Parsley"+ "\n" + "10) Milk" + "\n" + "11) Liver");

        vitRes.setText(":) Young looking skin" + "\n" +":) Sharp vision" + "\n" + ":) Strong bones" + "\n" + ":) Healthy hair and nails");
        vitQuantity.setText("0.4-1mg");
        return view;
    }

}