package com.example.genshinapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavHost;
import androidx.navigation.fragment.NavHostFragment;

import com.example.genshinapp.databinding.FragmentMondstadt2Binding;
import com.example.genshinapp.databinding.FragmentSecondBinding;

public class Mondstadt2Fragment extends Fragment {

    private FragmentMondstadt2Binding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentMondstadt2Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //proceed to barbara fragment when button is clicked
        binding.barbara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_mondstadt2_to_barbaraFragment);
            }
        });

        //proceed to razor fragment when button is clicked
        binding.razor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_Mondstadt_to_lisaFragment);
            }
        });

        //proceed to bennett fragment when button is clicked
        binding.bennett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_Mondstadt_to_eulaFragment);
            }
        });

        //proceed to noelle fragment when button is clicked
        binding.noelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_Mondstadt_to_ventiFragment);
            }
        });

        //proceed to fischl fragment when button is clicked
        binding.fischl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_Mondstadt_to_dilucFragment);
            }
        });

        //proceed to sucrose fragment when button is clicked
        binding.sucrose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_Mondstadt_to_kleeFragment);
            }
        });

        //proceed to diona fragment when button is clicked
        binding.diona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_Mondstadt_to_monaFragment);
            }
        });

        //proceed to rosaria fragment when button is clicked
        binding.rosaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_Mondstadt_to_albedoFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}