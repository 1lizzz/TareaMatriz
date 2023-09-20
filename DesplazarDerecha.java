
/**
 *
 * @author Corrales
 */
public class DesplazarDerecha {
    public static void main(String[] args) {
        int[][] bidimension = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        
        System.out.println("Matriz original:");
        mostrarMatriz(bidimension);

        int posiciones = 2; // Cambia este valor según cuántas posiciones quieras desplazar

        // Desplazamos la matriz hacia la derecha
        bidimension = desplazarDerecha(bidimension, posiciones);

        System.out.println("Matriz desplazada hacia la derecha:");
        mostrarMatriz(bidimension);
    }

    // Método para desplazar una matriz hacia la derecha
    public static int[][] desplazarDerecha(int[][] matriz, int posiciones) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizDesplazada = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Calculamos la nueva posición en la fila después del desplazamiento
                int nuevaColumna = (j + posiciones) % columnas;
                matrizDesplazada[i][nuevaColumna] = matriz[i][j];
            }
        }

        return matrizDesplazada;
    }

    // Método para mostrar una matriz en la consola
    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
        System.out.println(); // Línea en blanco al final
    }
        
}

