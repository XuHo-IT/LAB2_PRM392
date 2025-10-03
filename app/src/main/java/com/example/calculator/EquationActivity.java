package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EquationActivity extends AppCompatActivity {
    EditText edA, edB, edC;
    TextView tvResult;
    Button btnSolve, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation);

        edA = findViewById(R.id.edA);
        edB = findViewById(R.id.edB);
        edC = findViewById(R.id.edC);
        tvResult = findViewById(R.id.tvResult);
        btnSolve = findViewById(R.id.btnSolve);
        btnBack = findViewById(R.id.btnBack);
        btnSolve.setOnClickListener(v -> {
            double a = Double.parseDouble(edA.getText().toString());
            double b = Double.parseDouble(edB.getText().toString());
            double c = Double.parseDouble(edC.getText().toString());

            if (a == 0) {
                if (b == 0) {
                    tvResult.setText(c == 0 ? "Vô số nghiệm" : "Vô nghiệm");
                } else {
                    tvResult.setText("Nghiệm: x = " + (-c / b));
                }
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    tvResult.setText("Phương trình vô nghiệm");
                } else if (delta == 0) {
                    tvResult.setText("Nghiệm kép: x = " + (-b / (2 * a)));
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    tvResult.setText("x1 = " + x1 + " , x2 = " + x2);
                }
            }
        });
        btnBack.setOnClickListener(v -> finish());
    }
}
