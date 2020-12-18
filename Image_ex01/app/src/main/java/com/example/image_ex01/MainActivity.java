package com.example.image_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int index = 0;

    Button button;
    ImageView imageView01;
    ImageView imageView02;
    ImageView imageView03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView01 = findViewById(R.id.imageView01);
        imageView02 = findViewById(R.id.imageView02);
        imageView03 = findViewById(R.id.imageView03);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index == 0) {
                    imageView01.setVisibility(View.INVISIBLE);
                    imageView02.setVisibility(View.VISIBLE);
                    index = 1;
                } else if (index == 1) {
                    imageView02.setVisibility(View.INVISIBLE);
                    imageView03.setVisibility(View.VISIBLE);
                    index = 2;
                } else {
                    imageView03.setVisibility(View.INVISIBLE);
                    imageView01.setVisibility(View.VISIBLE);
                    index = 0;
                }
            }
        });




    }
}