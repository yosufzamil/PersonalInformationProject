package com.example.zamil.personalinformation;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText pEditName,fEditName,dEditName,eEditName,cEditName;
    TextView name,fatherName,distName,email,cell;
    Button okButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pEditName = (EditText) findViewById(R.id.name);
        fEditName = (EditText) findViewById(R.id.father);
        dEditName = (EditText) findViewById(R.id.dist);
        eEditName = (EditText)  findViewById(R.id.email);
        cEditName = (EditText) findViewById(R.id.cell);
        okButton = (Button) findViewById(R.id.buttonShow);


        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameString = pEditName.getText().toString();
                String fatherString = fEditName.getText().toString();
                String distString = dEditName.getText().toString();
                String emailString = eEditName.getText().toString();
                String cellString = cEditName.getText().toString();

                Intent intent = new Intent(MainActivity.this,LastActivity.class);

                intent.putExtra("PERSON_NAME",nameString);
                intent.putExtra("FATHER_NAME",fatherString);
                intent.putExtra("DISTRICT_NAME",distString);
                intent.putExtra("EMAIL",emailString);
                intent.putExtra("CELL_NUMBER",cellString);

                startActivity(intent);



            }
        });



    }


}
