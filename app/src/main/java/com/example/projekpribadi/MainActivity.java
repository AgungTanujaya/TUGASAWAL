package com.example.projekpribadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    textView=(TextView)findViewById(R.id.txt_bottom);
    textView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent= new Intent(MainActivity.this,DaftarActivity2.class);
            startActivity(intent);
        }
    });


    }

    public void Login(View view) {
        Intent intent= new Intent(MainActivity.this,Homeactivity.class);
        startActivity(intent);
    }
}