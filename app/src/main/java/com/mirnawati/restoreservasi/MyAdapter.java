package com.mirnawati.restoreservasi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myviewholder> {
    ArrayList<HomeModel> dataholder;

    public MyAdapter(ArrayList<HomeModel> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.name.setText(dataholder.get(position).getName());
        holder.address.setText(dataholder.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView name, address;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            name=itemView.findViewById(R.id.t1);
            address=itemView.findViewById(R.id.t2);
        }
    }
}
