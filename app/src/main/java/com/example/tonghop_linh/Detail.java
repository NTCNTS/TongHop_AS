package com.example.tonghop_linh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    TextView txtDetail,txtMota;
    ImageView imgAnh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imgAnh =(ImageView) findViewById(R.id.imageviewDetail);
        txtMota = (TextView) findViewById(R.id.textviewMoTa);
        txtDetail = (TextView) findViewById(R.id.textviewDetail);
        Intent intent = getIntent();

        imgAnh.setImageResource(intent.getIntExtra("anh",0));
        String noiDung = intent.getStringExtra("game");
        txtDetail.setText(noiDung);
        String moTa = intent.getStringExtra("mota");
        txtMota.setText((moTa));
    }
}