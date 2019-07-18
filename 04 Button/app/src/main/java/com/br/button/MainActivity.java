package com.br.button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton raisedButton;
    private AppCompatButton flatButton;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raisedButton = findViewById(R.id.raised_btn);
        flatButton = findViewById(R.id.flat_btn);
        floatingActionButton = findViewById(R.id.fab_btn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Teste", Toast.LENGTH_SHORT).show();
            }
        });

        flatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Teste", Toast.LENGTH_SHORT).show();
            }
        });

        raisedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Teste", Toast.LENGTH_SHORT).show();
            }
        });
    }














}
