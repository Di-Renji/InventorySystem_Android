package com.example.joel.inventorysystem;

import com.google.firebase.firestore.IgnoreExtraProperties;

@IgnoreExtraProperties
public class ProductosResponse {
    public String nombre;
    public String categoria;
    public String codigo;
    public String precio;
    public String unidad;
    public String folio;

    public ProductosResponse(){}

    public ProductosResponse(String nombre, String categoria, String codigo, String precio, String unidad, String folio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.codigo = codigo;
        this.precio = precio;
        this.unidad = unidad;
        this.folio = folio;
    }

    public String getNombre(){
        return nombre;
    }
    public String getCategoria(){
        return categoria;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getPrecio(){
        return precio;
    }
    public String getUnidad(){
        return unidad;
    }
    public String getFolio(){
        return folio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria= categoria;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
