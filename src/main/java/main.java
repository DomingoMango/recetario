import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Ingredientes huevo = new Ingredientes("huevo",true,25);
        Ingredientes mantequilla = new Ingredientes("Mantequilla",false,100);
        Ingredientes azucar = new Ingredientes("Azucar",false,20);
        Ingredientes harina = new Ingredientes("Harina",false,250);
        ArrayList<Ingredientes> ingredientesDispo = new ArrayList<>(Arrays.asList(huevo,mantequilla,azucar,harina));

    }
}
