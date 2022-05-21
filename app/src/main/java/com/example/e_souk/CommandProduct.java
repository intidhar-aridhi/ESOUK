package com.example.e_souk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CommandProduct extends AppCompatActivity {
Button sendcommand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command_product);
        sendcommand=(Button)findViewById(R.id.btnsedComman);
        sendcommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CommandProduct.this, "Added Succesfully!", Toast.LENGTH_LONG).show();

            }
        });
    }
}