package com.example.e_souk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private EditText name,password;
    private Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = (EditText)findViewById(R.id.edt_nom);
        password = (EditText)findViewById(R.id.edt_password);
       log = (Button)findViewById(R.id.btn_sigin);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((name.getText().toString()).equals("essouk"))&((password.getText().toString()).equals("essouk123")))

                {
                    //rediriger vers la page d'accueil
                    Intent intent = new Intent(login.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }
}