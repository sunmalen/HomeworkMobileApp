package com.malen.aeumastermobile.homework.homework1.currencyCovertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.malen.aeumastermobile.R;

public class KhCovertEn extends AppCompatActivity {


    private EditText editTextKHR;
    private Button buttonConvert;
    private TextView textViewEN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh_covert_en);

        editTextKHR = findViewById(R.id.edt_text);
        buttonConvert = findViewById(R.id.btn_kh_en);
        textViewEN = findViewById(R.id.txt_result);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertCurrency();
            }
        });

    }

    private void convertCurrency() {
        String khrText = editTextKHR.getText().toString();

        // Convert text to numeric value (assuming input is numeric)
        double amountKHR = Double.parseDouble(khrText);

        // Convert KHR to EUR using your conversion method
        double amountEUR = convertKHRToEUR(amountKHR);

        // Display the result in TextView
        textViewEN.setText(String.format("%.2f", amountEUR));
    }
    // Method to convert KHR to EUR
    private double convertKHRToEUR(double amountKHR) {
        // Perform currency conversion calculation
        // For simplicity, using a fixed exchange rate
        double EXCHANGE_RATE_KHR_TO_EUR = 0.00021;
        return amountKHR * EXCHANGE_RATE_KHR_TO_EUR;
    }

}



