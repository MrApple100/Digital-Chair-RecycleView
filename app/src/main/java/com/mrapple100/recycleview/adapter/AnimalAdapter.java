package com.mrapple100.recycleview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mrapple100.recycleview.R;
import com.mrapple100.recycleview.data.Card;

import java.util.List;


public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalHolder> {

    private List<Card> cards;

    public AnimalAdapter(List<Card> cards) {
        this.cards =cards;
    }

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.animalcard,parent,false);
        return new AnimalHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder holder, int position) {
        holder.Animal.setText(cards.get(position).animal);
        holder.Name.setText(cards.get(position).Name);
        holder.Age.setText(cards.get(position).age+"");

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    class AnimalHolder extends RecyclerView.ViewHolder{
        TextView Animal;
        TextView Name;
        TextView Age;
        public AnimalHolder(@NonNull View itemView) {
            super(itemView);
             Animal = itemView.findViewById(R.id.Animal);
             Name = itemView.findViewById(R.id.Name);
             Age = itemView.findViewById(R.id.Age);

        }
    }
}
