package arreglos;
import java.util.Scanner;
import arreglos.ClaseArreglos;
/**
 *
 * @author crist
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        ClaseArreglos MiArray = new ClaseArreglos(4);
        for(int i=0; i<=MiArray.getTamanio()-1; i++){
            System.out.printf("Ingresa valor en la posicion %d : ",i);
            MiArray.Agregar(i, lee.nextInt());
        }
        MiArray.mostrarArray();
        MiArray.OrdenarAscendente();
        MiArray.mostrarArray();
        MiArray.OrdenarDescendentemente();
        MiArray.mostrarArray();
    }
    
}
