package com.a2valdez.ulp_moviles_examen_final.ui.home;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a2valdez.ulp_moviles_examen_final.MainActivity;
import com.a2valdez.ulp_moviles_examen_final.databinding.FragmentNotaBinding;

public class NotaFragment extends Fragment {

    private FragmentNotaBinding binding;

    public static NotaFragment newInstance() {
        return new NotaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        NotaViewModel mv = new ViewModelProvider(this).get(NotaViewModel.class);
        binding = FragmentNotaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        mv.getmNota().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                binding.tvNota.setText(s);
            }
        });
        binding.btEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mv.obtenerResultado(getArguments());
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: Use the ViewModel
    }

}