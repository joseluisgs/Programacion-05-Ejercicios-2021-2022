package com.company.models;

public class Revista extends Ficha{
    private int numeroRevista;
    private int añoPublicacion;

    public Revista() {
    }

    public Revista(int id, String titulo, String autor, int numeroRevista, int añoPublicacion) {
        super(id, titulo);
        this.numeroRevista = numeroRevista;
        this.añoPublicacion = añoPublicacion;
    }
}
