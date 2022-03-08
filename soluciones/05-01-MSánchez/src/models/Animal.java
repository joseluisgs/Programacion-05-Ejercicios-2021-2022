package models;

public abstract class Animal {
    private String nombre;
    private String raza;
    private float peso;
    private String color;

    public Animal() {
    }

    public Animal(String nombre, String raza, float peso, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.color = color;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void vacunar() {
        System.out.println("Está vacunado.");
    }

    public void comer(){
        System.out.println("Está comiendo");
    }

    public void dormir(){
        System.out.println("Está durmiendo");
    }

    abstract String hacerRuido();

    abstract boolean hacerCaso();

}
