package com.example.akash.feedback;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private ImageView navDrawer;
    public com.github.clans.fab.FloatingActionButton distress,poll,senior,general;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        distress=(com.github.clans.fab.FloatingActionButton)findViewById(R.id.floatingdistress);
        poll=(com.github.clans.fab.FloatingActionButton)findViewById(R.id.floatingpoll);
        senior=(com.github.clans.fab.FloatingActionButton)findViewById(R.id.floatingsenior);
        general=(com.github.clans.fab.FloatingActionButton)findViewById(R.id.floatinggeneral);

        distress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(getApplicationContext(),FloatingDistressMessage.class);
                startActivity(obj2);
                Toast.makeText(getBaseContext(),"Distress Message",Toast.LENGTH_SHORT).show();
            }
        });
        poll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj2 = new Intent(getApplicationContext(),FloatingPollMessage.class);
                startActivity(obj2);
                Toast.makeText(getBaseContext(),"Poll Message",Toast.LENGTH_SHORT).show();
            }
        });
        senior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Senior Message",Toast.LENGTH_SHORT).show();
                Intent obj2 = new Intent(getApplicationContext(),FloatingSeniorMessage.class);
                startActivity(obj2);
            }
        });
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"General Message",Toast.LENGTH_SHORT).show();
                Intent obj2 = new Intent(getApplicationContext(),FloatingGeneralMessage.class);
                startActivity(obj2);
            }
        });

        navDrawer=(ImageView)findViewById(R.id.navdrawerbutton);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
        navDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(0).setChecked(true);
    }
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.dashboard) {
            Toast.makeText(this,"Dashboard",Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.mymessages){
            Toast.makeText(this,"Message",Toast.LENGTH_SHORT).show();
            Intent obj2 = new Intent(getApplicationContext(),MyMessages.class);
            startActivity(obj2);
        }
        else if(id == R.id.following){
            Toast.makeText(this,"Following",Toast.LENGTH_SHORT).show();
            Intent obj2 = new Intent(getApplicationContext(),FollowingScreen.class);
            startActivity(obj2);
        }
        else if(id == R.id.managelobbies){
            Intent obj2 = new Intent(getApplicationContext(),ManageLobbies.class);
            startActivity(obj2);
            Toast.makeText(this,"Manage Lobbies",Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.myteams){
            Toast.makeText(this,"My Teams",Toast.LENGTH_SHORT).show();
            Intent obj2 = new Intent(getApplicationContext(),Team.class);
            startActivity(obj2);
        }
        else if(id == R.id.editprofilescreen){
            Toast.makeText(this,"Edit Profile",Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.logoutoutscreen){
            Toast.makeText(this,"Log Out",Toast.LENGTH_SHORT).show();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void selectpoll(View view) {
        int id=view.getId();
        if(id==R.id.pollcardfood){

            Intent obj2 = new Intent(getApplicationContext(),FoodPollScreenOne.class);
            startActivity(obj2);
        }else if(id==R.id.pollcarddept){

            Intent obj2 = new Intent(getApplicationContext(),DeptPollScreenOne.class);
            startActivity(obj2);
        }else if(id==R.id.pollcardpurchase){

            Intent obj2 = new Intent(getApplicationContext(),HRPollScreen.class);
            startActivity(obj2);
        }else if(id==R.id.pollcardhr){

            Intent obj2 = new Intent(getApplicationContext(),HRPollScreen.class);
            startActivity(obj2);
        }else if(id==R.id.pollcardsecurity){

            Intent obj2 = new Intent(getApplicationContext(),HRPollScreen.class);
            startActivity(obj2);
        }
    }
    public void selectlobby(View view){
        int id=view.getId();
        if(id==R.id.accountslobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.generallobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.prodlobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.accountslobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.legallobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.supportlobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.traininglobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.adminlobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.designlobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.deptlobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.purchaselobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }if(id==R.id.securitylobby){
            Intent obj2 = new Intent(getApplicationContext(),LobbyScreen.class);
            startActivity(obj2);
        }


    }
}
