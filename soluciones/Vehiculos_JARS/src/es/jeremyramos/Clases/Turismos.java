package es.jeremyramos.Clases;

public class Turismos extends Vehiculos {


    public Turismos(int numeroPlazas, int pesoMaxAutorizado, int cilindrada) {
        super();
        this.setNumeroPlazas(numeroPlazas);
        this.setPesoMaxAutorizado(pesoMaxAutorizado);
        this.setCilindrada(cilindrada);

    }

    public void tipodeUso(){
        var random = (int) (Math.random()*100);
         var prof = "profesional";
         var part = "particular";

         if (random <=50){
             System.out.println(prof);
         }else
             System.out.println(part);

    }

    @Override
    public String toString() {
        return "Turismos {" + super.toString() + "}";
    }
}
