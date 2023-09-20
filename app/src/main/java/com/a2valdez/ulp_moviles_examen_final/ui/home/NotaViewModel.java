package com.a2valdez.ulp_moviles_examen_final.ui.home;

import android.os.Bundle;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.a2valdez.ulp_moviles_examen_final.MainActivity;

import java.util.List;

public class NotaViewModel extends ViewModel {
    private MutableLiveData<String> mNota;

    public LiveData<String> getmNota() {
        if(mNota == null){
            mNota = new MutableLiveData<>();
        }
        return mNota;
    }

    public void obtenerResultado(Bundle bundle){
        Log.d("salida", bundle.getString("nota"));
        String resultado = bundle.getString("nota");
        mNota.setValue(resultado);
    }

}