package com.example.touchlistener_ex01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";
    Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button01 = findViewById(R.id.button01);
        button01.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                float x = motionEvent.getX();
                float y = motionEvent.getY();

                switch (motionEvent.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN : {
                        Log.d(TAG, "눌림");
                    }

                        case MotionEvent.ACTION_UP : {
                            Log.d(TAG, "뗌");
                        }
                        case MotionEvent.ACTION_MOVE : {
                            Log.d(TAG, "x : " + x + " y : " + y);
                        }
                }

                return false;
            }
        });



    }
}