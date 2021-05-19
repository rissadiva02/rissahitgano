package com.example.intentvalidation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText password;
    EditText username;
    TextView result;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);
        result = (TextView) findViewById(R.id.result);
    }


    public void login (View veiw){
        boolean  v;
        String name=username.getText().toString();

        do {
            if(username.getText().toString().equals("aprilgrace") && password.getText().toString().equals("tabilin03")){
                Intent intent=new Intent (this, Main2.class);
                intent.putExtra("NAME", name);
                startActivity(intent);
            }
            else if(username.getText().toString().equals("jeflennyuan") && password.getText().toString().equals("bautista01")){
                Intent intent=new Intent (this, Main3.class);
                intent.putExtra("NAME", name);
                startActivity(intent);
            }
            else if(username.getText().toString().equals("rissadiva") && password.getText().toString().equals("hitgano02")){
                Intent intent=new Intent (this, Main4.class);
                intent.putExtra("NAME", name);
                startActivity(intent);
            }

            else {result.setText("invalid"); v=false;
            }



        }while(v=false);
    }



}