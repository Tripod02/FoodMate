package com.example.foodit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodit.R;
import com.example.foodit.models.MenuVerModel;

import java.util.List;

public class MenuVerAdapter extends RecyclerView.Adapter<MenuVerAdapter.ViewHolder> {
    Context context;
    List<MenuVerModel>list;

    public MenuVerAdapter(Context context, List<MenuVerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_vertical_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name,timing,rating,price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.vertical_image);
            name=itemView.findViewById(R.id.name_item);
            timing=itemView.findViewById(R.id.timing);
            rating=itemView.findViewById(R.id.rating);
            price=itemView.findViewById(R.id.min_price);

        }
    }
}
