package models;

public class Motocicleta extends Vehiculo{
    private int cilindrada;

    public Motocicleta() {
        super();
    }

    public Motocicleta(float velocidad, String color, float rpm, int cilindrada) {
        super(velocidad, color, rpm);
        this.cilindrada = cilindrada;
    }

    public boolean necesitaCarnet(){
        boolean conCarnet = false;
        if(cilindrada >= 125){
            conCarnet = true;
        }
        return conCarnet;
    }
}
