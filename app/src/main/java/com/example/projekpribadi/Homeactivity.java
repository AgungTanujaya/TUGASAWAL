package com.example.projekpribadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homeactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
    }

    public void Login(View view) {
        Intent intent = new Intent(Homeactivity.this,Materiactivity.class);
        startActivity(intent);
    }

    public void Login1(View view) {
        Intent intent = new Intent(Homeactivity.this,Materiactivity.class);
        startActivity(intent);
    }


    public void Login3(View view) {
        Intent intent = new Intent(Homeactivity.this,materiacivity2.class);
        startActivity(intent);
    }
}