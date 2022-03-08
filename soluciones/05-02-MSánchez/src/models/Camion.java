package models;

public class Camion extends Vehiculo{
    private float pesoMaximoAutorizado;

    public Camion() {
        super();
    }

    public Camion(float velocidad, String color, float rpm, float pesoMaximoAutorizado) {
        super(velocidad, color, rpm);
        this.pesoMaximoAutorizado = pesoMaximoAutorizado;
    }
    public boolean esMercanciaPeligrosa(){
        int sorteo = (int)(Math.random()*100+1);
        boolean peligroso = false;
        if(sorteo >= 50){
            peligroso = true;
        }
        return peligroso;
    }
}
