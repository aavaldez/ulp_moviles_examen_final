package com.a2valdez.ulp_moviles_examen_final.ui.salir;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

import androidx.appcompat.app.AppCompatActivity;

public class SalirDialogo {

    public static void mostrarDialogo(Activity activity){
        new AlertDialog.Builder(activity)
                .setTitle("Salir")
                .setMessage("¿Cerrar la aplicación?")
                .setPositiveButton("Si", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        activity.finishAndRemoveTask();
                        activity.finishAffinity();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .show();

    }
}