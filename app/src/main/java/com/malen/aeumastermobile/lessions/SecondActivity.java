package com.malen.aeumastermobile.lessions;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.malen.aeumastermobile.R;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Objects.requireNonNull(getSupportActionBar()).setTitle("Second Screen");
        TextView text = findViewById(R.id.txt_get_intent);
        //get the  Intent that started this activity
        Intent intent = getIntent();

        //Check if the Intent has extras (additional data)
        if (intent != null && intent.getExtras() != null){
            //Retrieve data from the Intent
           String dataValue = intent.getStringExtra("Value1");
            // Do something with the retrieved data
            if (dataValue != null) {
                // Process the data
              text.setText(dataValue);
                //text2.setText(dataValue2);
            }
        }




    }
}