package com.example.tonghop_linh;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
import java.util.List;


public class menu_list extends Fragment {
    private ListView listView;
    private ArrayList<Game> gameList;
    private GameAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.activity_list,container,false);
        listView=view.findViewById(R.id.list_view);
        gameList = new ArrayList<>();

        AddArrayGame();

        adapter=new GameAdapter(getContext(),R.layout.dong_game,gameList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), Detail.class);
                intent.putExtra("anh", gameList.get(i).getHinh());
                intent.putExtra("game", gameList.get(i).getTen());
                intent.putExtra("mota", gameList.get(i).getMoTa());
                startActivity(intent);
            }
        });

        return view;
    }

    private void AddArrayGame(){
        gameList.add(new Game("Pubg", "Game Sinh Ton","15$",R.drawable.pubg));
        gameList.add(new Game("Csgo", "Game ban sung","7$",R.drawable.csgo));
        gameList.add(new Game("LOL", "Game Moba","Free",R.drawable.lol));
        gameList.add(new Game("Gta V", "Game Role Play","25$",R.drawable.gta5));
        gameList.add(new Game("Dota2", "Game Moba","Free",R.drawable.dota2));
    }
}
