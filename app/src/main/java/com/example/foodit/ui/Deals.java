package com.example.foodit.ui;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodit.R;
import com.example.foodit.adapters.DealsAdapter;
import com.example.foodit.models.DealsModel;
import com.example.foodit.models.DealsViewModel;

import java.util.ArrayList;
import java.util.List;


public class Deals extends Fragment {
    RecyclerView recyclerView;
    List<DealsModel> dealsModelList;
    DealsAdapter dealsAdapter;




    private DealsViewModel mViewModel;






    public static Deals newInstance() {
        return new Deals();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_deals, container, false);
        recyclerView=root.findViewById(R.id.deals);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dealsModelList=new ArrayList<>();

        dealsModelList.add(new DealsModel(R.drawable.breakfast,"Breakfast","30% OFF","Early morning healthy",
                "One stop destination for enriching breakfast"));
        dealsModelList.add(new DealsModel(R.drawable.lunch,"Lunch","20% OFF","Mid Day Good Day ",
                "One stop destination for tasty and healthy afternoon meals"));

        dealsModelList.add(new DealsModel(R.drawable.dinner,"Dinner","25% OFF","Good night eat tight",
                "Good dinner and good sleep makes a man sound deep"));

        dealsModelList.add(new DealsModel(R.drawable.coffe,"Coffee","35% OFF","Breakthrough",
                "A cup of coffee can wash away all the sleep"));

        dealsModelList.add(new DealsModel(R.drawable.sweets,"Sweets","45% OFF","Sugar rush",
                "Once a good sweet always a good sweet"));
        dealsAdapter=new DealsAdapter(getContext(),dealsModelList);
        recyclerView.setAdapter(dealsAdapter);
        dealsAdapter.notifyDataSetChanged();

        return  root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DealsViewModel.class);
        // TODO: Use the ViewModel
    }

}