package alvaro;

public class gatos extends animales implements mamifero{


    public gatos(double peso, String raza, String color, String nombre){
        super( peso, raza , color, nombre);
    }

    @Override
    public String hacerRuido(){
        return "maullar";
    }

    @Override
    public boolean hacerCaso(){
        boolean caso= false;
        int probCaso= (int) (Math.random()*100 + 1);
        if(probCaso>=0 && probCaso<=5){
            caso=true;
        }
        return caso;
    }

    @Override
    public void pelo() {

    }
}
