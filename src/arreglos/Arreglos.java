package arreglos;
import java.util.Scanner;
import arreglos.ClaseArreglos;

public class Arreglos {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int tamanio;
        System.out.println("Ingresa el tamaño del arreglo: ");
        tamanio = lee.nextInt();
        ClaseArreglos MiArray = new ClaseArreglos(tamanio);
        for(int i=0; i<=MiArray.getTamanio()-1; i++){
            System.out.printf("Ingresa valor en la posicion %d : ",i);
            MiArray.Agregar(i, lee.nextInt());
        }
        MiArray.mostrarArray();
        System.out.println((MiArray.isCapicua()) ? "Es capicua" : "No es capicua");
        MiArray.OrdenarAscendente();
        MiArray.mostrarArray();
        MiArray.OrdenarDescendentemente();
        MiArray.mostrarArray();
        System.out.printf("El numero mayor del arreglo es el %d",MiArray.getMayor());
        System.out.println("");
        System.out.printf("El numero menor del arreglo es el %d",MiArray.getMenor());
    }
    
}
