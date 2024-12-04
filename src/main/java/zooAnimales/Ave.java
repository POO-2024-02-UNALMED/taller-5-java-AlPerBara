package zooAnimales;

import java.util.ArrayList;

public class Ave  extends Animal{
    
    private static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;



    public Ave(){listado.add(this);}
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre,edad,habitat,genero);
        this.colorPlumas=colorPlumas;

        listado.add(this);
    }

    public String getColorPlumas() {
        return colorPlumas;
    }
    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }



    public static int cantidadAves(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "volar";
    }

    public static Animal crearHalcon(String nombreHalcon, int edadHalcon, String generoHalcon){
        Ave halcon= new Ave(nombreHalcon, edadHalcon, "montañas", generoHalcon, "café glorioso");
        halcones++;
        return (Ave) halcon;
    }

    public static Animal crearAguila(String nombreAguila, int edadAguila, String generoAguila){
        Ave aguila= new Ave(nombreAguila, edadAguila, "montañas", generoAguila, "blanco y amarillo");
        aguilas++;
        return (Ave) aguila;
    }

}
