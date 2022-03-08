package models;

public class Gato extends Animal{
    private int cuantosBigotes;

    public Gato(String nombre, String raza, float peso, String color, int cuantosBigotes) {
        super(nombre, raza, peso, color);
        this.cuantosBigotes = cuantosBigotes;

    }

    @Override
    public String hacerRuido(){
        return "Maullido";
    }

    @Override
    public boolean hacerCaso(){
        boolean haceCaso = false;
        int sorteo = (int)(Math.random()*100+1);
        if(sorteo>0 && sorteo<=5 ){
            haceCaso = true;
        }
        return haceCaso;
    }
    private void toserBolaPelo(){
        System.out.println("Ha tosido una bola de pelo.");
    }

}
