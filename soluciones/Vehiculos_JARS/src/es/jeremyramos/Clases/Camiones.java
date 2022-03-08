package es.jeremyramos.Clases;

import java.util.Scanner;

public class Camiones extends Vehiculos {

    public Camiones(int numeroPlazas, int pesoMaxAutorizado, int cilindrada) {
        super();
        this.setNumeroPlazas(numeroPlazas);
        this.setPesoMaxAutorizado(pesoMaxAutorizado);
        this.setCilindrada(cilindrada);


    }

        public void esMercanciaPeligrosa(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Es tu mercancía peligrosa?");
            var respuesta = sc.nextLine();

            if (respuesta.contains("Si")){
                System.out.println("ES PELIGROSA");
            } else
                System.out.println("Puede Pasar");

        }




    @Override
    public String toString() {
        return "Camiones" + super.toString() + "}";
    }
}
