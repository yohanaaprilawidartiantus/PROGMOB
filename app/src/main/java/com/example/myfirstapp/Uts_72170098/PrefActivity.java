package com.example.myfirstapp.Uts_72170098;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myfirstapp.MainActivity;
import com.example.myfirstapp.R;

public class PrefActivity extends AppCompatActivity {
    String isLogin = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pref);


        final Button btnPref = (Button)findViewById(R.id.btnPref);


        SharedPreferences pref = PrefActivity.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
        final SharedPreferences.Editor editor = pref.edit();


        //MEMBACA PREF ISLOGIN APAKAH TRUE ATAU FALSE
         isLogin = pref.getString("isLogin","0");
        if(isLogin.equals("1")) {
        btnPref.setText("Logout");

        }else{
            btnPref.setText("Login");
        }

        //pengisian pref
        btnPref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isLogin = pref.getString("isLogin", "0");
                if (isLogin.equals("0")) {
                    editor.putString("isLogin", "1");
                    btnPref.setText("Logout");
                } else {
                    editor.putString("isLogin", "0");
                    btnPref.setText("Login");
                }
                editor.commit();
            }
        });
    }
}