package es.jeremyramos;

import es.jeremyramos.Clases.Gatos;
import es.jeremyramos.Clases.Perros;

public class Main {

    public static void main(String[] args) {
        Perros doberman = new Perros();
        Gatos faraon = new Gatos();

        System.out.println("Perro");
        doberman.hacerCaso();
        doberman.hacerRuido();

        System.out.println("Gato");
        faraon.hacerCaso();
        faraon.hacerRuido();


    }
}
