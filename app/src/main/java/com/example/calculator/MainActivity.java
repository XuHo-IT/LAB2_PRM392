package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.CalculatorActivity;
import com.example.calculator.Login;

public class MainActivity extends AppCompatActivity {

    Button btnCalculator, btnMinMax, btnEquation,btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculator = findViewById(R.id.btnCalculator);
        btnMinMax = findViewById(R.id.btnMinMax);
        btnEquation = findViewById(R.id.btnEquation);
        btnLogin = findViewById(R.id.btnLogin);
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // chuyển sang màn CalculatorActivity
                startActivity(new Intent(MainActivity.this, CalculatorActivity.class));
            }
        });

        btnMinMax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MinMaxActivity.class));
            }
        });

        btnEquation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EquationActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Login.class));
            }
        });

    }
}
