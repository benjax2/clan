package com.example.solemne1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }
    // Metodo de botones
    public void siguiente(View view){
        Intent siguiente = new Intent(this,ChatGlobal.class);
        startActivity(siguiente);
    }
}