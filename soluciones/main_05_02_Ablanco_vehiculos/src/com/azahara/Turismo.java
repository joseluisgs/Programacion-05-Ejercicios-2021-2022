package com.azahara;

import com.azahara.Enum.Marcha;

public class Turismo extends Vehiculo implements IVeiculo{
    private int numeroDePlazas;
    private Uso usos;


    public Turismo(String marca, String modelo, String color, String matricula,
                   Marcha marchaActual, float velocidadActual, int numeroDePlazas, Uso usos) {
        super(marca, modelo, color, matricula, marchaActual, velocidadActual);
        this.numeroDePlazas = numeroDePlazas;
        this.usos = usos;
    }



}
