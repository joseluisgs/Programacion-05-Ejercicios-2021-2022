package com.azahara;

import com.azahara.Enum.Marcha;

public class Camion extends Vehiculo implements IVeiculo{
    private float pesoMaximo;
    private boolean esMercanciaPeligrosa;

    public Camion(String marca, String modelo, String color,
                  String matricula, Marcha marchaActual, float velocidadActual,
                  float pesoMaximo, boolean esMercanciaPeligrosa) {
        super(marca, modelo, color, matricula, marchaActual, velocidadActual);
        this.pesoMaximo = pesoMaximo;
        this.esMercanciaPeligrosa = esMercanciaPeligrosa;
    }



}
