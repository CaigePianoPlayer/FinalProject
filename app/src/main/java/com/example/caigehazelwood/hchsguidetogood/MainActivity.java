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
        assert next != null;
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), BellSchedule.class);
                startActivity(myIntent);
            }

        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        Button next1 = (Button) findViewById(R.id.button8);
        assert next1 != null;
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Map.class);
                startActivity(myIntent);
            }

        });
    }


}
