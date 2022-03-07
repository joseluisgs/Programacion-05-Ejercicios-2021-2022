package es.daniel;

import es.daniel.models.Camion;
import es.daniel.models.Motocicleta;
import es.daniel.models.Turismo;

public class Main {

    public static void main(String[] args) {
        Camion camion = new Camion("5058", 1000);
        Turismo turismo = new Turismo("1234", 4);
        Motocicleta motocicleta= new Motocicleta("2135", 125);

        if (camion.esMercanciaPeligrosa()) System.out.println(camion.getMatricula()+ " tiene mercancia peligrosa.");
        else System.out.println(camion.getMatricula()+ " no tiene mercancia peligrosa.");

        turismo.tipodeUso();

        if (motocicleta.necesitaCarnet()) System.out.println(motocicleta.getMatricula()+ " necesita carnet");
        else System.out.println(motocicleta.getMatricula()+ " no necesita carnet.");
    }
}
