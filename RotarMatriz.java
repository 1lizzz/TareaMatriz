
/**
 *
 * @author Corrales
 */
public class RotarMatriz {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, {4,5,6},{7,8,9}};

         int n = matriz.length; // Tamaño de la matriz

         // Crear una matriz temporal para la rotación

          int[][] matrizRotada = new int[n][n];

          // Rotar la matriz 90 grados en sentido horario for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) { matrizRotada[i][j] = matriz[n-1-j][i];

         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
             matrizRotada[i][j] = matriz[n-1-j][i];
            }
          }

         // Imprimir la matriz original
         System.out.println("Matriz Original:"); 
         imprimirMatriz(matriz);

         // Imprimir la matriz rotada 
         System.out.println("Matriz Rotada 90 grados en sentido horario:"); 
         imprimirMatriz (matrizRotada);
     }

// Método para imprimir una matriz

public static void imprimirMatriz (int[][] matriz) {

     int n = matriz.length; for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++) {

     System.out.print(matriz[i][j] + " ");
     }
     System.out.println();
   }
  }
}
