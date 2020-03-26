
package arreglos;

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
        
        //Método para ordenar vector descendentemente
        public void OrdenarDescendentemente(){
            int aux;
            for(int i=0; i<this.array.length-1; i++){
                for(int j=0; j<this.array.length-1; j++){
                    if(this.array[j] < this.array[j+1]){
                        aux = this.array[j];
                        this.array[j] = this.array[j+1];
                        this.array[j+1] = aux;
                    }
                }
            }
        }
        
        //Método para encontrar el numero mayor
        public int getMayor(){
            int mayor=0;
            for(int i=0;  i<=this.array.length-1;  i++){
                mayor = (this.array[i] > mayor) ? this.array[i] : mayor;
            }
            return mayor;
        }
        
        //Método para encontrar el numero menor
        public int getMenor(){
            int menor=this.array[0];
            for(int i=1; i<=this.array.length-1; i++){
                  menor = (this.array[i] < menor) ? this.array[i] : menor;
            }
            return menor;
        }
        public boolean isCapicua(){
            boolean v = true;
            int aux = this.array.length-1;
            for(int i=0; i<=this.array.length-1; i++){
                if(this.array[i] != this.array[aux]){
                    v = false;
                    break;
                }
                aux--;
            }
            return v;
        }
}
