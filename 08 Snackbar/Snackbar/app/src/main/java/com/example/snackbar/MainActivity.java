package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.activity_main_ID);

        snackbar = Snackbar.make(view,"Hello Snackbar!", Snackbar.LENGTH_INDEFINITE);
        snackbar.setDuration(10000); //Em milisegundos - 10.000 == 10 segundos
        snackbar.setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss(); //Esconde a Snackbar
            }
        });
        
        snackbar.show();


        //snackbar.dismiss(); //Esconde a Snackbar
        //Snackbar.make(view, "Hello Snackbar!",Snackbar.LENGTH_SHORT).show();
    }
}
