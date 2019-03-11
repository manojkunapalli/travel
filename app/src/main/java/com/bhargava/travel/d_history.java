package com.bhargava.travel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class d_history extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    Button btn;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_history);
        String[] list = {"Fever", "Cold", "Cough", "Musclepain", "Chickenpox", "Backpain", "BadSmell"};
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.txt);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list);
        autoCompleteTextView.setAdapter(adapter);
        btn = (Button) findViewById(R.id.nxte);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = autoCompleteTextView.getText().toString();
                if (val.contentEquals("Fever")) {
                    Intent intent = new Intent(d_history.this,fever.class);
                    startActivity(intent);
                }

                else if (val.contentEquals("Cough")) {
                    Intent intent1 = new Intent(d_history.this,cough.class);
                    startActivity(intent1);
                }
                else if (val.contentEquals("Musclepain")) {
                    Intent intent1 = new Intent(d_history.this,musclepain.class);
                    startActivity(intent1);
                }
                else if (val.contentEquals("Chickenpox")) {
                    Intent intent1 = new Intent(d_history.this,chickenpox.class);
                    startActivity(intent1);
                }
                else if (val.contentEquals("BadSmell")) {
                    Intent intent1 = new Intent(d_history.this,badsmell.class);
                    startActivity(intent1);
                }
                else if (val.contentEquals("Backpain")) {
                    Intent intent1 = new Intent(d_history.this,backpain.class);
                    startActivity(intent1);
                }
                else if (val.contentEquals("Cold")) {
                    Intent intent1 = new Intent(d_history.this,cold.class);
                    startActivity(intent1);
                }


            }
        });









    }}
