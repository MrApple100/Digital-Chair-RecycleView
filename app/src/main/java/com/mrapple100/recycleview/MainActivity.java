package com.mrapple100.recycleview;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.mrapple100.recycleview.adapter.AnimalAdapter;
import com.mrapple100.recycleview.data.Card;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card("E","A",9));
        cards.add(new Card("B","I",10));
        cards.add(new Card("G","K",90));
        cards.add(new Card("T","A",93));
        RecyclerView recyclerView = findViewById(R.id.recycleview);
        recyclerView.setAdapter(new AnimalAdapter(cards));
    }


}
