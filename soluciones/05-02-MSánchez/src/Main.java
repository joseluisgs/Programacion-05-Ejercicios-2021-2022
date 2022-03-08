import models.Camion;
import models.Motocicleta;
import models.Turismo;

public class Main {

    public static void main(String[] args) {
	    Turismo coche = new Turismo(110f,"rojo", 1500f, 5);
        Camion camion = new Camion(90f,"blanco",2000f,150);
        Motocicleta moto = new Motocicleta(120f,"negra", 1000f, 150);

        System.out.println(coche.tipoDeUso());
        System.out.println(camion.esMercanciaPeligrosa());
        System.out.println(moto.necesitaCarnet());
    }
}
