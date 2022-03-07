package es.daniel.models;

public abstract class Animal {
    private String name;
    private String raza;
    private float peso;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void vacunar(){
        System.out.println("Animal lo estan vacunando.");
    }
    public void comer(){
        System.out.println("El animal esta comiendo");
    }
    public void dormir(){
        System.out.println("El animal esta durmiendo.");
    }
    public abstract void hacerRuido();
    public abstract boolean hacerCaso();
}
