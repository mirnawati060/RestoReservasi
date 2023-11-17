package com.mirnawati.restoreservasi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<HomeModel> dataholder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder=new ArrayList<>();

        HomeModel ob1=new HomeModel(R.drawable.narasa, "Narasa Resto", "Jl.Pemuda");
        dataholder.add(ob1);

        HomeModel ob2=new HomeModel(R.drawable.katulistiwa, "Khatulistiwa Resto", "Jl.S Parman");
        dataholder.add(ob2);

        HomeModel ob3=new HomeModel(R.drawable.darisa, "Darisa Resto", "Jl.Setia Budi");
        dataholder.add(ob3);

        HomeModel ob4=new HomeModel(R.drawable.chickenbim, "Chicken Bim Resto", "Jl.Soeprapto");
        dataholder.add(ob4);

        HomeModel ob5=new HomeModel(R.drawable.kemuning, "Kemuning Resto", "Jl.Rajamoili");
        dataholder.add(ob5);

        HomeModel ob6=new HomeModel(R.drawable.minihome, "Mini Home Caffe and Resto", "Jl.Bente");
        dataholder.add(ob6);

        HomeModel ob7=new HomeModel(R.drawable.palukuring, "Palu Kuring Resto", "Jl.Dr.Abdurrahman Saleh");
        dataholder.add(ob7);

        recyclerView.setAdapter(new MyAdapter(dataholder));

        return view;
    }
}