package com.example.module4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView simpleTextView = (TextView) findViewById(R.id.MyName); //Getting the id for the Text View

        Button changeText = (Button) findViewById(R.id.btnChangeText);
        changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleTextView.setText("After Clicking");
                Toast.makeText(MainActivity.this, "Working with User Interface", Toast.LENGTH_SHORT).show();
            }
        });



    }
}