package com.example.recyclerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;


    public FragmentContact() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Aaron Jones", "0851234567", R.drawable.satu));
        lstContact.add(new Contact("Pacar Satu", "0851245125", R.drawable.dua));
        lstContact.add(new Contact("Saep Sukaesih", "08124215127", R.drawable.tiga));
        lstContact.add(new Contact("Pacar Dua", "0851512516", R.drawable.empat));
        lstContact.add(new Contact("Pacar Tiga", "08511612412", R.drawable.lima));
        lstContact.add(new Contact("Pacar Empat", "0851261412", R.drawable.enam));
        lstContact.add(new Contact("Kang Cilor", "08511251254", R.drawable.tujuh));
        lstContact.add(new Contact("Si Monyet", "08511612412", R.drawable.delapan));
        lstContact.add(new Contact("Mak Erot", "0851261412", R.drawable.sembilan));
        lstContact.add(new Contact("Bu Mega", "08511251254", R.drawable.sepuluh));



    }
}
