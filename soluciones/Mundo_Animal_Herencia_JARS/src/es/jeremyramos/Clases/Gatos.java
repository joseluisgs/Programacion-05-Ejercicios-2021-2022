package es.jeremyramos.Clases;

public class Gatos extends Animales{

    public Gatos() {
        super();

    }


    @Override
    public void comer() {
        super.comer();
    }

    @Override
    public void dormir() {
        super.dormir();
    }

    @Override
    public void vacunar() {
        super.vacunar();
    }


    @Override
    public boolean hacerCaso() {
        var random = (int) (Math.random()*100);

        if(random <=5){
            System.out.println("Hago caso");
            return true;
        }else
            System.out.println("No hago caso");
        return false;

    }

    @Override
    public void hacerRuido() {
        System.out.println("Soy un gato y maullo");
    }

    public void toserBolaPelo(){
        System.out.println("Procedo a toser una bola de pelo");
    }



}
