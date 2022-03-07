package es.daniel.models;

public class Turismo extends Vehiculo{
    private int numeroPlazas;

    public Turismo(String matricula, int numeroPlazas){
        super();
        this.setMatricula(matricula);
        this.numeroPlazas=numeroPlazas;
    }
    public void tipodeUso(){
        int uso=(int)(Math.random()*100);
        if (uso <= 50) System.out.println("Tipo de uso Profesional");
        else System.out.println("Tipo de uso Particular");
    }
}
