package com.br.checkbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppCompatCheckBox appCompatCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appCompatCheckBox = findViewById(R.id.checkbox_id);

        appCompatCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getApplicationContext(), "True", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "False", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
