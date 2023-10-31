package com.example.basic_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view){
        EditText t1 = (EditText) findViewById(R.id.Edittxtnum1);
        EditText t2 = (EditText) findViewById(R.id.Edittxtnum2);

        //Type conversion / typecasting / convert value to integer
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());

        //process for calculation
        int ans = n1 + n2;

        //Display th result
        TextView res = (TextView) findViewById(R.id.Edittxtres);
        res.setText("The sum is " +ans);
    }

}