package com.example.akash.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class LobbyScreen extends AppCompatActivity {
    ImageView redcross;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lobby_screen);
        redcross=(ImageView)findViewById(R.id.redcross);
        redcross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(getApplicationContext(),Home.class);
                startActivity(obj2);
                finish();
            }
        });
    }
    public void approveornot(View view) {
        int id=view.getId();
        if(id==R.id.approve){
            Toast.makeText(getBaseContext(),"You Follow This, you'll be taken to the next FeedBack, if any!",Toast.LENGTH_LONG).show();
        }
        if(id==R.id.dontapprove){
            Toast.makeText(getBaseContext(),"You DownVote This, you'll be taken to the FeedBack , if any!",Toast.LENGTH_LONG).show();
        }
    }
    public void nextorprevious(View view){
        int id=view.getId();
        if(id==R.id.next){
            Toast.makeText(getBaseContext(),"You'll be taken to the next Feedback",Toast.LENGTH_LONG).show();
        }
        if (id==R.id.previous){
            Toast.makeText(getBaseContext(),"You'll be taken to the previous FeedBack",Toast.LENGTH_LONG).show();
        }
    }
}
