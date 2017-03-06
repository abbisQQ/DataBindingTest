package com.example.babis.databindingtest;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.babis.databindingtest.databinding.AdapterSimpleProjectBinding;

/**
 * Created by Babis on 3/6/2017.
 */

public class SimpleObjectViewHolder  extends RecyclerView.ViewHolder{

    private AdapterSimpleProjectBinding binding;

    public SimpleObjectViewHolder(AdapterSimpleProjectBinding _binding) {
        super(_binding.getRoot());
        binding= _binding;

    }

    public void  bindConnection(SimpleObject simpleObject){
        binding.setSimpleObject(simpleObject);
    }

}
