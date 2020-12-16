package com.example.toast_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01;
        Button button02;
        Button button03;

        EditText editText01;

        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);
        button03 = findViewById(R.id.button03);

        editText01 = findViewById(R.id.editText01);



//        button01.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "HI", Toast.LENGTH_LONG).show();
//            }
//        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "BYE", Toast.LENGTH_LONG).show();
            }
        });

        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable string = editText01.getText();
                Toast.makeText(getApplicationContext(), string, Toast.LENGTH_LONG).show();
            }
        });


    }

    public void button01clicked(View v) {
        Toast.makeText(getApplicationContext(), "HI", Toast.LENGTH_LONG).show();
    }
}