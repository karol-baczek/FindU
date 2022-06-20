package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Display extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent = getIntent();
        String longitude = intent.getStringExtra("long");
        String latitude = intent.getStringExtra("lat");


        Double lng = Double.parseDouble(longitude);
        Double lat = Double.parseDouble(latitude);
        Toast.makeText(Display.this, "Latitude: " + lat + " Longitude:" + lng, Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText("Latitude: " + latitude);

        TextView textView1 = (TextView) findViewById(R.id.textView2);
        textView1.setText("Longitude: " + longitude);



    }
}