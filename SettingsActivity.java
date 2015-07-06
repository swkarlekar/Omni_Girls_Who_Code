package com.example.loaner.omnia_3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SettingsActivity extends ActionBarActivity {
    public static String zipcode = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
        return true;
    }

    public void saveInformation(View v)
    {
        if(v.getId() == R.id.save_button1)
        {
            EditText ci = (EditText)findViewById(R.id.TFzipcode);
            zipcode = ci.getText().toString();
            TextView save = (TextView)findViewById(R.id.TVsavesuccess);
            save.setText("Save successful!");
        }
    }

    public void goBack(View v)
    {
        if(v.getId() == R.id.back_button2)
        {
            Intent i = new Intent(SettingsActivity.this, DisplayActivity.class);
            i.putExtra("Zip Code", zipcode);
            i.putExtra("ActivityFrom", "SettingsActivity");
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
