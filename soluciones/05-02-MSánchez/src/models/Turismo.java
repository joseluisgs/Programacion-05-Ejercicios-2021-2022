package models;

public class Turismo extends Vehiculo{
    private int numeroPlazas;

    public Turismo() {
        super();
    }

    public Turismo(float velocidad, String color, float rpm, int numeroPlazas) {
        super(velocidad, color, rpm);
        this.numeroPlazas = numeroPlazas;
    }

    public String tipoDeUso(){
        int sorteo = (int)(Math.random()*100+1);
        String uso = "";
        if(sorteo >= 50){
            uso = "Profesional";
        }else{
            uso = "particular";
        }
        return uso;
    }
}
