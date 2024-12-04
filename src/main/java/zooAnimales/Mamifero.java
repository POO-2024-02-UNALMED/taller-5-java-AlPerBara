package zooAnimales;

import java.util.ArrayList;


public class Mamifero extends Animal{
    
    private static ArrayList<Mamifero> listado =new ArrayList<>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;



    public Mamifero(){listado.add(this);}
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre,edad,habitat,genero);
        this.pelaje=pelaje;
        this.patas=patas;

        listado.add(this);
    }

    public boolean isPelaje() {
        return pelaje;
    }
    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }



    public static int cantidadMamiferos(){
        return listado.size();
    }

    public static Animal crearCaballo(String nombreCaballo, int edadCaballo, String generoCaballo){
        Mamifero caballo = new Mamifero(nombreCaballo, edadCaballo, "pradera", generoCaballo, true, 4);
        caballos++;
        return (Mamifero)caballo;
    }

    public static Animal crearLeon(String nombreLeon, int edadLeon, String generoLeon){
        Mamifero leon = new Mamifero(nombreLeon, edadLeon, "selva", generoLeon, true, 4);
        leones++;
        return (Mamifero)leon;

    }

}
