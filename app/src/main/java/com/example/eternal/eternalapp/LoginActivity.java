package com.example.eternal.eternalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.usernameText)
    EditText usernameText;

    @BindView(R.id.passwordText)
    EditText passwordText;

    @BindView(R.id.login)
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        ButterKnife.bind(this);

        loginBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(!usernameText.getText().toString().equals("") || !passwordText.getText().toString().equals(""))
                    Log.i("LoginActivity", " ### Login clicked! ###");
                else {
                    Toast.makeText(LoginActivity.this, "Invalid login", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
