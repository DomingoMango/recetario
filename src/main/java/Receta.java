import java.util.ArrayList;
import java.util.ArrayList.*;

public class Receta {
    private ArrayList<Ingredientes> ingredientes;
    private ArrayList<String> pasos;
    private double prepTime;
    private String nombre;

    public Receta(ArrayList<Ingredientes> ingredientes, ArrayList<String> pasos, double prepTime, String nombre) {
        this.ingredientes = ingredientes;
        this.pasos = pasos;
        this.prepTime = prepTime;
        this.nombre = nombre;
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    public double getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(double prepTime) {
        this.prepTime = prepTime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
