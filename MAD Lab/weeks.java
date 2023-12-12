package com.example.weeks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView lists;
    String [] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lists=findViewById(R.id.weeks);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,days);
        lists.setAdapter(adapter);
        lists.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        TextView temp=(TextView) view;
        Toast.makeText(this,"You clicked "+temp.getText()+" at "+position, Toast.LENGTH_LONG).show();

    }
}