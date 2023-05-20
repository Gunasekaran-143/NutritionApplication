package com.example.j11app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class vitC extends Fragment {

    public vitC() {
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

        vitTitle.setText("Vitamin C");
        vitFoods.setText("1) Dill" + "\n" + "2) Citrus fruits" + "\n" + "3) Rose hips" + "\n" + "4) Cauliflower" + "\n" + "5) Peas" +
                "\n" + "6) Radish" + "\n" + "7) Kiwi" + "\n" + "8) Red fruit" + "\n" + "9) Sea buckthorn");

vitRes.setText("* Smooth skin" + "\n" +"* Good immunity" + "\n" + "* Cheerful mood" + "\n" + "* Healthy hair and nails");
vitQuantity.setText("70mg");
        return view;
    }

}