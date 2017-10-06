package com.example.bertacanes.simplecounter;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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
        Button btn_exit = (Button) findViewById(R.id.btn_exit);

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
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SimpleCounterActivity.this);
                builder.setTitle(R.string.confirm);
                builder.setMessage(R.string.sure);
                builder.setCancelable(false);
                builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton(R.string.no, null);
                builder.create().show();
            }
        });

    }
}