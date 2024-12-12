package com.example.customlisthw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class spinneradapter extends BaseAdapter
{
    SpinnerAdapter spinadp;
    private Context context;
    private int[] imgs;
    private String[] countries;
    private LayoutInflater inflater;

    public spinneradapter(Context context,int[] imgs, String[] countries)
    {
        this.context = context;
        this.imgs = imgs;
        this.countries = countries;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return countries.length;
    }

    @Override
    public Object getItem(int position)
    {
        return countries[position];
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        view = inflater.inflate(R.layout.spinneradapter, parent,false);
        ImageView img = view.findViewById(R.id.countryImages);
        TextView tv = (TextView) view.findViewById(R.id.countryNameText);
        tv.setText(countries[position]);
        img.setImageResource(imgs[position]);
        //-----------------------------------------


        return view;


    }
}
