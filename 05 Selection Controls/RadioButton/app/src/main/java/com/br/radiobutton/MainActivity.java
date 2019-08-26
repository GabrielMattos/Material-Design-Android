package com.br.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radiogroup_id);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.radioButton1_id:
                        Toast.makeText(getApplicationContext(), "RadioButton 1", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton2_id:
                        Toast.makeText(getApplicationContext(), "RadioButton 2", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
