package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;

    private String[] name = {
            "User1",
            "User2",
            "User3",
            "User4",
            "User5",
            "User6",
            "User7",
            "User8",
            "User9",
            "User10",
            "User11",
    };

    private String[] desc = {
            "Description1",
            "Description2",
            "Description3",
            "Description4",
            "Description5",
            "Description6",
            "Description7",
            "Description8",
            "Description9",
            "Description10",
            "Description11",
    };

    int[] image = {
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,
            R.drawable.avatar2,


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar_ID);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recyclerview_ID);

        List<User> sampleUser = new ArrayList<>();

        for(int i = 0; i < name.length; i++) {
            User user = new User();
            user.username = name[i];
            user.description = desc[i];
            user.userImage = image[i];
            sampleUser.add(user);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(sampleUser));
    }
}
