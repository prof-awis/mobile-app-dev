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

    public void area(View view){
        performOperation("area");
    }

    public void per(View view){
        performOperation("per");
    }
    public void performOperation(String string){
        EditText t1 = (EditText) findViewById(R.id.Edittxtnum1);
        EditText t2 = (EditText) findViewById(R.id.Edittxtnum2);

        //Type conversion / typecasting / convert value to integer
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());

        //process for calculation
        int ans = 0;
        if(string.equals("area")){
            ans = n1 * n2;
        } else if (string.equals("per")) {
            ans = n1 + n2 + n1 +n2;
        } else{
//            ans = "Invalid Input";
        }

        //Display th result
        TextView res = (TextView) findViewById(R.id.Edittxtres);
        res.setText("The result is " +ans);
    }

}