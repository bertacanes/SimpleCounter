package com.example.bertacanes.simplecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimpleCounterActivity extends AppCompatActivity {

    private int counter = 0;
    private String scounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_counter);

        final TextView text_counter = (TextView) findViewById(R.id.text_counter);
        Button btn_plus = (Button) findViewById(R.id.btn_plus);
        Button btn_less = (Button) findViewById(R.id.btn_less);

        text_counter.setText("0");

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                scounter = Integer.toString(counter);
                text_counter.setText(scounter);
            }
        });
        btn_less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                scounter = Integer.toString(counter);
                text_counter.setText(scounter);
            }
        });

    }
}