package com.malen.aeumastermobile.homework.homework1.currencyCovertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.malen.aeumastermobile.R;

public class UsdConverKh extends AppCompatActivity {

    private EditText editTextKHR;
    private Button buttonConvert;
    private TextView textViewUSD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usd_conver_kh);
        editTextKHR = findViewById(R.id.edt_text);
        buttonConvert = findViewById(R.id.btn_usd_kh);
        textViewUSD = findViewById(R.id.txt_result);
        editTextKHR.setImeOptions(EditorInfo.IME_ACTION_DONE);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertCurrency();
            }
        });

    }

    private void convertCurrency() {
        // Get text from EditText
        String khrText = editTextKHR.getText().toString();
        // Convert text to numeric value (assuming input is numeric)
        double amountKHR = Double.parseDouble(khrText);

        double amountUSD = convertUSDToKHR(amountKHR);

        // Display the result in TextView
        textViewUSD.setText(String.format("%.2f", amountUSD));
    }
    // Method to convert USD to KHR
    private double convertUSDToKHR(double amountKHR) {

        double EXCHANGE_RATE_USD_TO_KHR = 4100.0;
        return amountKHR * EXCHANGE_RATE_USD_TO_KHR;
    }



}