package com.company.models;

public class DVD extends Ficha{
    private String director;
    private int año;
    private String tipo;

    public DVD() {
    }

    public DVD(int id, String titulo, String director, int año, String tipo) {
        super(id, titulo);
        this.director = director;
        this.año = año;
        this.tipo = tipo;
    }
}
