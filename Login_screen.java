package com.example.loaner.omnia_3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Display;
import android.content.Intent;
import android.widget.EditText;
import android.util.Log;
public class Login_screen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_screen, menu);
        return true;
    }

    public void onButtonClick(View v)
    {
        if(v.getId() == R.id.login_button)
        {
            EditText a = (EditText)findViewById(R.id.username);
            String str = a.getText().toString();
            Log.i("THIS IS THE ", str);

            Intent i = new Intent(Login_screen.this, DisplayActivity.class);
            i.putExtra("Username", str);
            i.putExtra("ActivityFrom", "Login_screen");
           // Log.i("THIS IS THE ", str);

            startActivity(i);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
