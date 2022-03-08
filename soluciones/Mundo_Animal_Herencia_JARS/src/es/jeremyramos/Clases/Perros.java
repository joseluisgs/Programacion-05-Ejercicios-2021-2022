package es.jeremyramos.Clases;

import java.util.Random;

public class Perros extends Animales{

    public Perros() {
        super();

    }


    @Override
    public void comer() {
        super.comer();
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    @Override
    public void vacunar() {
        super.vacunar();
    }


    @Override
    public boolean hacerCaso() {
        var random = (int) (Math.random()*100);

        if(random <=90){
            System.out.println("Hago caso");
            return true;
        }else
            System.out.println("No hago caso");
            return false;

    }


    @Override
    public void hacerRuido() {
        System.out.println("Soy un perro y ladro");
    }

    public void sacarPaseo(){
        System.out.println("Salgo de paseo");

    }

}
