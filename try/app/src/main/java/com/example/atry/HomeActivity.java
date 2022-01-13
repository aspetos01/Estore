package com.example.atry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void LaunchPosts(View v) {
        // Launch the Home activity
        Intent i = new Intent(this, PostsActivity.class);
        startActivity(i);
    }

    public void LaunchPlaylists(View v) {
        // Launch the Playlists activity
        Intent i = new Intent(this, PlaylistsActivity.class);
        startActivity(i);
    }

    public void LaunchMerch(View v) {
        // Launch the Playlists activity
        Intent i = new Intent(this, MerchActivity.class);
        startActivity(i);
    }

    public void LaunchShoppingCart(View v) {
        Intent i = new Intent(this, ShoppingCartActivity.class);
        startActivity(i);
    }
}