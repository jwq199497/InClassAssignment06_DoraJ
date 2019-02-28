package com.example.android.inclassassignment06_doraj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView result;
    private String showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView)findViewById(R.id.result);
        Intent intent = getIntent();

        showResult = intent.getStringExtra(Keys.WATER) + "\n" + intent.getStringExtra("WATER_TYPE") + "\n" + intent.getStringExtra(Keys.MORE_INFO);
        result.setText(showResult);
    }
}
