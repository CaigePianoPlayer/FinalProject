package com.example.caigehazelwood.hchsguidetogood;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = (Button) findViewById(R.id.button4);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), BellSchedule.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Button next1 = (Button) findViewById(R.id.button12);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Map.class);
                startActivityForResult(myIntent, 0);
            }

        });

        Button next2 = (Button) findViewById(R.id.button11);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Settings.class);
                startActivityForResult(myIntent, 0);
            }

        });

    }


}
