package com.example.akash.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FloatingPollMessage extends AppCompatActivity {
    ImageView redcross;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_poll_message);
        redcross=(ImageView)findViewById(R.id.redcross);
        redcross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(getApplicationContext(),Home.class);
                startActivity(obj2);
                finish();
            }
        });
        submit=(Button)findViewById(R.id.submitbutton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Feedback Recorded",Toast.LENGTH_SHORT).show();
                Intent obj2 = new Intent(getApplicationContext(),Home.class);
                startActivity(obj2);
                finish();
            }
        });
    }
}
