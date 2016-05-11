package com.example.caigehazelwood.hchsguidetogood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jewel.stone on 5/10/2016.
 */
public class Map extends MainActivity {
        /**
         * Called when the activity is first created.
         */
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.map);

            Button next1 = (Button) findViewById(R.id.button7);
            next1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent intent = new Intent();
                    setResult(RESULT_OK, intent);
                    finish();
                }

            });
        }
    }
