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
import com.example.foodit.adapters.UpdateVerticalRecycle;
import com.example.foodit.models.MenuHzntlModel;
import com.example.foodit.models.MenuVerModel;
import com.example.foodit.models.MenuViewModel;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Fragment implements UpdateVerticalRecycle {
    RecyclerView menuhzntlRec,menuVerRec;


    ////HORIZONTAL///
    ArrayList<MenuHzntlModel> menuHzntlModelList;
    MenuHzntlAdapter menuHzntlAdapter;

    ///VERTICAL///
    ArrayList<MenuVerModel>menuVerModelList;
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
        menuHzntlAdapter= new MenuHzntlAdapter(this,getActivity(),menuHzntlModelList);
        menuhzntlRec.setAdapter(menuHzntlAdapter);
        menuhzntlRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        menuhzntlRec.setHasFixedSize(true);
        menuhzntlRec.setNestedScrollingEnabled(false);
                                                                          ///HORIZONTAL RECYCLER VIEW///


                                                                            ///VERTICAL RECYCLER VIEW///
        menuVerModelList=new ArrayList<>();

        menuVerAdapter=new MenuVerAdapter(getActivity(),menuVerModelList);
        menuVerRec.setAdapter(menuVerAdapter);
        menuVerRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));


                                                                            ///VERTICAL RECYCLER VIEW///

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MenuViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void callBack(int position, ArrayList<MenuVerModel> list) {
        menuVerAdapter=new MenuVerAdapter(getContext(),list);
        menuVerAdapter.notifyDataSetChanged();
        menuVerRec.setAdapter(menuVerAdapter);

    }
}