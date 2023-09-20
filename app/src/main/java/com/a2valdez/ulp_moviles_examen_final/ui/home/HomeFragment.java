package com.a2valdez.ulp_moviles_examen_final.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.a2valdez.ulp_moviles_examen_final.R;
import com.a2valdez.ulp_moviles_examen_final.databinding.FragmentHomeBinding;

import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel mv = new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        mv.getmLista().observe(getViewLifecycleOwner(), new Observer<List<String>>() {
            @Override
            public void onChanged(List<String> listaActual) {
                RecyclerView rv = root.findViewById(R.id.rvNotas);
                GridLayoutManager glm = new GridLayoutManager(getContext(), 5, GridLayoutManager.HORIZONTAL, false);
                rv.setLayoutManager(glm);
                NotaAdapter nad = new NotaAdapter(listaActual, getContext(), getLayoutInflater());
                rv.setAdapter(nad);
            }
        });
        mv.setLista();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}