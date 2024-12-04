package zooAnimales;
import gestion.Zona;

public class Animal {

    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;



    public Animal(){}
    public Animal(String nombre, int edad, String habitat, String genero, Zona zona){
        this.nombre=nombre;
        this.edad=edad;
        this.habitat=habitat;
        this.genero=genero;
        this.zona=zona;
        totalAnimales++;
    }
    public Animal(String nombre, int edad, String habitat, String genero) {
        this(nombre, edad, habitat, genero, null);
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }
    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public String getHabitat() {
        return habitat;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
        this.zona.agregarAnimales(this);
    }

    public Zona getZona() {
        return zona;
    }



    public String movimiento(){
        return "desplazarse";
    }

    public String totalPorTipo(){
        return "Mamíferos: "+Mamifero.cantidadMamiferos()+"/n"+
               "Aves: "+Ave.cantidadAves()+"/n"+
               "Reptiles:"+Reptil.cantidadReptiles()+"/n"+
               "Peces: "+Pez.cantidadPeces()+"/n"+
               "Anfibios: "+Anfibio.cantidadAnfibios();
    }

    @Override
    public String toString(){
        if (zona!=null && zona.getZoo()!=null){
            return "Hola mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+
        " y mi género es "+genero+", la zona en la que me ubico es "+zona+", en el "+zona.getZoo().getNombre();
        }
        else{
            return "Hola mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+
        " y mi género es "+genero;
        }
    }
    
}