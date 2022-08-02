package com.example.multiplicationtablelearningappusinglistviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    public final static String Main="Table Number";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        ArrayList<String> row=new ArrayList<>();
        for(int x=2;x<20;x++) {
            row.add("Table of " + x);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, row);
            listView.setAdapter(adapter);
        }


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ArrayList<String> rows=new ArrayList<>();
                Intent intent = new Intent(MainActivity.this, table2.class);
                String tableno = null;
                if (i == 0) {
                    for (int num = 0; num < 11; ) {

                        int count = 2;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);

                        num++;
                    }
                }
                if (i == 1) {
                    for (int num = 0; num < 11; ) {

                        int count = 3;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);

                        num++;
                    }
                }
                if (i == 2) {
                    for (int num = 0; num < 11; ) {

                        int count = 4;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);

                        num++;
                    }
                }
                if (i == 3) {
                    for (int num = 0; num < 11; ) {

                        int count = 5;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);

                        num++;
                    }
                }


                intent.putExtra("key",rows);
                intent.putExtra("key1",tableno);
                startActivity(intent);

            }
        });
    }
}