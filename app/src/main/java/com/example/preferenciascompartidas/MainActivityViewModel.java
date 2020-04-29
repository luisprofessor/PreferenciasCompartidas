package com.example.preferenciascompartidas;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends AndroidViewModel {

    private Context contexto;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        contexto=application.getApplicationContext();
    }

    public void guardarDatos(int color, String usuario){
        SharedPreferences pref= contexto.getSharedPreferences("miarchivo",0);
        SharedPreferences.Editor editor= pref.edit();
        editor.putInt("color",color);
        editor.putString("usuario",usuario);
        editor.commit();
        Intent intent=new Intent(contexto,Mostrar.class);
        contexto.startActivity(intent);
    }
}
