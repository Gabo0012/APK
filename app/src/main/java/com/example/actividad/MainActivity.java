package com.example.actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Mensaje
        Toast.makeText(this, "¡Bienvenido a AnimeliClub!", Toast.LENGTH_SHORT).show();

    }

    public void irIniciar (View view){
        Intent i = new Intent(this, iniciarSesionActivity.class);
        startActivity(i);
    }

    public void irRegistrarse (View view){
        Intent i = new Intent(this, registrarseActivity.class);
        startActivity(i);
   }


}