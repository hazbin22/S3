package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListview=findViewById(R.id.list1);

        String items[]= new String[]{"item 1","item 2","item 3"};
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,items);

        myListview.setAdapter(myAdapter);
    }
}