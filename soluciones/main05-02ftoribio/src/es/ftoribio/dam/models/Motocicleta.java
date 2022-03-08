package es.ftoribio.dam.models;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String matricula, int cilindrada){
        super();
        this.setMatricula(matricula);
        this.cilindrada=cilindrada;
    }

    public boolean necesitaCarnet(){
        return cilindrada>=125;
    }
}
