package com.example.tonghop_linh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    TextView txtDetail,txtMota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtMota = (TextView) findViewById(R.id.textviewMoTa);
        txtDetail = (TextView) findViewById(R.id.textviewDetail);
        Intent intent = getIntent();
        String noiDung = intent.getStringExtra("game");
        txtDetail.setText(noiDung);
        String moTa = intent.getStringExtra("mota");

        txtMota.setText((moTa));
    }
}