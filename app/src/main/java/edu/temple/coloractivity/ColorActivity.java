package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class ColorActivity extends AppCompatActivity {

    String[] colors = {"BLACK", "BLUE", "CYAN", "GRAY", "WHITE", "GREEN", "BLUE", "MAGENTA",
        "RED", "YELLOW"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner colorSpinner = (Spinner) findViewById(R.id.colorSpinner);
        colorSpinner.setBackgroundColor(Color.parseColor("WHITE"));

        ColorAdapter colorAdapter = new ColorAdapter(this, colors);
        colorSpinner.setAdapter(colorAdapter);

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ColorAdapter clickedItem = (ColorAdapter) adapterView.getItemAtPosition(i);
                View someView = findViewById(R.id.backGround);
                View root = someView.getRootView();
                Toast.makeText(ColorActivity.this, colors[i] + " print", Toast.LENGTH_SHORT).show();
                root.setBackgroundColor(Color.parseColor(colors[i]));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        }
        );}

}
