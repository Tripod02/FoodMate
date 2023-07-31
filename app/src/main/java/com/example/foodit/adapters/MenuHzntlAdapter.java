package com.example.foodit.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodit.R;
import com.example.foodit.models.MenuHzntlModel;
import com.example.foodit.models.MenuVerModel;

import java.util.ArrayList;
import java.util.List;

public class MenuHzntlAdapter extends RecyclerView.Adapter<MenuHzntlAdapter.ViewHolder> {
    UpdateVerticalRecycle updateVerticalRecycle;
    Activity activity;
    ArrayList<MenuHzntlModel> list;
    boolean check=true,select=true;
    int row_index=-1;

    public MenuHzntlAdapter(UpdateVerticalRecycle updateVerticalRecycle, Activity activity, ArrayList<MenuHzntlModel> list) {
        this.updateVerticalRecycle = updateVerticalRecycle;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_horizontal_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<MenuVerModel> menuVerModels = new ArrayList<>();
            menuVerModels.add(new MenuVerModel(R.drawable.fav3, "Khana Khazana", "10:00-22:00", "4.8", "Min - Rs.80"));
            menuVerModels.add(new MenuVerModel(R.drawable.fries3, "Pind Da Dhaba", "09:00-22:00", "4.7", "Min - Rs.180"));
            menuVerModels.add(new MenuVerModel(R.drawable.icecream4, "Rasoi Ghar", "10:30-21:45", "3.8", "Min - Rs.280"));
            menuVerModels.add(new MenuVerModel(R.drawable.fav2, "Royal Darbar", "10:40-22:50", "4.9", "Min - Rs.380"));
            menuVerModels.add(new MenuVerModel(R.drawable.fav1, "Wave International", "10:00-22:20", "4.65", "Min - Rs.480"));
            menuVerModels.add(new MenuVerModel(R.drawable.dinner, "Chhaya Inn", "11:00-23:20", "4.5", "Min - Rs.580"));
            menuVerModels.add(new MenuVerModel(R.drawable.burger4, "Blue Diamond", "10:30-23:50", "3.2", "Min - Rs.680"));
            menuVerModels.add(new MenuVerModel(R.drawable.breakfast, "ATMOSPHERE", "00:00-12:00", "2.8", "Min - Rs.780"));
            updateVerticalRecycle.callBack(position, menuVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    row_index=position;
                    notifyDataSetChanged();
                    if (position==0){
                        ArrayList<MenuVerModel> menuVerModels=new ArrayList<>();
                        menuVerModels.add(new MenuVerModel(R.drawable.breakfast,"Khana Khazana","10:00-22:00","4.8","Min - Rs.80"));
                        menuVerModels.add(new MenuVerModel(R.drawable.lunch,"Pind Da Dhaba","09:00-22:00","4.7","Min - Rs.180"));
                        menuVerModels.add(new MenuVerModel(R.drawable.dinner,"Rasoi Ghar","10:30-21:45","3.8","Min - Rs.280"));

                        updateVerticalRecycle.callBack(position,menuVerModels);

                    } else if (position==1) {
                        ArrayList<MenuVerModel> menuVerModels=new ArrayList<>();
                        menuVerModels.add(new MenuVerModel(R.drawable.burger1,"Burger King","10:00-22:00","4.8","Min - Rs.80"));
                        menuVerModels.add(new MenuVerModel(R.drawable.burger2,"KFC","09:00-22:00","4.7","Min - Rs.180"));
                        menuVerModels.add(new MenuVerModel(R.drawable.burger4,"Chinese INN","10:30-21:45","3.8","Min - Rs.280"));
                        updateVerticalRecycle.callBack(position,menuVerModels);
                        
                    }
                    else if (position==2) {
                        ArrayList<MenuVerModel> menuVerModels=new ArrayList<>();
                        menuVerModels.add(new MenuVerModel(R.drawable.ver1,"Cafe Coffee Day","10:00-22:00","4.8","Min - Rs.80"));
                        menuVerModels.add(new MenuVerModel(R.drawable.ver2,"Barrista","09:00-22:00","4.7","Min - Rs.180"));
                        menuVerModels.add(new MenuVerModel(R.drawable.ver3,"StarBucks","10:30-21:45","3.8","Min - Rs.280"));
                        updateVerticalRecycle.callBack(position,menuVerModels);

                    }
                    else if (position==3) {
                        ArrayList<MenuVerModel> menuVerModels=new ArrayList<>();
                        menuVerModels.add(new MenuVerModel(R.drawable.breakfast,"Pablo Escobar","10:00-22:00","4.8","Min - Rs.80"));
                        menuVerModels.add(new MenuVerModel(R.drawable.lunch,"Lester Tester","09:00-22:00","4.7","Min - Rs.180"));
                        menuVerModels.add(new MenuVerModel(R.drawable.dinner,"Michael's Paradise","10:30-21:45","3.8","Min - Rs.280"));
                        updateVerticalRecycle.callBack(position,menuVerModels);

                    }
                    else if (position==4) {
                        ArrayList<MenuVerModel> menuVerModels=new ArrayList<>();
                        menuVerModels.add(new MenuVerModel(R.drawable.pizza1,"Pizza Hut","10:00-22:00","4.8","Min - Rs.80"));
                        menuVerModels.add(new MenuVerModel(R.drawable.pizza2,"Domino's","09:00-22:00","4.7","Min - Rs.180"));
                        menuVerModels.add(new MenuVerModel(R.drawable.pizza3,"La Pinoz Pizza","10:30-21:45","3.8","Min - Rs.280"));
                        menuVerModels.add(new MenuVerModel(R.drawable.pizza4,"Bonjour","10:40-22:50","4.9","Min - Rs.380"));
                        updateVerticalRecycle.callBack(position,menuVerModels);

                    }
                    else if (position==5) {
                        ArrayList<MenuVerModel> menuVerModels=new ArrayList<>();
                        menuVerModels.add(new MenuVerModel(R.drawable.fries1,"MC Donalds","10:00-22:00","4.8","Min - Rs.80"));
                        menuVerModels.add(new MenuVerModel(R.drawable.fries2,"PizzaHut","09:00-22:00","4.7","Min - Rs.180"));
                        menuVerModels.add(new MenuVerModel(R.drawable.fries3,"","10:30-21:45","3.8","Min - Rs.280"));
                        menuVerModels.add(new MenuVerModel(R.drawable.fries4,"Royal Darbar","10:40-22:50","4.9","Min - Rs.380"));

                        updateVerticalRecycle.callBack(position,menuVerModels);

                    }
                    else if (position==6) {
                        ArrayList<MenuVerModel> menuVerModels=new ArrayList<>();
                        menuVerModels.add(new MenuVerModel(R.drawable.sandwich1,"Khana Khazana","10:00-22:00","4.8","Min - Rs.80"));
                        menuVerModels.add(new MenuVerModel(R.drawable.sandwich2,"Pind Da Dhaba","09:00-22:00","4.7","Min - Rs.180"));
                        menuVerModels.add(new MenuVerModel(R.drawable.sandwich3,"Rasoi Ghar","10:30-21:45","3.8","Min - Rs.280"));
                        menuVerModels.add(new MenuVerModel(R.drawable.sandwich4,"Royal Darbar","10:40-22:50","4.9","Min - Rs.380"));
                        updateVerticalRecycle.callBack(position,menuVerModels);

                    }
                    else if (position==7) {
                        ArrayList<MenuVerModel> menuVerModels=new ArrayList<>();
                        menuVerModels.add(new MenuVerModel(R.drawable.icecream1,"Khana Khazana","10:00-22:00","4.8","Min - Rs.80"));
                        menuVerModels.add(new MenuVerModel(R.drawable.icecream2,"Pind Da Dhaba","09:00-22:00","4.7","Min - Rs.180"));
                        menuVerModels.add(new MenuVerModel(R.drawable.icecream4,"Rasoi Ghar","10:30-21:45","3.8","Min - Rs.280"));
                        menuVerModels.add(new MenuVerModel(R.drawable.icecream3,"Royal Darbar","10:40-22:50","4.9","Min - Rs.380"));

                        updateVerticalRecycle.callBack(position,menuVerModels);

                    }
                }
            });
            if (select){
                if (position==0){
                    holder.cardView.setBackgroundResource(R.drawable.background_customs);
                }
            }
            else {
                if (row_index==position){
                    holder.cardView.setBackgroundResource(R.drawable.background_customs);
                }
                else {
                    holder.cardView.setBackgroundResource(R.drawable.default_bg);

                }
            }
        }



    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.horizontal_image);
            name=itemView.findViewById(R.id.horizontal_text);
            cardView=itemView.findViewById(R.id.Card_menu_view);
        }
    }
}
