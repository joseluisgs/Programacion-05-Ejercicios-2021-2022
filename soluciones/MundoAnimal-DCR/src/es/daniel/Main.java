package es.daniel;

import es.daniel.models.Gato;
import es.daniel.models.Perro;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro("Max","Labrador",20.4f,"Rubio");
        Gato gato= new Gato("Aura","Garfield",7, "Naranja");

        perro.vacunar();
        gato.vacunar();

        perro.comer();
        gato.comer();

        perro.dormir();
        gato.dormir();

        perro.hacerRuido();
        perro.sacarPaseo();

        if (perro.hacerCaso()) System.out.println(perro.getName()+ " me hace caso.");
        else System.out.println(perro.getName()+ " no me hace caso.");

        gato.hacerRuido();
        gato.toserBolaPelo();
        if (gato.hacerCaso()) System.out.println(gato.getName()+ " me hace caso.");
        else System.out.println(gato.getName()+ " no me hace caso.");
    }
}
