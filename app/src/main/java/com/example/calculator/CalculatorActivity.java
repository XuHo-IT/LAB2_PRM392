package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {
    EditText edNumberA, edNumberB;
    TextView tvResult;
    Button btnAdd, btnSub, btnMul, btnDiv, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);

        edNumberA = findViewById(R.id.edNumberA);
        edNumberB = findViewById(R.id.edNumberB);
        tvResult = findViewById(R.id.tvResult);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnBack = findViewById(R.id.btnBack);

        btnAdd.setOnClickListener(v -> {
            double a = Double.parseDouble(edNumberA.getText().toString());
            double b = Double.parseDouble(edNumberB.getText().toString());
            double res = a + b;
            tvResult.setText("Result: " + res);
        });

        btnSub.setOnClickListener(v -> {
            double a = Double.parseDouble(edNumberA.getText().toString());
            double b = Double.parseDouble(edNumberB.getText().toString());
            double res = a - b;
            tvResult.setText("Result: " + res);
        });

        btnMul.setOnClickListener(v -> {
            double a = Double.parseDouble(edNumberA.getText().toString());
            double b = Double.parseDouble(edNumberB.getText().toString());
            double res = a * b;
            tvResult.setText("Result: " + res);
        });


        btnDiv.setOnClickListener(v -> {
            double a = Double.parseDouble(edNumberA.getText().toString());
            double b = Double.parseDouble(edNumberB.getText().toString());
            if (b != 0) {
                double res = a / b;
                tvResult.setText("Result: " + res);
            } else {
                tvResult.setText("Cannot divide by zero");
            }
        });

        btnBack.setOnClickListener(v -> finish());
    }
}
