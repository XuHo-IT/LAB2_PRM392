package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;

public class MinMaxActivity extends AppCompatActivity {
    EditText edNumberList;
    TextView tvResult;
    Button btnMin, btnMax,btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minmax);

        edNumberList = findViewById(R.id.edNumberList);
        tvResult = findViewById(R.id.tvResult);
        btnMin = findViewById(R.id.btnMin);
        btnMax = findViewById(R.id.btnMax);
        btnBack = findViewById(R.id.btnBack);
        btnMin.setOnClickListener(v -> {
            ArrayList<Double> numbers = parseInput();
            if( !numbers.isEmpty()){
                double min = Collections.min(numbers);
                tvResult.setText("Min: "+min);
            }else{
                tvResult.setText("Please Enter Numbers");
            }

        });

        btnMax.setOnClickListener(v -> {
            ArrayList<Double> numbers = parseInput();
            if( !numbers.isEmpty()){
                double max = Collections.max(numbers);
                tvResult.setText("Max: "+max);
            }else{
                tvResult.setText("Please Enter Numbers");
            }

        });
        btnBack.setOnClickListener(v -> finish());

    }
    private ArrayList<Double> parseInput(){
          ArrayList<Double> numbers = new ArrayList<>();
          String input = edNumberList.getText().toString().trim();
          if(!input.isEmpty()){
              String[] parts = input.split("[,\\s]+");
              for(String part: parts){
                  try{
                      numbers.add(Double.parseDouble(part));
                  }catch (NumberFormatException e){

                  }
              }
          }
          return  numbers;
    }

}
