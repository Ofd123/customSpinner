package com.example.customlisthw;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{
    Spinner spin;
    TextView countryName,capitalCity,population;
    ImageView flag;
    int [] imgs = {R.drawable.uk_flag,R.drawable.usa_flag,R.drawable.ukrine_flag,R.drawable.germany_flag,R.drawable.india_flag,R.drawable.israel_flag,R.drawable.italy_flag,R.drawable.russia_flag};
    String [] capitalCities = {"London","Washington, D.C.","Kyiv","Berlin","New Delhi","Jerusalem","Rome","Moscow"};
    String [] countries = {"United Kingdom","United States","Ukraine","Germany","India","Israel","Italy","Russia"};
    int [] populations = {69140000, 334200000, 31400000 , 83400000, 1425000000, 9500000, 58900000, 143800000};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        countryName = findViewById(R.id.country);
        capitalCity = findViewById(R.id.capitalCity);
        population = findViewById(R.id.population);
        flag = findViewById(R.id.flag);


        //-------------------------------------------
        spin = (Spinner) findViewById(R.id.spinner);

        spinneradapter custom = new spinneradapter(this,imgs,countries);
        spin.setAdapter(custom);
        spin.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        countryName.setText(countries[position]);
        capitalCity.setText("Capital: " + capitalCities[position]);
        population.setText("Population: " + populations[position]);
        flag.setImageResource(imgs[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {
        countryName.setText(countries[0]);
        capitalCity.setText("Capital: " + capitalCities[0]);
        population.setText("Population: " + populations[0]);
        flag.setImageResource(imgs[0]);
    }
}