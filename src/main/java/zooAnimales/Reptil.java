package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
    
    private static ArrayList<Reptil> listado= new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;



    public Reptil(){listado.add(this);}
    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre,edad,habitat,genero);
        this.colorEscamas=colorEscamas;
        this.largoCola=largoCola;

        listado.add(this);
    }

    public String getColorEscamas() {
        return colorEscamas;
    }
    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }
    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }



    public static int cantidadReptiles(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "reptar";
    }

    public static Animal crearIguana(String nombreIguana, int edadIguana, String generoIguana){
        Reptil iguana = new Reptil(nombreIguana, edadIguana, "humedal", generoIguana, "verde", 3);
        iguanas++;
        return (Reptil)iguana;
    }

    public static Animal crearSerpiente(String nombreSerpiente, int edadSerpiente, String generoSerpiebte){
        Reptil serpiente = new Reptil(nombreSerpiente, edadSerpiente, "jungla", generoSerpiebte, "blanco", 1);
        serpientes++;
        return (Reptil)serpiente;
    }

}
