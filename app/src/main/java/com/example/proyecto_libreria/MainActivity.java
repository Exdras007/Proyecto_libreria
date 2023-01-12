package com.example.proyecto_libreria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView rv_libros;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ir_libros(View view)
    {
        Intent intent = new Intent(this, activity_libros.class);
        startActivity(intent);
    }

    public void ir_comics(View view)
    {
        Intent intent = new Intent(this, activity_comics.class);
        startActivity(intent);
    }

}