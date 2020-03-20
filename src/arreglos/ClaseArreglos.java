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
        //Método para mostrar el array
        public void mostrarArray(){
            for(int i=0; i<=this.array.length-1; i++){
                System.out.print((i<this.array.length-1) ? this.array[i] + "," : this.array[i]);
            }
            System.out.println();
        }
        
        public int getTamanio(){
            return this.array.length;
        }
        //Método para agregar elementos al array
        public void Agregar(int posicion,int elemento){
             this.array[posicion] = elemento;
        }
        
        //Métodos para ordenar vector ascendentemente
        public void OrdenarAscendente(){
            int aux;
            for(int i=0; i<this.array.length-1; i++){
                for(int j=0; j<this.array.length-1; j++){
                    if(this.array[j] > this.array[j+1]){
                        aux = this.array[j];
                        this.array[j] = this.array[j+1];
                        this.array[j+1] = aux;
                    }
                }
            }
        }
}
