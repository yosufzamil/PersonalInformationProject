package com.example.zamil.personalinformation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class LastActivity extends ActionBarActivity {

    TextView finalName,fatherName,districtName,email,cellNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        finalName = (TextView)findViewById(R.id.finalName);
        fatherName = (TextView)findViewById(R.id.finalFather);
        districtName = (TextView)findViewById(R.id.finalDist);
        email = (TextView)findViewById(R.id.finalEmail);
        cellNumber = (TextView)findViewById(R.id.finalCell);

        finalName.setText("Your name is : "+getIntent().getStringExtra("PERSON_NAME"));
        fatherName.setText("\nFather name is : "+getIntent().getStringExtra("FATHER_NAME"));
        districtName.setText("\nDistrict is : "+getIntent().getStringExtra("DISTRICT_NAME"));
        email.setText("\nE-mail is : "+getIntent().getStringExtra("EMAIL"));
        cellNumber.setText("\nCell Number is : "+getIntent().getStringExtra("CELL_NUMBER"));





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_last, menu);
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
