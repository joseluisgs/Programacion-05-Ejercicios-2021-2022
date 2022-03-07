package es.daniel.models;

public class Camion extends Vehiculo {
    private int pesoMaximoAutorizado;
    public Camion(String matricula, int pesoMaximoAutorizado) {
        super();
        this.pesoMaximoAutorizado = pesoMaximoAutorizado;
        this.setMatricula(matricula);
    }
    public boolean esMercanciaPeligrosa(){
        return pesoMaximoAutorizado >1050;
    }
}
