package dk.gruppe4.eventapp;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
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
    private void login()
    {
        TextView pt =(TextView) findViewById(R.id.passwordText);
        TextView ut =(TextView) findViewById(R.id.usernameText);
        CharSequence text = "";
        boolean showToast = false;
        if(pt.length() != 0 && ut.length() != 0)
        {
            text = "Udfyld username og password";
            showToast = true;
        }
        else if(pt.length() != 0) {
            text = "Udfyld password";
            showToast = true;
        }
        else if(ut.length() != 0)
        {
            text = "Udfyld password";
            showToast = true;
        }
        if(showToast == true)
        {
            int duration = Toast.LENGTH_SHORT;
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            showToast = false;
        }
    }
    private void OnCreate(Bundle savedInstaceState)
    {
        
    }
}
