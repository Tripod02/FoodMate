package com.example.foodit.ui;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodit.R;
import com.example.foodit.adapters.MenuHzntlAdapter;
import com.example.foodit.adapters.MenuVerAdapter;
import com.example.foodit.models.MenuHzntlModel;
import com.example.foodit.models.MenuVerModel;
import com.example.foodit.models.MenuViewModel;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Fragment {
    RecyclerView menuhzntlRec,menuVerRec;


    ////HORIZONTAL///
    List<MenuHzntlModel> menuHzntlModelList;
    MenuHzntlAdapter menuHzntlAdapter;

    ///VERTICAL///
    List<MenuVerModel>menuVerModelList;
    MenuVerAdapter menuVerAdapter;

    private MenuViewModel mViewModel;

    public static Menu newInstance() {
        return new Menu();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.fragment_menu, container, false);
        menuhzntlRec= root.findViewById(R.id.for_hor_menu);
        menuVerRec=root.findViewById(R.id.for_ver_menu);

                                                                          ///HORIZONTAL RECYCLER VIEW///
        menuHzntlModelList=new ArrayList<>();
        menuHzntlModelList.add(new MenuHzntlModel(R.drawable.breakfast,"Breakfast"));
        menuHzntlModelList.add(new MenuHzntlModel(R.drawable.burger4,"Burger"));
        menuHzntlModelList.add(new MenuHzntlModel(R.drawable.coffe,"Coffee"));
        menuHzntlModelList.add(new MenuHzntlModel(R.drawable.lunch,"Lunch"));
        menuHzntlModelList.add(new MenuHzntlModel(R.drawable.pizza1,"Pizza"));
        menuHzntlModelList.add(new MenuHzntlModel(R.drawable.fries2,"Fries"));
        menuHzntlModelList.add(new MenuHzntlModel(R.drawable.sandwich3,"Sandwich"));
        menuHzntlModelList.add(new MenuHzntlModel(R.drawable.s2,"Sweets"));
        menuHzntlAdapter= new MenuHzntlAdapter(getActivity(),menuHzntlModelList);
        menuhzntlRec.setAdapter(menuHzntlAdapter);
        menuhzntlRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        menuhzntlRec.setHasFixedSize(true);
        menuhzntlRec.setNestedScrollingEnabled(false);
                                                                          ///HORIZONTAL RECYCLER VIEW///


                                                                            ///VERTICAL RECYCLER VIEW///
        menuVerModelList=new ArrayList<>();
        menuVerModelList.add(new MenuVerModel(R.drawable.fav3,"Khana Khazana","10:00-22:00","4.8","Min - Rs.80"));
        menuVerModelList.add(new MenuVerModel(R.drawable.fries3,"Pind Da Dhaba","09:00-22:00","4.7","Min - Rs.180"));
        menuVerModelList.add(new MenuVerModel(R.drawable.icecream4,"Rasoi Ghar","10:30-21:45","3.8","Min - Rs.280"));
        menuVerModelList.add(new MenuVerModel(R.drawable.fav2,"Royal Darbar","10:40-22:50","4.9","Min - Rs.380"));
        menuVerModelList.add(new MenuVerModel(R.drawable.fav1,"Wave International","10:00-22:20","4.65","Min - Rs.480"));
        menuVerModelList.add(new MenuVerModel(R.drawable.dinner,"Chhaya Inn","11:00-23:20","4.5","Min - Rs.580"));
        menuVerModelList.add(new MenuVerModel(R.drawable.burger4,"Blue Diamond","10:30-23:50","3.2","Min - Rs.680"));
        menuVerModelList.add(new MenuVerModel(R.drawable.breakfast,"ATMOSPHERE","00:00-12:00","2.8","Min - Rs.780"));
        menuVerAdapter=new MenuVerAdapter(getActivity(),menuVerModelList);
        menuVerRec.setAdapter(menuVerAdapter);
        menuVerRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        menuVerRec.setHasFixedSize(true);
        menuVerRec.setNestedScrollingEnabled(false);

                                                                            ///VERTICAL RECYCLER VIEW///

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MenuViewModel.class);
        // TODO: Use the ViewModel
    }

}