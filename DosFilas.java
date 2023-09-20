
/**
 *
 * @author Corrales
 */
public class DosFilas {
    public static void main(String[] args) {
        
        int [][] bidimension1  = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] bidimension2  = {{9,8,7},{6,5,4},{3,2,1}};

                
        int fila = 0;
        
        //cambiar filas
        for(int i = 0; i < bidimension1.length; i++){
            int cam = bidimension1[i] [fila]; 
             bidimension1[i] [fila] = bidimension2[i] [fila];
             bidimension2[i] [fila] = cam;
        }
             System.out.println("Matriz 1 después del intercambio:");
             imprimirMatriz (bidimension1); 
             System.out.println("Matriz 2 después del intercambio:"); 
             imprimirMatriz(bidimension2);
               
    }   
   
    //imprimir matriz

public static void imprimirMatriz (int[][] matriz) {

    for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
         System.out.print(matriz[i][j] + " ");
         }
      System.out.println();          
    } 
}
}