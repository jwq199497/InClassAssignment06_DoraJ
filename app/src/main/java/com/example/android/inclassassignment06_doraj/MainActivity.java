package com.example.android.inclassassignment06_doraj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText brand;
    private EditText origin;
    private EditText moreInfo;
    private CheckBox spring;
    private CheckBox alkaline;
    private CheckBox purified;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        brand = (EditText) findViewById(R.id.brand);
        origin = (EditText)findViewById(R.id.origin);
        moreInfo = (EditText)findViewById(R.id.moreInfo);
        purified = (CheckBox)findViewById(R.id.pw);
        spring = (CheckBox)findViewById(R.id.sw);
        alkaline = (CheckBox)findViewById(R.id.aw);
        submit = (Button)findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String waterBrand = brand.getText().toString();
                String waterOrigin = origin.getText().toString();
                Water water = new Water(waterBrand, waterOrigin);

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra(Keys.WATER, water.toString());
                if (spring.isChecked()){
                    intent.putExtra("WATER_TYPE", "Water Type: Spring Water");
                } else if (purified.isChecked()){
                    intent.putExtra("WATER_TYPE", "Water Type: Purified Water");
                } else if (alkaline.isChecked()){
                    intent.putExtra("WATER_TYPE", "Water Type: Alkaline Water");
                } else {
                    intent.putExtra("WATER_TYPE","Water Type: other");
                }
                intent.putExtra(Keys.MORE_INFO, moreInfo.getText().toString());
                MainActivity.this.startActivity(intent);

            }
        });

    }
}
