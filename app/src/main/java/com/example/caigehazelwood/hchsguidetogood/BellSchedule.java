package com.example.caigehazelwood.hchsguidetogood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BellSchedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell_schedule);
    }
    public void button10 (View view) {
        Intent changeScreen = new Intent(this, MainActivity.class);
        startActivity(changeScreen);
    }
    public void button12 (View view) {
        Intent changeScreen = new Intent(this, PepRallyBell.class);
        startActivity(changeScreen);
    }
    public void button13 (View view) {
        Intent changeScreen = new Intent(this, LateStartBell.class);
        startActivity(changeScreen);
    }
    public void button14 (View view) {
        Intent changeScreen = new Intent(this, TestingBell.class);
        startActivity(changeScreen);
    }
}
