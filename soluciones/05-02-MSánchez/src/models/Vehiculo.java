package models;

public abstract class Vehiculo {
    private float velocidad;
    private String color = "";
    private float rpm;

    public Vehiculo(){
    }

    public Vehiculo(float velocidad, String color, float rpm) {
        setVelocidad(velocidad);
        setColor(color);
        setRpm(rpm);
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getRpm() {
        return rpm;
    }

    public void setRpm(float rpm) {
        this.rpm = rpm;
    }
}
