package com.example.tonghop_linh;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class menu_profile extends Fragment {

    TextView namePf,phonePf,usernaPf,mailPf,passPf,birthPf,locPf;
    Button btnPf;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.activity_profile,container,false);

            namePf=view.findViewById(R.id.namepf);
            phonePf= view.findViewById(R.id.phonenumberPf);
            usernaPf= view.findViewById(R.id.usernamePf);
            mailPf= view.findViewById(R.id.mailPf);
            birthPf= view.findViewById(R.id.birthPf);
            locPf= view.findViewById(R.id.locationPf);
            btnPf= view.findViewById(R.id.buttonPf);

        namePf.setText(Contain.user.getName());
        usernaPf.setText(Contain.user.getUsername());
        phonePf.setText(Contain.user.getPhone());
        birthPf.setText(Contain.user.getBirth());
        mailPf.setText(Contain.user.getMail());
        locPf.setText(Contain.user.getLocation());

        btnPf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),Login.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
