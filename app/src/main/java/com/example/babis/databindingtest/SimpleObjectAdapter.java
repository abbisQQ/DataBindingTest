package com.example.babis.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.babis.databindingtest.databinding.AdapterSimpleProjectBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Babis on 3/6/2017.
 */

public class SimpleObjectAdapter extends RecyclerView.Adapter<SimpleObjectViewHolder> {

    private ArrayList<SimpleObject> items;

    public SimpleObjectAdapter(ArrayList<SimpleObject> items) {
        this.items = items;
    }

    @Override
    public SimpleObjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AdapterSimpleProjectBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.adapter_simple_project,parent,false);
        return  new SimpleObjectViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(SimpleObjectViewHolder holder, int position) {
        holder.bindConnection(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
