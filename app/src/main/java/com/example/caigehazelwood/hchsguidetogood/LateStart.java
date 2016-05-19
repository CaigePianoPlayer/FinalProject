package com.example.caigehazelwood.hchsguidetogood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LateStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_late_start);
    }
    public void button15 (View view) {
        Intent changeScreen = new Intent(this, MainActivity.class);
        startActivity(changeScreen);
    }
}
