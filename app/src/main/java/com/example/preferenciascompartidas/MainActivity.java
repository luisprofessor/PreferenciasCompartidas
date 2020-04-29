package com.example.preferenciascompartidas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private MainActivityViewModel vm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vm=new MainActivityViewModel(getApplication());

    }


    public void guardar(View view){

        int color=1;
        String usuario="Juan Perez";

        vm.guardarDatos(color,usuario);

    }
}
