package com.a2valdez.ulp_moviles_examen_final.ui.home;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation;

import com.a2valdez.ulp_moviles_examen_final.MainActivity;
import com.a2valdez.ulp_moviles_examen_final.R;

import java.util.List;

public class NotaViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<String> mNota;

    public NotaViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public LiveData<String> getmNota() {
        if(mNota == null){
            mNota = new MutableLiveData<>();
        }
        return mNota;
    }

    public void obtenerResultado(Bundle bundle){
        String resultado = bundle.getString("nota");
        mNota.setValue(resultado);
    }

    public void eliminarElemento(String nota){
        MainActivity.lista.remove((String)nota);
    }

}