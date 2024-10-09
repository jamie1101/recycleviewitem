package com.example.recycleviewitem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {

    private ArrayList<HashMap<String, String>> arrayList;
    public RecyclerviewAdapter(ArrayList<HashMap<String, String>> arrayList) {
        this.arrayList = arrayList;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tx1, tx2;

        public ViewHolder(View itemView) {
            super(itemView);
            tx1 = itemView.findViewById(R.id.textview);
            tx2 = itemView.findViewById(R.id.textview2);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleviewitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tx1.setText(arrayList.get(position).get("number"));
        holder.tx2.setText(arrayList.get(position).get("data"));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}


