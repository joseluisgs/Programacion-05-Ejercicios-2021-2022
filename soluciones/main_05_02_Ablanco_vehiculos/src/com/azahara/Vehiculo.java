package com.azahara;

import com.azahara.Enum.EstadoDeMotor;
import com.azahara.Enum.Marcha;

import java.util.Scanner;

public abstract class Vehiculo<absolute> {

        protected String marca;
        protected String modelo;
        protected String color;
        protected String matricula;
        protected EstadoDeMotor estado = EstadoDeMotor.Apagado;
        protected Marcha marchaActual = Marcha.puntoMuerto;
        protected float velocidadActual;

        protected int velocidadDeseada;
        protected int tiempoDeseado;

        public Vehiculo(String marca, String modelo, String color, String matricula, Marcha marchaActual, float velocidadActual) {
                this.marca = marca;
                this.modelo = modelo;
                this.color = color;
                this.estado= estado;
                this.matricula = matricula;
                this.marchaActual = marchaActual;
                this.velocidadActual = velocidadActual;

        }

        public String getMarca() {
                return marca;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public String getModelo() {
                return modelo;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public String getMatricula() {
                return matricula;
        }

        public void setMatricula(String matricula) {
                this.matricula = matricula;
        }

        public EstadoDeMotor getEstado() {
                return estado;
        }

        public void setEstado(EstadoDeMotor estado) {
                this.estado = estado;
        }

        public Marcha getMarchaActual() {
                return marchaActual;
        }

        public void setMarchaActual(Marcha marchaActual) {
                this.marchaActual = marchaActual;
        }

        public float getVelocidadActual() {
                return velocidadActual;
        }

        public void setVelocidadActual(float velocidadActual) {
                this.velocidadActual = velocidadActual;
        }

        //metodos interfaz
        public void arrancarMotor(){
                this.estado = EstadoDeMotor.Encendido;
                System.out.println("motor arrancado");
        }

        public void apagarMotor(){
                this.estado = EstadoDeMotor.Encendido;
                System.out.println("motor apagado");
        }

        public void acelerar(){
                this.velocidadActual++;
                System.out.println("aceleramos y la velocidad es : " + velocidadActual);
                cambiarMarcha();

        }

        public void frenar() {
                if(velocidadActual!=0){

                        this.velocidadActual--;
                        System.out.println("frenamos y la velocidad es : " + velocidadActual);
                        cambiarMarcha();
                }

        }

        public void cambiarMarcha(){

                Marcha m = marchaActual;

                if(velocidadActual==0){
                        marchaActual= Marcha.puntoMuerto;
                }else if(velocidadActual<30){
                        marchaActual= Marcha.primera;
                }else if(velocidadActual<50){
                        marchaActual= Marcha.segunda;
                }else if(velocidadActual<70){
                        marchaActual= Marcha.tercera;
                }else if(velocidadActual<100){
                        marchaActual= Marcha.cuarta;
                }else if(velocidadActual>100){
                        marchaActual= Marcha.quinta;
                }
                if(m !=marchaActual){
                        System.out.println("cambiamos de marcha a : "+ marchaActual);
                }
        }

        public void PuntoMuerto() {

                if (velocidadActual==0){
                        System.out.println("ponemos punto muerto");
                        marchaActual=Marcha.puntoMuerto;
                }else {
                        System.out.println("no ponemos punto muerto porque el coche tiene velocidad");
                }
        }

        public void cruzaUnGato() {

                System.out.println("nos cruza un gato de Rocio!!");
                frenazo();
                calaMotor();
        }

        public void frenazo(){
                System.out.println("frenamos a tope!!");
                velocidadActual=0;
                cambiarMarcha();
        }

        public void calaMotor() {
                System.out.println("se cala el coche y se apaga el motor!!");
                System.out.println("pero el gato se ha salvado 😻 !!");
                apagarMotor();

        }

        public void elegirVelocidadYTiempo() {
                System.out.println("vamos a elegir la velocidad y el tiempo al que queremos el coche ya que es automático");

                velocidadDeseada=elegirVelocidad();
                tiempoDeseado=elegirTiempo();

        }

        public int elegirVelocidad(){
                Boolean ok = false;
                int v = -1;
                do {
                        try {
                                System.out.println("eligue tu velocidad");
                                Scanner sc = new Scanner(System.in);
                                v=sc.nextInt();
                                if(v>=0){
                                        ok = true;
                                        System.out.println("has elegido" + v);
                                }
                        }catch (Exception e) {}
                }while(!ok);
                return v;

        }

        public int elegirTiempo(){
                Boolean ok = false;
                int v = -1;
                do {
                        try {
                                System.out.println("eligue tu tiempo que sea mayor a 1 y menor a 20");
                                Scanner sc = new Scanner(System.in);
                                v=sc.nextInt();
                                if(v>=1 && v<20){
                                        ok = true;
                                        System.out.println("has elegido" + v);
                                }
                        }catch (Exception e) {}
                }while(!ok);
                return v;

        }

        public void pilotoAutomatico() {
                if (estado==EstadoDeMotor.Apagado){
                        arrancarMotor();
                }
                System.out.println("empezamos la funcion de piloto automatico");
               elegirVelocidadYTiempo();
               ponerEnVelocidadDeseada();
               navegarTiempoDeseado();

        }

        protected void navegarTiempoDeseado(){
                System.out.println("empezamos la conducion en segundos");
                int contador= 0;
                boolean saleUnGato= false;

                while(tiempoDeseado!=0 && saleUnGato==false){

                        contador++;
                        tiempoDeseado--;
                        System.out.println(" llevamos navegados : " + contador  + " nos faltan : " + tiempoDeseado );

                        saleUnGato=saleUnGato();
                }
                if( saleUnGato){
                        cruzaUnGato();
                }else{
                        System.out.println("terminada la conducción automática");
                }

        }

        protected boolean saleUnGato(){
                int i = (int)(Math.random()*11);
                return i==0;
        }

        protected void ponerEnVelocidadDeseada(){
                System.out.println("empezamos la navegación");

                while(velocidadActual!=velocidadDeseada){
                        if (velocidadActual>velocidadDeseada){
                                frenar();
                        }else{
                                acelerar();
                        }
                }
                System.out.println("alcanzada la velocidad Deseada");
        }
}

