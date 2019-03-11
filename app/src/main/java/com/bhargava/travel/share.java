package com.bhargava.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class share extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

                Intent myintent=new Intent(Intent.ACTION_SEND);
                myintent.setType("text/plain");
                String sharebody="Dr.Next is a good app for health care";
                String sharesub="fell free it is free";
                myintent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                myintent.putExtra(Intent.EXTRA_TEXT,sharebody);
                startActivity(Intent.createChooser(myintent,"share using"));

    }
}
