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
import com.example.foodit.models.MenuHzntlModel;
import com.example.foodit.models.MenuViewModel;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Fragment {
    RecyclerView menuhzntlRec;
    List<MenuHzntlModel> menuHzntlModelList;
    MenuHzntlAdapter menuHzntlAdapter;

    private MenuViewModel mViewModel;

    public static Menu newInstance() {
        return new Menu();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.fragment_menu, container, false);
        menuhzntlRec= root.findViewById(R.id.for_hor_menu);
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

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MenuViewModel.class);
        // TODO: Use the ViewModel
    }

}