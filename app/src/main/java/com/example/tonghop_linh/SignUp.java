package com.example.tonghop_linh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class SignUp extends AppCompatActivity {
    private EditText nameSu,usernaSu,passSu,birthSu,phoneSu,mailSu,loSu;
    private Button btSu;
    private User us;
    private ImageButton btBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        AnhXa();

        btSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                us=new User(nameSu.getText().toString(),birthSu.getText().toString(),phoneSu.getText().toString(),mailSu.getText().toString(),usernaSu.getText().toString(),passSu.getText().toString(),loSu.getText().toString());
                Contain.userList.add(us);
                Intent intent = new Intent(SignUp.this, Login.class);
                startActivity(intent);
            }
        });

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SignUp.this, Login.class);
                startActivity(intent2);
            }
        });

    }
    public void AnhXa(){
        nameSu = (EditText) findViewById(R.id.nameSu);
        usernaSu = (EditText) findViewById(R.id.usernameSu);
        passSu = (EditText) findViewById(R.id.passwordSu);
        birthSu = (EditText) findViewById(R.id.birthSu);
        phoneSu = (EditText) findViewById(R.id.phonenumberSu);
        mailSu = (EditText) findViewById(R.id.mailSu);
        loSu = (EditText) findViewById(R.id.locationSu);
        btSu = (Button) findViewById(R.id.buttonSu);
        btBack=(ImageButton) findViewById(R.id.back);
    }
}