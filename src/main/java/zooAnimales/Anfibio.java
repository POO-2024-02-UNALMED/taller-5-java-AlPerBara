package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
    
    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;



    public Anfibio(){listado.add(this);}
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        super(nombre,edad,habitat,genero);
        this.colorPiel=colorPiel;
        this.venenoso=venenoso;

        listado.add(this);
    }

    public String getColorPiel() {
        return colorPiel;
    }
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }



    public static int cantidadAnfibios(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "saltar";
    }

    public static Animal crearRana(String nombreRana, int edadRana, String generoRana){
        Anfibio rana = new Anfibio(nombreRana, edadRana, "selva", generoRana, "rojo", true);
        ranas++;
        return (Anfibio)rana;
    }

    public static Animal crearSalamandra(String nombreSalamandra, int edadSalamandra, String generoSalamandra){
        Anfibio salamandra = new Anfibio(nombreSalamandra, edadSalamandra, "selva", generoSalamandra, "negro y amarillo", true);
        salamandras++;
        return (Anfibio)salamandra;
    }

}
