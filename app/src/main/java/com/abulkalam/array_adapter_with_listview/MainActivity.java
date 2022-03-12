package com.abulkalam.array_adapter_with_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simple_list;
    String[] animal_List = {"Lion", "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena",
            "Elephant" , "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena", "Elephant",
            "Lion", "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena",
            "Elephant" , "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena", "Elephant",
            "Lion", "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena",
            "Elephant" , "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena", "Elephant"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simple_list = findViewById(R.id.simple_ListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, animal_List);
        simple_list.setAdapter(arrayAdapter);
    }
}