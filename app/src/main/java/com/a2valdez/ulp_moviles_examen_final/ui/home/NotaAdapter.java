package com.a2valdez.ulp_moviles_examen_final.ui.home;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.a2valdez.ulp_moviles_examen_final.R;

import java.util.List;

public class NotaAdapter extends RecyclerView.Adapter<NotaAdapter.ViewHolder> {

    private List<String> notas;
    private Context contexto;
    private LayoutInflater li;

    public NotaAdapter(List<String> notas, Context contexto, LayoutInflater li) {
        this.notas = notas;
        this.contexto = contexto;
        this.li = li;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = li.inflate(R.layout.item_nota, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nota.setText(notas.get(position));
    }

    @Override
    public int getItemCount() {
        return notas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView nota;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nota = itemView.findViewById(R.id.tvNota);
            itemView.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceType")
                @Override
                public void onClick(View view) {
                    Bundle bundle = new Bundle();
                    Log.d("salida", nota.getText().toString());
                    bundle.putString("nota", nota.getText().toString());
                    Navigation.findNavController(view).navigate(R.id.notaFragment, bundle);
                }
            });
        }
    }
}
