package com.example.caigehazelwood.hchsguidetogood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CourseDescriptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_descriptions);
    }
    public void button12 (View view) {
        Intent changeScreen = new Intent(this, MainActivity.class);
        startActivity(changeScreen);
    }
}
