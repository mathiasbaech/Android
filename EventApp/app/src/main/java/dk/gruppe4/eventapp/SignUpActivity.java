package dk.gruppe4.eventapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.app.DialogFragment;
import android.widget.Toast;


import java.util.Calendar;

import dk.gruppe4.eventapp.Model.User;


public class SignUpActivity extends ActionBarActivity {
    private static final int MY_DATE_DIALOG_ID = 3;
    private DatePicker picker;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        picker = (DatePicker) findViewById(R.id.datePicker);
    }

    public void onDateSelectedButtonClick(View v){
        int day = picker.getDayOfMonth();
        int month = picker.getMonth() + 1;
        int year = picker.getYear();
        Toast.makeText(this, day + "/" + month + "/" + year, Toast.LENGTH_SHORT).show();

        String fName = findViewById(R.id.txtFirstName).toString();
        String lName = findViewById(R.id.txtLastName).toString();
        String email = findViewById(R.id.txtMailAddress).toString();
        String birthday = findViewById(R.id.txtBirthday).toString();
        int rank = 1;


        User u = new User(fName, lName, email, birthday, rank);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sign_up, menu);
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
}
