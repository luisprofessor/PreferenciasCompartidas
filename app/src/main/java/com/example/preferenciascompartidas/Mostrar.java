package com.example.preferenciascompartidas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Mostrar extends AppCompatActivity {
private TextView tvColor, tvUsuario;
private MostrarViewModel vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        tvColor=findViewById(R.id.tvColor);
        tvUsuario=findViewById(R.id.tvUsuario);

        vm=new MostrarViewModel(getApplication());

        vm.getColorMutable().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tvColor.setText(integer+"");
            }
        });

        vm.getUsuarioMutable().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                tvUsuario.setText(s);
            }
        });

        vm.leer();

    }
}
