package com.example.akash.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MyTeams extends AppCompatActivity {
    ImageView redcross;
    Button onclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_teams);
        redcross=(ImageView)findViewById(R.id.redcross);
        onclick=(Button)findViewById(R.id.onclick);
        redcross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(getApplicationContext(),Home.class);
                startActivity(obj2);
            }
        });
        onclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(getApplicationContext(),MyTeamsTwo.class);
                startActivity(obj2);
                finish();
            }
        });
    }
}
