package com.br.textfield;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText user;
    AppCompatEditText password;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.username_textfield);
        password = findViewById(R.id.password_textfield);
        relativeLayout = findViewById(R.id.activity_main);

        relativeLayout.setOnClickListener(null); //remove o focus dos campos clicando em qualquer lugar da activity

        /*user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) { //onFocusChange quando o campo está selecionado fica true, senão false
                System.out.println(hasFocus);
            }
        });*/

        /*user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {
                System.out.println(s);
            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });*/
    }







































}
