package com.example.akash.feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    Button login;
    TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(Button)findViewById(R.id.loginbutton);
        signup=(TextView)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(getApplicationContext(),SignInActivity.class);
                startActivity(obj2);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(getApplicationContext(),Home.class);
                startActivity(obj2);
                finish();
            }
        });
    }
    public void toPassChangeScreen(View view){
        Intent obj2 = new Intent(getApplicationContext(),PassChange.class);
        startActivity(obj2);
    }
}
