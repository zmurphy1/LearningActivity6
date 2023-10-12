package com.example.learningactivity6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView textViewResult;
    Double length, width, mathTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        Bundle extras = getIntent().getExtras();
        length = extras.getDouble("length");
        width = extras.getDouble("width");
        mathTotal = extras.getDouble("mathTotal");
        textViewResult.setText("The total width is: " + width + " The total length is: "
                + length + ". So the total flooring needed is: " + mathTotal);
    }
}