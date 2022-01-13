package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SkirtsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skirts);
    }


    public void LaunchShoppingCart(View v) {
        Intent i = new Intent(this, ShoppingCartActivity.class);
        startActivity(i);
    }
}