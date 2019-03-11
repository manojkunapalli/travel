package com.bhargava.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class modified_login extends AppCompatActivity implements View.OnClickListener {
    private ImageButton reg, log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modified_login);
        reg = (ImageButton) findViewById(R.id.regi);
        log = (ImageButton) findViewById(R.id.loginbut);
        reg.setOnClickListener(this);
        log.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.regi:
                i = new Intent(this, register.class);
                startActivity(i);
                break;
            case R.id.loginbut:
                i = new Intent(this, login1.class);
                startActivity(i);
                break;
        }
    }
}
