package models;

public class Perro extends Animal{

    public Perro(String nombre, String raza, float peso, String color) {
        super();
        this.setNombre(nombre);
        this.setRaza(raza);
        this.setPeso(peso);
        this.setColor(color);
    }

    @Override
    public String hacerRuido(){
        return "Ladrido";
    }

    @Override
    public boolean hacerCaso(){
        boolean haceCaso = false;
        int sorteo = (int)(Math.random()*100+1);
        if(sorteo>0 && sorteo<=90 ){
            haceCaso = true;
        }
        return haceCaso;
    }

    private void sacarPaseo(){
        System.out.println("Sale de paseo");
    }
}
