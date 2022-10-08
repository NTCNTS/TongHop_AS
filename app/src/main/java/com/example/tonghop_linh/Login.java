package com.example.tonghop_linh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btLHo,btLSu;
    EditText unLg,passLg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        AnhXa();
        User admin= new User("Linh","04/12/2002","0905999999","sylinh@gmail.com","admin","123","Da Nang");
                Contain.userList.add(admin);
        btLHo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(User us : Contain.userList)
                    if (us.getUsername().equals(unLg.getText().toString().trim()) && us.getPassword().equals(passLg.getText().toString().trim()))
                    {
                        Contain.user=us;
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                        Toast.makeText(Login.this, "Dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                    }else
                Toast.makeText(Login.this, "Dang nhap that bai", Toast.LENGTH_SHORT).show();
            }
        });

        btLSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,SignUp.class);
                startActivity(intent);
            }
        });
    }
    public void AnhXa(){
        btLHo = findViewById(R.id.buttonLg);
        btLSu = findViewById(R.id.buttonLSu);
        unLg = findViewById(R.id.usernamelogin);
        passLg =  findViewById(R.id.passLogin);
    }
}