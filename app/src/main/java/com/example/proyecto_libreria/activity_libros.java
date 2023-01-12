package com.example.proyecto_libreria;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.proyecto_libreria.clases.Libro;
import com.example.proyecto_libreria.modelo.libreriaDB;
import java.util.ArrayList;

public class activity_libros extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros);

        // -------- Recoger de la base de datos --------
        ArrayList<Libro> libros_devueltos = libreriaDB.obtenerLibros();

        if(libros_devueltos != null)
        {
            for(Libro l : libros_devueltos)
            {
                Log.i("libros", l.toString());
            }
        }
    }

    public void ir_inicio(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void ir_comics(View view)
    {
        Intent intent = new Intent(this, activity_comics.class);
        startActivity(intent);
    }

}