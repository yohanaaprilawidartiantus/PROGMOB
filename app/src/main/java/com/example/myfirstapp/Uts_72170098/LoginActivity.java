package com.example.myfirstapp.Uts_72170098;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfirstapp.R;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.editTextUser);
        password = (EditText) findViewById(R.id.editTextPass);
        login = (Button) findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")){
                    Intent i = new Intent(LoginActivity.this.getApplicationContext(),
                            Logout.class);
                    i.putExtra("message", "0");
                    startActivity(i);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Invalid Details",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
