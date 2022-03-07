package es.jeremyramos.Clases;

public class Vehiculos {
    private int numeroPlazas;
    private int pesoMaxAutorizado;
    private int cilindrada;

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public int getPesoMaxAutorizado() {
        return pesoMaxAutorizado;
    }

    public void setPesoMaxAutorizado(int pesoMaxAutorizado) {
        this.pesoMaxAutorizado = pesoMaxAutorizado;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "numeroPlazas=" + numeroPlazas +
                ", pesoMaxAutorizado=" + pesoMaxAutorizado +
                ", cilindrada='" + cilindrada + '\'' +
                '}';
    }
}
