package es.daniel.models;

public class Perro extends Animal {

    public Perro(String name, String raza, float peso, String color){
        super();
        this.setName(name);
        this.setRaza(raza);
        this.setPeso(peso);
        this.setColor(color);
    }
    @Override
    public void hacerRuido() {
        System.out.println("Guau");
    }

    @Override
    public boolean hacerCaso() {
        return (int)(Math.random()*100)<=90;
    }
    public void sacarPaseo(){
        System.out.println(super.getName()+ " esta de paseo.");
    }
}
