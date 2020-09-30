package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variabel
        final TextView txtView = (TextView)findViewById(R.id.mainActivityTextView);
        Button myBtn = (Button)findViewById(R.id.Button);
        final EditText myEditText = (EditText)findViewById(R.id.editText1);
        Button btnHelp = (Button)findViewById(R.id.btnHelp);

        //action
        txtView.setText(R.string.text_hello_world);
        btnEnter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

               // Log.d("COBA KLIKK ZEYENG", myEditText.getText().toString());
                txtView.setText(myEditText.getText().toString());
            }
        });
    btnHelp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent( packageContext: MainActivity.this,helpActivity.class);;
            Bundle b = new Bundle();

            b.putString("help_string",myEditText.getText().toString());
            intent.putExtras(b);

            startActivity(intent);
        }
    });


    }

}