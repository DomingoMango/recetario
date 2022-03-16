import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        int ans;
        Scanner sc= new Scanner(System.in);
        Ingredientes huevo = new Ingredientes("huevo",true,25);
        Ingredientes mantequilla = new Ingredientes("Mantequilla",false,100);
        Ingredientes azucar = new Ingredientes("Azucar",false,20);
        Ingredientes harina = new Ingredientes("Harina",false,250);
        ArrayList<Ingredientes> ingredientesDispo = new ArrayList<>(Arrays.asList(huevo,mantequilla,azucar,harina));
        Receta hotcake = new Receta(new ArrayList<>(Arrays.asList(huevo,mantequilla,azucar,harina)),
                new ArrayList<>(Arrays.asList("Hacer la mezcla que se utilizara",
                        "Despues de mezclar todo, prender la estufa y poner parte de la mezcla en una sarten","" +
                                ":)")),
                1.30,"hotcakes");
        System.out.println("Bienvenido.");
        System.out.println("1. Agregar un ingrediente");
        System.out.println("2. Hacer una receta");
        System.out.println("3. Revisa el recetario :)");
        ans=sc.nextInt();
        switch (ans){
            case 1:
                Ingredientes nuevo = new Ingredientes();
                System.out.println("deme el nombre");
                nuevo.setNombre(sc.next());
                System.out.println("¿Es salado?(y/n)");
                if (sc.next()=="y"){
                    nuevo.setSalty(true);
                }else nuevo.setSalty(false);
                System.out.println("cuanto pesa");
                nuevo.setPeso(sc.nextDouble());
                ingredientesDispo.add(nuevo);
                for (int i=0;i<ingredientesDispo.size();i++){
                    System.out.println(i+1 + ".- " + ingredientesDispo.get(i).getNombre());
                }
                break;

            case 2:

                break;
            case 3:

                break;
        }



    }
}
