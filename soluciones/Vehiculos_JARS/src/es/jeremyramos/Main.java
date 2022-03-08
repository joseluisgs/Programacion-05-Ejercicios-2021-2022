package es.jeremyramos;

import es.jeremyramos.Clases.Camiones;
import es.jeremyramos.Clases.Motocicletas;
import es.jeremyramos.Clases.Turismos;
import es.jeremyramos.Clases.cosas;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Turismos turismo = new Turismos(6,150,7 );

        System.out.println("Turismo");
        turismo.tipodeUso();

        Camiones camion = new Camiones(5,500,100);

        System.out.println("Camión");
        camion.esMercanciaPeligrosa();

        Motocicletas moto = new Motocicletas(2,110,140);

        System.out.println("Moto");
        moto.necesitaCarnet();

    }





/*    var nombre = cosas.valueOf("gato");

        System.out.println(nombre);

    var rand = new Random().nextInt(cosas.values().length);

        System.out.println(cosas.values()[rand]);*/

}
