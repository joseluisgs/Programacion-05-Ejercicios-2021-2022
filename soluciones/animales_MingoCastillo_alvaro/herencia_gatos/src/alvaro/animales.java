package alvaro;

public class animales {
    private String raza;
    protected String nombre;
    protected String color;
    protected double peso;

    public animales(double peso, String raza, String color, String nombre){
        this.peso=peso;
        this.raza=raza;
        this.color=color;
        this.nombre=nombre;
    }

    public void dormir(){
        System.out.println("Duerme mucho y esta todo el dia tumbado");
    }
    public void comer(){
        System.out.println("Comen mucho y se tiene que cuidar su alimentacion para que no este gordo");
    }

    public boolean hacerCaso(){
        return true;
    }
    public String hacerRuido(){
        return "sonido";
    }
    public void vacunar(){
        System.out.println("estan vacunados");
    }
}
