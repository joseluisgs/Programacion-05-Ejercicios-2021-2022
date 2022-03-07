package es.daniel.models;

public class Gato extends Animal {

    public Gato(String name, String raza, float peso, String color){
        super();
        this.setName(name);
        this.setRaza(raza);
        this.setPeso(peso);
        this.setColor(color);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau");
    }

    @Override
    public boolean hacerCaso() {
        return (int)(Math.random() *100) <=5;
    }
    public void toserBolaPelo(){
        System.out.println(super.getName() + " ha tirado una bola de pelo.");
    }
}
