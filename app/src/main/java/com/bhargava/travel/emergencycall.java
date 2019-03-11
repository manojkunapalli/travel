package com.bhargava.travel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.widget.Toast;

public class emergencycall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencycall);
    }

    public void onImageClick(View v){
        Toast.makeText(this,"emergency call",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:112"));
        startActivity(i);
    }
}
