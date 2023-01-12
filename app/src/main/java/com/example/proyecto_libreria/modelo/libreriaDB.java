package com.example.proyecto_libreria.modelo;

import android.util.Log;

import com.example.proyecto_libreria.clases.Libro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class libreriaDB
{
    public static ArrayList<Libro> obtenerLibros()
    {
        Connection conexion = ConfiguracionDB.conectarBaseDeDatos();
        if (conexion == null)
        {
            return null;
        }
        ArrayList<Libro> libros = new ArrayList<Libro>();

        try
        {
            Statement sentencia = conexion.createStatement();
            String ordenSQL = "SELECT * FROM libros ORDER BY ID_Libro";
            ResultSet resultado = sentencia.executeQuery(ordenSQL);
            while(resultado.next())
            {
                String id_libro = resultado.getString("ID_Libro");
                String nombre = resultado.getString("Nombre");
                String autor = resultado.getString("Autor");
                int num_paginas = resultado.getInt("Num_Paginas");
                Double precio = resultado.getDouble("Precio");
            }
            resultado.close();
            sentencia.close();
            conexion.close();
            return libros;
        }
        catch (SQLException e)
        {
            Log.i("sql", "Error de SQL");
            e.printStackTrace();
            return libros;
        }
    }
}
