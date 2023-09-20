
/**
 *
 * @author Corrales
 */
public class DosColumnas {
    public static void main(String[] args) {
        
        int [][] bidimension1  = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] bidimension2  = {{9,8,7},{6,5,4},{3,2,1}};
        
        int columna = 0;

         // Intercambiar las columnas entre las dos matrices

         for (int i = 0; i < bidimension1.length; i++) { 
             int temp = bidimension1[i] [columna]; 
             bidimension1 [i] [columna] = bidimension2[i] [columna];
             bidimension2[i] [columna] = temp;

         }
 
          System.out.println("Matriz 1 después del intercambio:");
          imprimirMatriz (bidimension1); 
          System.out.println("Matriz 2 después del intercambio:"); 
           imprimirMatriz(bidimension2);

  }

// Método para imprimir una matriz

public static void imprimirMatriz (int[][] matriz) {

    for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
         System.out.print(matriz[i][j] + " ");
         }
      System.out.println();          
    } 
}
} 

