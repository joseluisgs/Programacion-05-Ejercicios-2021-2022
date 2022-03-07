package com.azahara;

import static com.azahara.Enum.Marcha.puntoMuerto;

public class Main {

    /**
     * 2.- Vehículos.
     * Usando como base la clase realizada en el método anterior; renómbrala como vehículo. Ahora tendremos tres
     * tipos de vehículos: turismos, camiones y motocicletas.
     * Para los turismos nos interesa saber: número de plazas y el método propio tipodeUso (profesional
     * o particular).
     * Para los camiones: atributo peso máximo autorizado y el método esMercanciaPeligrosa (tipo boolean).
     * Para las motos: atributo cilindrada y el método necesitaCarnet (tipo boolean; a partir de 125 CC necesita
     * carnet)
     *
     */
    public static void main(String[] args) {

        Camion c = new Camion("volvagen", "focus", "blanco", "etr234",
                puntoMuerto,0f,5.65f, true);

        Moto m = new Moto("volvagen", "focus", "blanco", "3456kmj",puntoMuerto,0,457, true);

        c.pilotoAutomatico();
        c.pilotoAutomatico();
        c.pilotoAutomatico();
        c.apagarMotor();

        m.pilotoAutomatico();
        m.pilotoAutomatico();
        m.pilotoAutomatico();
        m.apagarMotor();
    }
}
