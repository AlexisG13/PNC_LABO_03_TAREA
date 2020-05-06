package com.uca.labo3.domain;

public class Product {
    int id;
    String nombre;
    String cantidad;

    public Product() {
    }

    public Product(int id, String nombre, String cantidad) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.cantidad = cantidad;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getCantidad() {
	return cantidad;
    }

    public void setCantidad(String cantidad) {
	this.cantidad = cantidad;
    }

}
