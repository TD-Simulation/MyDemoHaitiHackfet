package com.example.carlybaja.mydemohaitihackfet;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DeskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desk);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    public void onDash(View v){
        Intent dash = new Intent(DeskActivity.this, DashboardActivity.class);
        startActivity(dash);
    }
//open Activity Klinik fanm
    public void onFanm(View v){
        Intent dash = new Intent(DeskActivity.this, KlinikFanmActivity.class);
        startActivity(dash);
    }
//open activity klinik timoun
    public void onTimoun(View v){
        Intent timoun = new Intent(DeskActivity.this, KlinikTimounActivity.class);
        startActivity(timoun);
    }
//open activity matron
    public void onMatron(View v){
        Intent matron = new Intent(DeskActivity.this, MatronActivity.class);
        startActivity(matron);
    }

}
