package com.mrapple100.recycleview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.mrapple100.recycleview.R;
import com.mrapple100.recycleview.data.Card;
import com.mrapple100.recycleview.databinding.AnimalcardBinding;

import java.util.List;


public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalHolder> {

    private List<Card> cards;

    public AnimalAdapter(List<Card> cards) {
        this.cards =cards;
    }

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        AnimalcardBinding binding = AnimalcardBinding.inflate(inflater,parent,false);
        return new AnimalHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder holder, int position) {
        holder.binding.setAnimal(cards.get(position));

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    class AnimalHolder extends RecyclerView.ViewHolder{
        AnimalcardBinding binding;
        public AnimalHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);

        }
    }
}
