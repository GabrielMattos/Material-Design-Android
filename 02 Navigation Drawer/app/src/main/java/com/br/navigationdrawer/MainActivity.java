package com.br.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.graphics.drawable.DrawableWrapper;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed() { //Botão de voltar fixo do android na parte de baixo

        if(drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.inbox_id:
                Toast.makeText(this, "INBOX", Toast.LENGTH_SHORT).show();
                break;

            case R.id.starred_id:
                Toast.makeText(this, "STARRED", Toast.LENGTH_SHORT).show();
                break;

            case R.id.send_id:
                Toast.makeText(this, "SEND", Toast.LENGTH_SHORT).show();
                break;

            case R.id.drafts_id:
                Toast.makeText(this, "DRAFTS", Toast.LENGTH_SHORT).show();
                break;

            case R.id.allMail_id:
                Toast.makeText(this, "ALL MAIL", Toast.LENGTH_SHORT).show();
                break;

            case R.id.trash_id:
                Toast.makeText(this, "TRASH", Toast.LENGTH_SHORT).show();
                break;

            case R.id.spam_id:
                Toast.makeText(this, "SPAM", Toast.LENGTH_SHORT).show();
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START); //fecha o navigation após o código selecionado ser executado //fechará do lado esquerdo

        return true;
    }


}
