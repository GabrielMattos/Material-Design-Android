package com.br.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private MaterialCardView cardView_1, cardView_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView_1 = findViewById(R.id.cardview1_ID);
        cardView_2 = findViewById(R.id.cardview2_ID);

        cardView_1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "CardView 1", Snackbar.LENGTH_LONG).show();
            }
        });

        cardView_2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "CardView 2", Snackbar.LENGTH_LONG).show();
            }
        });
    }
}
