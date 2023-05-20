package com.example.j11app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class vitB2 extends Fragment {

    public vitB2() {
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
        vitRes = (TextView) view.findViewById(R.id.vitRes);
        vitQuantity = (TextView) view.findViewById(R.id.vitQuantity);

        vitTitle.setText("Vitamin B2");
        vitFoods.setText("1) Milk" + "\n" + "2) Almonds " + "\n" + "3) Eggs" + "\n" + "4) Mushrooms " + "\n" + "5)Cottage Cheese" +
                "\n" + "6) Yeast " + "\n" + "7) Meat" );
        vitRes.setText("* Regenerated cells" + "\n" + "* Sharp vision" + "\n" + "* Healthy muscles");
        vitQuantity.setText("1.3 - 3mg");

        return view;
    }

}