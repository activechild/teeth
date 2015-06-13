package com.androiddeveloperscode.teeth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rev.java.util.RevObject;


public class LandingPage extends Activity implements View.OnClickListener{

    // Landing page buttons
    Button fbLogin, emailLogin, registerBtn;
    TextView continueAsGutetBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
        setUpViews();

    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        switch( id ){
            case R.id.landing_pg_facebook_login_btn:
                RevObject.toast.toastShort(this, "Logging on to facebook...");
            break; // facebook button
            case R.id.landing_pg_email_login_btn:
                RevObject.toast.toastShort(this, "logging on via email...");
            break; // login w/ email button
            case R.id.landing_pg_register_btn:
                RevObject.toast.toastShort(this, "Registering...");
            break; // register button
            case R.id.landing_pg_continue_as_guest_btn:
                RevObject.toast.toastShort(this, "Continuing as a guest...");
                Intent intent = new Intent(LandingPage.this, MainPage.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            break; // continue as guest button
        }
    }


    private void setUpViews() {
        // assign views
        fbLogin = (Button) findViewById(R.id.landing_pg_facebook_login_btn);
        emailLogin = (Button) findViewById(R.id.landing_pg_email_login_btn);
        registerBtn = (Button) findViewById(R.id.landing_pg_register_btn);
        continueAsGutetBtn = (TextView) findViewById(R.id.landing_pg_continue_as_guest_btn);

        // set listeners
        fbLogin.setOnClickListener(this);
        emailLogin.setOnClickListener(this);
        registerBtn.setOnClickListener(this);
        continueAsGutetBtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
