public class Ingredientes {
    private String nombre;
    private boolean salty;
    private double peso;

    public Ingredientes(String nombre, boolean salty, double peso) {
        System.out.println("Ingrediente agregado");
        this.nombre = nombre;
        this.salty = salty;
        this.peso = peso;
    }

    public Ingredientes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSalty() {
        return salty;
    }

    public void setSalty(boolean salty) {
        this.salty = salty;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
