package com.example.genshinapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavHost;
import androidx.navigation.fragment.NavHostFragment;

import com.example.genshinapp.databinding.FragmentMondstadtBinding;
import com.example.genshinapp.databinding.FragmentSecondBinding;

public class MondstadtFragment extends Fragment {

    private FragmentMondstadtBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentMondstadtBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //return to previous fragment
        binding.previous2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_Region);
            }
        });

        //proceed to jean fragment when button is clicked
        binding.jean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_jeanFragment);
            }
        });

        //proceed to lisa fragment when button is clicked
        binding.lisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_lisaFragment);
            }
        });

        //proceed to eula fragment when button is clicked
        binding.eula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_eulaFragment);
            }
        });

        //proceed to venti fragment when button is clicked
        binding.venti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_ventiFragment);
            }
        });

        //proceed to diluc fragment when button is clicked
        binding.diluc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_dilucFragment);
            }
        });

        //proceed to klee fragment when button is clicked
        binding.klee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_kleeFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}