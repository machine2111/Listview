package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.ImageReader;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombres [] = {"Gaspar", "Ignacio", "Daniela", "Jhoseph", "Juan Pablo", "Maggy",
            "Juan Carlos", "Rodolfo", "Esperanza", "Carmen", "Arnaldo", "Felipe", "Javier", "Antonio"};
    private String edades [] = {"4", "8", "29", "31", "31", "67", "68", "71", "5", "50", "30", "45", "34", "4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        lv1 = (ListView) findViewById(R.id.lv1);

        //ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombres);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.list_item_jqa,nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(i) + " es " + edades[i] + " años");
            }
        });

    }
}