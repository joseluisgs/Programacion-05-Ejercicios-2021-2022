package es.jeremyramos.Clases;

public class Motocicletas extends Vehiculos {

    public Motocicletas(int numeroPlazas, int pesoMaxAutorizado, int cilindrada) {
        super();
        this.setNumeroPlazas(numeroPlazas);
        this.setPesoMaxAutorizado(pesoMaxAutorizado);
        this.setCilindrada(cilindrada);

   }

   public boolean necesitaCarnet(){

        if(this.getCilindrada() > 125){
            System.out.println("Necesitas Carnet");
            return true;
        }else
            System.out.println("No necesita Carnet");
            return false;
   }

    @Override
    public String toString() {
        return "Motocicletas" +  super.toString() + "}";
    }
}

