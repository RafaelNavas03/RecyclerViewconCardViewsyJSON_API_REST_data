package com.example.recyclerviewconcardviewsyjsonapirestdata.Models;



import org.json.JSONException;
import org.json.JSONObject;

public class Lugares {
    private String categoriaId;
    private String categoria;
    private String subcategoria;
    private String id;
    private String subcategoriaId;
    private String nombreLugar;
    private String descripcion;
    private String direccion;
    private String logo;
    private String imagenesGif;
    private String puntuacion;
    private String telefono;
    private String anio;
    private String delivery;
    private String whatsapp;
    private String googleMaps;

    // Constructor
    public Lugares(JSONObject lugarJson) throws JSONException {
        this.categoriaId = lugarJson.getString("categoria_id");
        this.categoria = lugarJson.getString("categoria");
        this.subcategoria = lugarJson.getString("subcategoria");
        this.id = lugarJson.getString("id");
        this.subcategoriaId = lugarJson.getString("subcategoria_id");
        this.nombreLugar = lugarJson.getString("nombre_lugar");
        this.descripcion = lugarJson.getString("descripcion");
        this.direccion = lugarJson.getString("direccion");
        this.logo = lugarJson.getString("logo");
        this.imagenesGif = lugarJson.getString("imagenes_gif");
        this.puntuacion = lugarJson.getString("puntuacion");
        this.telefono = lugarJson.getString("telefono");
        this.anio = lugarJson.getString("anio");
        this.delivery = lugarJson.getString("delivery");
        this.whatsapp = lugarJson.getString("whatsapp");
        this.googleMaps = lugarJson.getString("google_maps");
    }


    public String getCategoriaId() {
        return categoriaId;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public String getId() {
        return id;
    }

    public String getSubcategoriaId() {
        return subcategoriaId;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLogo() {
        return "https://uealecpeterson.net/turismo/assets/imgs/logos_gifs/"+logo;
    }

    public String getImagenesGif() {
        return imagenesGif;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getAnio() {
        return anio;
    }

    public String getDelivery() {
        return delivery;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public String getGoogleMaps() {
        return googleMaps;
    }
}