package com.example.multiplicationtablelearningappusinglistviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class table2 extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        listView=findViewById(R.id.Table);




        ArrayList<String> rows= (ArrayList<String>) getIntent().getSerializableExtra("key");


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,rows);

            listView.setAdapter(adapter);


    }
}