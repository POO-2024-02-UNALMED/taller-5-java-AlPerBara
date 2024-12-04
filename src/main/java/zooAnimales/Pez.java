package zooAnimales;

import java.util.ArrayList;
public class Pez extends Animal{

    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;



    public Pez(){listado.add(this);}
    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas=colorEscamas;
        this.cantidadAletas=cantidadAletas;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }
    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }



    public static int cantidadPeces(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "nadar";
    }

    public static Animal crearSalmon(String nombrePez, int edadPez, String generoPez){
        Pez pez= new Pez(nombrePez, edadPez, "océano", generoPez, "rojo", 6 );
        salmones++;
        return (Pez)pez;
    }

    public static Animal crearBacalao(String nombrePez, int edadPez, String generoPez){
        Pez pez= new Pez(nombrePez, edadPez, "océano", generoPez, "gris", 6 );
        salmones++;
        return (Pez)pez;
    }

}