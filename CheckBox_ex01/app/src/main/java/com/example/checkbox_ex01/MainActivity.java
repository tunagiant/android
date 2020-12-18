package com.example.checkbox_ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBoxS;
    CheckBox checkBoxM;
    CheckBox checkBoxL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxS = findViewById(R.id.checkBoxS);
        checkBoxM = findViewById(R.id.checkBoxM);
        checkBoxL = findViewById(R.id.checkBoxL);

        checkBoxM.setChecked(true);
        checkBoxS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b == true) {
                    Toast.makeText(getApplicationContext(), "S선택", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "S선택 해제", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}