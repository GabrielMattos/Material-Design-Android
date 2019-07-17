package com.br.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbarMainActivity);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Seta de voltar na action bar
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //exibição do XML
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) { //Para cada item do Pop-up menu

        int id = item.getItemId();

        if(id == R.id.id_item_1) {
            Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.id_item_2) {
            Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.id_item_3) {
            Toast.makeText(this, "Item 3", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.search_id) {
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.cart_id) {
            Toast.makeText(this, "Cart", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.home) {
            finish(); // finaliza a activity definitivamente
        }

        return super.onOptionsItemSelected(item);
    }












}
