package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView txtHelp = (TextView)findViewById(R.id.textViewHelp);

        Bundle b = getIntent().getExtras();
        String textHelp = b.getString("help_string");
        txtHelp.setText(textHelp);
    }
}