package com.example.myfirst2020app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int numCheesecakes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("info", "----------------This is a message in the log ----------------------");
        Log.e("error", "----------------This is an error message in the log ----------------------");
        Log.w("warning", "----------------This is a warning message in the log ----------------------");
        Log.wtf("What a Terrible Failure", "----------------Oh man!  That REAALLY shouldn't have happened!! ----------------------");

        Toast.makeText(this, "Can you see me?", Toast.LENGTH_LONG).show();
    }

    public void onClickAddOne(View view)
    {
        numCheesecakes++;
        Toast.makeText(this, "You have counted to " + numCheesecakes, Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.tallyTV)).setText("You have " + numCheesecakes);
    }

    public void onClickSubtractOne(View view)
    {
        numCheesecakes--;
        Toast.makeText(this, "You have counted to " + numCheesecakes, Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.tallyTV)).setText("You have " + numCheesecakes);
    }

    public void toPageTwo(View view)
    {
        startActivity(new Intent(MainActivity.this, Screen2.class));
    }
/*
    public void topClick(View v)
    {
        Toast.makeText(this, "You clicked the top button", Toast.LENGTH_SHORT).show();
        Log.i("info", "The user clicked the top button");
    }//end event handler for the top button

    public void bottomClick(View v)
    {
        Toast.makeText(this, "Congratulations!  You clicked the bottom button", Toast.LENGTH_SHORT).show();
        Log.i("info", "The user prefers to be argumentative");
    }//end event handler for the top button
*/

}