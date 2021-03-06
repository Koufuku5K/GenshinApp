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
                        .navigate(R.id.action_mondstadt2_to_razorFragment);
            }
        });

        //proceed to bennett fragment when button is clicked
        binding.bennett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_mondstadt2_to_bennettFragment);
            }
        });

        //proceed to noelle fragment when button is clicked
        binding.noelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_mondstadt2_to_noelleFragment);
            }
        });

        //proceed to fischl fragment when button is clicked
        binding.fischl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_mondstadt2_to_fischlFragment);
            }
        });

        //proceed to sucrose fragment when button is clicked
        binding.sucrose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_mondstadt2_to_sucroseFragment);
            }
        });

        //proceed to diona fragment when button is clicked
        binding.diona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_mondstadt2_to_dionaFragment);
            }
        });

        //proceed to rosaria fragment when button is clicked
        binding.rosaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Mondstadt2Fragment.this)
                        .navigate(R.id.action_mondstadt2_to_rosariaFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}