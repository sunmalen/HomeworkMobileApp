package com.malen.aeumastermobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        // Step 2: Create a data source (array)
        String[] data = {"Student 1", "Student 2", "Student 3"};

        // Step 3: Set adapter to the list
        ListView listView = findViewById(R.id.list_item);
        CustomAdapter adapter = new CustomAdapter(this, data);
        listView.setAdapter(adapter);

        // Step 5: Handle event on list (item click)
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                Toast.makeText(ListViewActivity.this, "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}