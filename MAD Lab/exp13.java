package com.example.exp13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> list=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add("List1");
        list.add("List2");
        list.add("List3");
        list.add("List4");

        try{
            for(int i=0;i<5;i++){
                list.get(i);
            }
        }catch (Exception e){
            Toast.makeText(this, "Exception Caught", Toast.LENGTH_LONG).show();
        }

    }
}