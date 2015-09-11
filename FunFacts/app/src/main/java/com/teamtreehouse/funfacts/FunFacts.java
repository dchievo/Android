package com.teamtreehouse.funfacts;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FunFacts extends AppCompatActivity {

    public static final String TAG = FunFacts.class.getSimpleName();

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables and assign the views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton  = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update the label with our dynamic fact
                factLabel.setText(factBook.getFact());
                relativeLayout.setBackgroundColor(colorWheel.mColors());
                showFactButton.setTextColor(colorWheel.mColors());
            }
        };
        showFactButton.setOnClickListener(listener);
        //Toast notification
        //Toast.makeText(this,"Yay! Our activity was created!",Toast.LENGTH_LONG).show();
        Log.d(TAG, "We're logging from the onCreate() method");

    }
}
