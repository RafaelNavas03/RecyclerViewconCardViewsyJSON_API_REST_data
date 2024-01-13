package com.example.recyclerviewconcardviewsyjsonapirestdata.Models;

import org.json.JSONException;
import org.json.JSONObject;

public class SubCategorias {
    private String dtRowId;
    private String id;
    private String categoriaId;
    private String descripcion;
    private String categoria;
    public SubCategorias(JSONObject subcategoriaJson) throws JSONException {
        this.dtRowId = subcategoriaJson.getString("dt_rowid");
        this.id = subcategoriaJson.getString("id");
        this.categoriaId = subcategoriaJson.getString("categoria_id");
        this.descripcion = subcategoriaJson.getString("descripcion");
        this.categoria = subcategoriaJson.getString("categoria");
    }

    public String getDtRowId() {
        return dtRowId;
    }

    public String getId() {
        return id;
    }

    public String getCategoriaId() {
        return categoriaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }
    @Override
    public String toString() {
        return getDescripcion() + " (" + getCategoria() + ")";
    }

}
