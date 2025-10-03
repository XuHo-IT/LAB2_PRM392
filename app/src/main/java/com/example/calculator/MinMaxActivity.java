package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MinMaxActivity extends AppCompatActivity {
    EditText edNumberA, edNumberB;
    TextView tvResult;
    Button btnMin, btnMax,btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minmax);

        edNumberA = findViewById(R.id.edNumberA);
        edNumberB = findViewById(R.id.edNumberB);
        tvResult = findViewById(R.id.tvResult);
        btnMin = findViewById(R.id.btnMin);
        btnMax = findViewById(R.id.btnMax);
        btnBack = findViewById(R.id.btnBack);
        btnMin.setOnClickListener(v -> {
            double a = Double.parseDouble(edNumberA.getText().toString());
            double b = Double.parseDouble(edNumberB.getText().toString());
            tvResult.setText("Min: " + Math.min(a, b));
        });

        btnMax.setOnClickListener(v -> {
            double a = Double.parseDouble(edNumberA.getText().toString());
            double b = Double.parseDouble(edNumberB.getText().toString());
            tvResult.setText("Max: " + Math.max(a, b));
        });
        btnBack.setOnClickListener(v -> finish());

    }
}
