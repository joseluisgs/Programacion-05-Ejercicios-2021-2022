package com.azahara;

import com.azahara.Enum.Marcha;

public class Moto  extends Vehiculo implements IVeiculo{
    private int cilindrada;
    boolean necesitaCarnet;

    public Moto(String marca, String modelo, String color,
                String matricula, Marcha marchaActual, float velocidadActual,
                int cilindrada, boolean necesitaCarnet) {
        super(marca, modelo, color, matricula, marchaActual, velocidadActual);
        this.cilindrada = cilindrada;
        this.necesitaCarnet = necesitaCarnet;
    }
    //metodos interfaz


}
