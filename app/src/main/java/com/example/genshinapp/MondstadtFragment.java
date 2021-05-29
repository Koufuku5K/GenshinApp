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

        //proceed to next fragment
        binding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_mondstadt2);
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

        //proceed to mona fragment when button is clicked
        binding.mona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_monaFragment);
            }
        });

        //proceed to albedo fragment when button is clicked
        binding.albedo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_albedoFragment);
            }
        });

        //proceed to amber fragment when button is clicked
        binding.amber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_amberFragment);
            }
        });

        //proceed to kaeya fragment when button is clicked
        binding.kaeya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(MondstadtFragment.this)
                        .navigate(R.id.action_Mondstadt_to_kaeyaFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}