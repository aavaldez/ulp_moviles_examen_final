package com.a2valdez.ulp_moviles_examen_final.ui.home;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.a2valdez.ulp_moviles_examen_final.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeViewModel extends AndroidViewModel {

    private Context context;

    private MutableLiveData<List<String>> mLista;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public LiveData<List<String>> getmLista() {
        if(mLista == null){
            mLista = new MutableLiveData<>();
        }
        return mLista;
    }

    public void setLista(){
        mLista.setValue(MainActivity.lista);
    }
}