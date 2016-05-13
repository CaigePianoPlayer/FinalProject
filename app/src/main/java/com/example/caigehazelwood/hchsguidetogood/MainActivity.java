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
    }
    public void button2 (View view) {
        Intent changeScreen = new Intent(this, Announcements.class);
        startActivity(changeScreen);
    }
    public void button3 (View view) {
        Intent changeScreen = new Intent(this, Announcements.class);
        startActivity(changeScreen);
    }
}
