package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;
import java.util.List;

public class Zona {
    
    private String nombre;
    private Zoologico zoo;
    private List<Animal> animales;
    



    public Zona(){animales = new ArrayList<>();}
    public Zona(String nombre, Zoologico zoo){
        this.nombre=nombre;
        this.zoo=zoo;
        this.animales = new ArrayList<>();
    }

    public List<Animal> getAnimales() {
        return animales;
    }
    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public Zoologico getZoo() {
        return zoo;
    }
    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public void agregarAnimales(Animal animalPorAgregar){
        animales.add(animalPorAgregar);
        animalPorAgregar.setZona(this);
    }

    public int cantidadAnimales(){
        int valor=0;
        for(Animal animal:animales){
            valor++;
        }
        return valor;
    }

}
