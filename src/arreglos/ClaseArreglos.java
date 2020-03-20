/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author crist
 */
public class ClaseArreglos {
        public int[] array;
        public ClaseArreglos(int tamanio)
        {
            this.array = new int[tamanio];
        }
        
        public void mostrarArray(){
            for(int i=0; i<=this.array.length-1; i++){
                System.out.print((i<this.array.length-1) ? this.array[i] + "," : this.array[i]);
            }
            System.out.println();
        }
        
        public int getTamanio(){
            return this.array.length;
        }
        public void Agregar(int posicion,int elemento){
             this.array[posicion] = elemento;
        }
}
