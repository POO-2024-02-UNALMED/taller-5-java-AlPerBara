package gestion;

import java.util.ArrayList;
import java.util.List;



public class Zoologico {
    
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas;



    public Zoologico(){zonas = new ArrayList<>();}
/*    public Zoologico(String nombre, String ubicacion){//TODO: Ver si esto funciona
        this(nombre,ubicacion,null);
    }*/
    public Zoologico (String nombreAsignar, String ubicacion/*, Zona zonas*/){
        this.nombre=nombreAsignar;
        this.ubicacion=ubicacion;
        this.zonas=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Zona> getZona() {
        return zonas;
    }

    public void setZona(List<Zona> zonas) {
        this.zonas = zonas;
    }



    public void agregarZonas(Zona zonaPorAgregar){
        zonas.add(zonaPorAgregar);
        zonaPorAgregar.setZoo(this);
    }

    public int cantidadTotalAnimales(){
        int total=0;
        for(Zona zona : zonas){
            for (zooAnimales.Animal animal:zona.getAnimales()){
                total++;
            }
        }
        return total;

    }


}
