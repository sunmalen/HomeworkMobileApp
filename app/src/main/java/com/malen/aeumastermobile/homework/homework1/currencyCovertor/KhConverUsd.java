package com.malen.aeumastermobile.homework.homework1.currencyCovertor;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.malen.aeumastermobile.R;

public class KhConverUsd extends AppCompatActivity {


    private EditText editTextKHR;
    private Button buttonConvert;
    private TextView textViewUSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh_conver_usd);


        editTextKHR = findViewById(R.id.edt_text);
        buttonConvert = findViewById(R.id.btn_kh_usd);
        textViewUSD = findViewById(R.id.txt_result);
        editTextKHR.setImeOptions(EditorInfo.IME_ACTION_DONE);

        // print amountKHR + " KHR = " + amountUSD + " USD"
        // You can retrieve the input value from the EditText



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

        // Convert KHR to USD using your conversion method
        double amountUSD = convertKHRtoUSD(amountKHR);

        // Display the result in TextView
        textViewUSD.setText(String.format("%.2f", amountUSD));
    }
    // Method to convert KHR to USD
    private double convertKHRtoUSD(double amountKHR) {
        // Perform currency conversion calculation
        // For simplicity, using a fixed exchange rate
        double exchangeRate = 0.00024632;
        return amountKHR * exchangeRate;
    }

}