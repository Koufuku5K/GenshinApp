package com.example.genshinapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavHost;
import androidx.navigation.fragment.NavHostFragment;

import com.example.genshinapp.databinding.FragmentLiyueBinding;
import com.example.genshinapp.databinding.FragmentSecondBinding;

public class LiyueFragment extends Fragment {

    private FragmentLiyueBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentLiyueBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //proceed to next fragment
        binding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
                        .navigate(R.id.action_Mondstadt_to_mondstadt2);
            }
        });

        //proceed to keqing fragment when button is clicked
        binding.keqing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
                        .navigate(R.id.action_Liyue_to_keqingFragment);
            }
        });

        //proceed to lisa fragment when button is clicked
        binding.beidou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
                        .navigate(R.id.action_Mondstadt_to_lisaFragment);
            }
        });

        //proceed to eula fragment when button is clicked
        binding.hutao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
                        .navigate(R.id.action_Mondstadt_to_eulaFragment);
            }
        });

        //proceed to venti fragment when button is clicked
        binding.zhongli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
                        .navigate(R.id.action_Mondstadt_to_ventiFragment);
            }
        });

        //proceed to diluc fragment when button is clicked
        binding.ganyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
                        .navigate(R.id.action_Mondstadt_to_dilucFragment);
            }
        });

        //proceed to klee fragment when button is clicked
        binding.tartaglia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
                        .navigate(R.id.action_Mondstadt_to_kleeFragment);
            }
        });

        //proceed to mona fragment when button is clicked
        binding.xiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
                        .navigate(R.id.action_Mondstadt_to_monaFragment);
            }
        });

        //proceed to albedo fragment when button is clicked
        binding.qiqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
                        .navigate(R.id.action_Mondstadt_to_albedoFragment);
            }
        });

        //proceed to amber fragment when button is clicked
        binding.ningguang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
                        .navigate(R.id.action_Mondstadt_to_amberFragment);
            }
        });

        //proceed to kaeya fragment when button is clicked
        binding.xiangling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LiyueFragment.this)
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