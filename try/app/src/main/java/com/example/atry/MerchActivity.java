package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MerchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merch);
    }

    public void LaunchTshirtsMerch(View v) {
        Intent i = new Intent(this, TshirtsActivity.class);
        startActivity(i);
    }


    public void LaunchHoodiesMerch(View v) {
        Intent i = new Intent(this, HoodiesActivity.class);
        startActivity(i);
    }


    public void LaunchCorsetsMerch(View v) {
        Intent i = new Intent(this, CorsetsActivity.class);
        startActivity(i);
    }

    public void LaunchAccessories(View v) {
        Intent i = new Intent(this, AccessoriesActivity.class);
        startActivity(i);
    }


    public void LaunchShoppingCart(View v) {
        Intent i = new Intent(this, ShoppingCartActivity.class);
        startActivity(i);
    }
}