package com.example.j11app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageList extends ArrayAdapter<String> {
AppCompatActivity context;
String[] category;
Integer[] pic;

public HomePageList(AppCompatActivity context, String[] category, Integer[] pic)
{
    super(context, R.layout.activity_home_page_list, category);
    this.context = context;
    this.category = category;
    this.pic = pic;
}
public View getView(int position, View view, ViewGroup parent)// getting specific view (item in list)
{
    LayoutInflater inflater = context.getLayoutInflater();
    View row = inflater.inflate(R.layout.activity_home_page_list,null,true);

    TextView categoryTxt = (TextView) row.findViewById(R.id.categoryTxt);
    ImageView picImg = (ImageView) row.findViewById(R.id.picImg);

    categoryTxt.setText(category[position]);
    picImg.setImageResource(pic[position]);
    return row;
};
}