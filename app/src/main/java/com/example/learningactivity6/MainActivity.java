package com.example.learningactivity6;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editWidth;
    EditText editLength;
    Button buttonResult;
    private ActivityResultLauncher<Intent> launcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editWidth = (EditText) findViewById(R.id.editWidth);
        editLength = (EditText) findViewById(R.id.editLength);
        setupButton();
    }
    private void setupButton(){
        buttonResult = findViewById(R.id.buttonResult);
        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the second activity
                Double width = Double.parseDouble( editWidth.getText().toString() );
                Double length = Double.parseDouble( editLength.getText().toString() );
                Intent secActIntent = new Intent(MainActivity.this, ResultActivity.class);
                Double mathTotal = (width * length);
                secActIntent.putExtra("width", width);
                secActIntent.putExtra("length", length);
                secActIntent.putExtra("mathTotal", mathTotal);
                startActivity(secActIntent);     // if no result is returned
                //startActivityForResult(secActIntent, CIS3334_REQUEST_CODE);
                //launcher.launch(secActIntent);
            }
        });
    }
}