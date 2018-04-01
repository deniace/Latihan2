package com.ace.deni.latihan2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardView = findViewById(R.id.card1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(HomeActivity.this, InputActivity.class));
            }
        });

    }

    public void tentang(View view){
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.cupcake)
                .setTitle("about this app")
                .setMessage("ini aplikasi deni ace")
                .setPositiveButton("oke", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).create()
                .show();
        Toast.makeText(this, "nama aplikasi ini adalah "+getPackageName(), Toast.LENGTH_SHORT).show();
    }

}
