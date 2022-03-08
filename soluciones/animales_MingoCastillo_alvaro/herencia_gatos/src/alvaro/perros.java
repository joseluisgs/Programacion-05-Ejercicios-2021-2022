package alvaro;

public class perros extends animales{
    public perros(double peso, String raza, String color, String nombre){
        super( peso, raza , color, nombre);
    }
    public void sacarPaseo(){
        System.out.println("Los perros se pasean dos veces de paseo, yo lo hago por la mañana y por la noche");
    }
    @Override
    public String hacerRuido(){
        return "ladrido";
    }

    @Override
    public boolean hacerCaso(){
        boolean caso= false;
        int probCaso= (int) (Math.random()*100 + 1);
        if(probCaso>=0 && probCaso<=90){
            caso=true;
        }
        return caso;
    }
}
