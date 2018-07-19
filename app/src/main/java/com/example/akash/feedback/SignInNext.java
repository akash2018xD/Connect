package com.example.akash.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInNext extends AppCompatActivity {
    Button cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_next);
        cont=(Button)findViewById(R.id.conttoapp);
        cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(getApplicationContext(),Home.class);
                startActivity(obj2);
                finish();
            }
        });
    }
}
