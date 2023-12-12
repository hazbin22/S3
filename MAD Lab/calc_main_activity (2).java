package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button_a;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button_s;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button_m;
    private Button button0;
    private Button button_c;
    private Button button_d;
    private Button button_eq;

    private String currentInput = "";
    private double operand1 = 0;
    private double operand2 = 0;
    private String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.result);
    }

    public void onDigitClick(View view) {
        Button button = (Button) view;
        currentInput += button.getText().toString();
        updateDisplay();
    }

    public void onOperatorClick(View view) {
        if (!currentInput.isEmpty()) {
            operand1 = Double.parseDouble(currentInput);
            operator = ((Button) view).getText().toString();
            currentInput = "";
        }
    }

    public void onEqualClick(View view) {
        if (!currentInput.isEmpty()) {
            double operand2 = Double.parseDouble(currentInput);
            double result = performOperation(operand1, operand2,operator);
            currentInput = String.valueOf(result);
            updateDisplay();
        }
    }

    private double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 != 0) {
                    return operand1 + operand2;
                } else {
                    return Double.NaN;
                }
            default:
                return 0;
        }
    }

    public void onClearClick(View view) {
        currentInput = "";
        operand1 = 0;
        operand2 = 0;
        operator = "";
        updateDisplay();
    }

    private void updateDisplay() {
        result.setText(currentInput);
    }
}