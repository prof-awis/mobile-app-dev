package com.example.exam_analysis;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void examAnalysis(View view){
        EditText t1 = (EditText) findViewById(R.id.bio);
        EditText t2 = (EditText) findViewById(R.id.eng);
        EditText t3 = (EditText) findViewById(R.id.chem);
        EditText t4 = (EditText) findViewById(R.id.maths);
        EditText t5 = (EditText) findViewById(R.id.kis);

        //Type conversion / typecasting / convert value to integer
        int n1 = Integer.parseInt(t1.getText().toString());
        int n2 = Integer.parseInt(t2.getText().toString());
        int n3 = Integer.parseInt(t3.getText().toString());
        int n4 = Integer.parseInt(t4.getText().toString());
        int n5 = Integer.parseInt(t5.getText().toString());

        int total = 0;

        total = n1 + n2 + n3 + n4 + n5 ;

        //Display th result
        TextView res = (TextView) findViewById(R.id.total);
        res.setText(" " +total);

        int average = total / 5;
        TextView mean = (TextView) findViewById(R.id.average);
        mean.setText(" " +average);

        if (average>50){
            TextView grade = (TextView) findViewById(R.id.grade);
            grade.setText(" PASS");

        }else {
            TextView grade = (TextView) findViewById(R.id.grade);
            grade.setText(" FAIL");
        }

    }
}