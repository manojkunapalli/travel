package com.bhargava.travel;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {
    private EditText txtEmailAddress;
    private EditText txtPassword;
    private FirebaseAuth firebaseAuth;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtEmailAddress = (EditText) findViewById(R.id.txtEmailRegistration);
        txtPassword = (EditText) findViewById(R.id.txtPasswordRegistration);
        firebaseAuth = FirebaseAuth.getInstance();
    }
    public void btnRegistrationUser_Click(View v) {

        final ProgressDialog progressDialog = ProgressDialog.show(register.this, "Please wait...", "Processing...", true);
        (firebaseAuth.createUserWithEmailAndPassword(txtEmailAddress.getText().toString(), txtPassword.getText().toString()))
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if (task.isSuccessful()) {
                            Toast.makeText(register.this, "Registration successful", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(register.this, menu.class);
                            startActivity(i);
                        }
                        else
                        {
                            Log.e("ERROR", task.getException().toString());
                            Toast.makeText(register.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
    public void feed(View v)
    {
        Intent inn=new Intent();
        inn.setClass(this,login1.class);
        startActivity(inn);
    }
}



