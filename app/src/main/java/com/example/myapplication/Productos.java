package com.example.myapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

public class Productos {
    private String Categoria;
    private String Precio;
    private String Image;
    private String Description;

    public String getCategoria() {
        return Categoria;
    }

    public String getPrecio() {
        return Precio;
    }

    public String getImage() {
        return Image;
    }

    public String getDescription() {
        return Description;
    }

    public Productos(JSONObject a) throws JSONException {
        Categoria = a.getString("category");
        Precio = a.getString("price");
        Image = a.getString("image");
        Description = a.getString("description");  // Clave corregida
    }

    public static ArrayList<Productos> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Productos> productos = new ArrayList<>();
        for (int i = 0; i < datos.length(); i++) {
            productos.add(new Productos(datos.getJSONObject(i)));
        }
        return productos;
    }
}