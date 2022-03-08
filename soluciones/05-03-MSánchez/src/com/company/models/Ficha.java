package com.company.models;

public class Ficha {
    private int id;
    private String titulo;

    public Ficha() {
    }

    public Ficha(int id, String titulo) {
        setId(id);
        setTitulo(titulo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Ficha: " +
                "id= " + id +
                ", titulo= '" + titulo;
    }
}
