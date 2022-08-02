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
                    for (int num = 1; num <= 11; ) {
                        int count = 2;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 1) {
                    for (int num = 1; num <= 11;) {
                        int count = 3;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 2) {
                    for (int num = 1; num <= 11; ) {
                        int count = 4;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 3) {
                    for (int num = 1; num <= 11; ) {
                        int count = 5;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 4) {
                    for (int num = 1; num <= 11; ) {
                        int count = 6;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 5) {
                    for (int num = 1; num <= 11; ) {
                        int count = 7;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 6) {
                    for (int num = 1; num <= 11; ) {
                        int count = 8;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 7) {
                    for (int num = 1; num <= 11; ) {
                        int count = 9;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 8) {
                    for (int num = 1; num <= 11; ) {
                        int count = 10;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 9) {
                    for (int num = 1; num <= 11; ) {
                        int count = 11;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 10) {
                    for (int num = 1; num <= 11; ) {
                        int count = 12;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 11) {
                    for (int num = 1; num <= 11; ) {
                        int count = 13;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 12) {
                    for (int num = 1; num <= 11; ) {
                        int count = 14;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 13) {
                    for (int num = 1; num <= 11; ) {
                        int count = 15;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 14) {
                    for (int num = 1; num <= 11; ) {
                        int count = 16;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 15) {
                    for (int num = 1; num <= 11; ) {
                        int count = 17;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 16) {
                    for (int num = 1; num <= 11; ) {
                        int count = 18;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 17) {
                    for (int num = 1; num <= 11; ) {
                        int count = 19;
                        tableno = "Table of" + count;
                        String num2 = num + " x " + count + " = " + (num * count);
                        rows.add(num2);
                        num++;
                    }
                }
                if (i == 18) {
                    for (int num = 1; num <= 11; ) {
                        int count = 20;
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