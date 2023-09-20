
/**
 *
 * @author Corrales
 */
public class invertirFila {
    public static void main(String[] args) {
        int [][] bidimension1  = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] bidimension2  = {{9,8,7},{6,5,4},{3,2,1}};
        
        System.out.println("Matriz 1 original:");
        mostrarMatriz(bidimension1);

        System.out.println("Matriz 2 original:");
        mostrarMatriz(bidimension2);

        // Invertir el orden de las filas en las matrices
        bidimension1 = invertirFilas(bidimension1);
        bidimension2 = invertirFilas(bidimension2);

        System.out.println("Matriz 1 invertida:");
        mostrarMatriz(bidimension1);

        System.out.println("Matriz 2 invertida:");
         mostrarMatriz(bidimension2);
    }
    
    // Método para invertir el orden de las filas en una matriz
    public static int[][] invertirFilas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizInvertida = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[i][j] = matriz[filas - 1 - i][j];
            }
        }
        return matrizInvertida;
    }
    
    // Método para mostrar una matriz en la consola
    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}