package com.example.preferenciascompartidas;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MostrarViewModel extends AndroidViewModel {
    private Context contexto;
    private MutableLiveData<Integer> colorMutable;
    private MutableLiveData<String> usuarioMutable;

    public LiveData<Integer> getColorMutable() {
        if(colorMutable==null){
            colorMutable=new MutableLiveData<>();
        }
        return colorMutable;
    }

    public LiveData<String> getUsuarioMutable() {
        if(usuarioMutable==null){
            usuarioMutable=new MutableLiveData<>();
        }
        return usuarioMutable;
    }

    public MostrarViewModel(@NonNull Application application) {
        super(application);
        contexto=application.getApplicationContext();
    }

    public void leer(){
        SharedPreferences pref=contexto.getSharedPreferences("miarchivo",0);
        int color= pref.getInt("color",-1);
        String usuario=pref.getString("usuario","nn");
        colorMutable.setValue(color);
        usuarioMutable.setValue(usuario);

    }


}
