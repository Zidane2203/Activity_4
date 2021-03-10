package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edemail, edpassword;
    String Email ,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignIn);
        edemail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Email = edemail.getText().toString();

                Password = edpassword.getText().toString();

                String email="admin@gmail.com";
                String pass="123";

                if (Email.equals(email) && Password.equals(pass))
                {
                    Toast t = Toast.makeText(getApplicationContext(),
                            text: "Login Sukses", Toast.LENGTH_LONG);
                    t.show();
                }
                else
                {
                    Toast t = Toast.makeText(getApplicationContext(),
                            text: "Login Gagal", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}