package com.example.akash.feedback;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyMessages extends AppCompatActivity {
    ImageView redcross;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_messages);
        redcross=(ImageView)findViewById(R.id.redcross);
        redcross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(getApplicationContext(),Home.class);
                startActivity(obj2);
            }
        });
    }
}
