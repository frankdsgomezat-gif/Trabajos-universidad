package Clases;
import java.util.Scanner;

public class CMatriz {
    static int[][] matriz;
    static int fila, columna;
    static Scanner teclado = new Scanner(System.in);
    
    public CMatriz() {
    }
    
    public void crearArreglo(int fil, int col) {
        matriz = new int[fil][col];
        fila = fil;
        columna = col;
    }
    
    public void leerNumero() {
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = getNumero();
            }
        }
    }
    
    public int getNumero() {
        int valor;
        System.out.print("Ingrese un Numero : ");
        valor = teclado.nextInt();
        return valor;
    }
    
    public void listado() {
        System.out.println("Listado Elementos");
        System.out.println("================");
        if (fila > 0 && columna > 0) {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println("");
            }
        } else {
            System.out.println("No Existe Elementos");
        }
    }
    
    public void suma() {
        int suma = 0;
        if (fila > 0 && columna > 0) {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    suma += matriz[i][j];
                }
            }
            System.out.println("La suma es : " + suma);
        } else {
            System.out.println("No Existe Elementos");
        }
    }
    
    public void eliminaUltimaColumna() {
        if (fila > 0 && columna > 0) {
            if (columna == 0) {
                columna = columna - 1;
                fila--;
            } else {
                columna--;
            }
            listado();
        }
    }
    
    // 1. Eliminar elemento X
    public void eliminarElemento(int x) {
        boolean encontrado = false;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matriz[i][j] == x) {
                    matriz[i][j] = 0;
                    encontrado = true;
                    System.out.println("Elemento " + x + " eliminado en fila " + (i+1) + ", columna " + (j+1));
                }
            }
        }
        if (!encontrado) {
            System.out.println("El elemento " + x + " no se encuentra en la matriz");
        }
    }
    
    // 2. Modificar elemento X
    public void modificarElemento(int antiguo, int nuevo) {
        boolean cambiado = false;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matriz[i][j] == antiguo) {
                    matriz[i][j] = nuevo;
                    System.out.println("Elemento " + antiguo + " cambiado por " + nuevo);
                    cambiado = true;
                }
            }
        }
        if (!cambiado) {
            System.out.println("No se encontro el elemento " + antiguo);
        }
    }
    
    // 3. Sumar todos los elementos
    public void sumarTodos() {
        int total = 0;
        if (fila > 0 && columna > 0) {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    total += matriz[i][j];
                }
            }
            System.out.println("La suma de todos los elementos es: " + total);
        } else {
            System.out.println("No hay elementos en la matriz");
        }
    }
    
    // 4. Menor, mayor y promedio
    public void menorMayorPromedio() {
        if (fila == 0 || columna == 0) {
            System.out.println("No hay elementos");
            return;
        }
        int menor = matriz[0][0];
        int mayor = matriz[0][0];
        int suma = 0;
        int cantidad = fila * columna;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matriz[i][j] < menor) menor = matriz[i][j];
                if (matriz[i][j] > mayor) mayor = matriz[i][j];
                suma += matriz[i][j];
            }
        }
        double promedio = suma / (double) cantidad;
        System.out.println("Numero menor: " + menor);
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Promedio: " + String.format("%.2f", promedio));
    }
    
    // 5. Suma letra L
    public void sumaLetraL() {
        if (fila == 0 || columna == 0) {
            System.out.println("No hay elementos");
            return;
        }
        int sumaL = 0;
        for (int i = 0; i < fila; i++) {
            sumaL += matriz[i][0];
        }
        for (int j = 1; j < columna; j++) {
            sumaL += matriz[fila - 1][j];
        }
        System.out.println("Suma de la letra L: " + sumaL);
    }
    
    // 6. Suma letra J
    public void sumaLetraJ() {
        if (fila == 0 || columna == 0) {
            System.out.println("No hay elementos");
            return;
        }
        int sumaJ = 0;
        for (int i = 0; i < fila; i++) {
            sumaJ += matriz[i][columna - 1];
        }
        for (int j = 0; j < columna - 1; j++) {
            sumaJ += matriz[fila - 1][j];
        }
        System.out.println("Suma de la letra J: " + sumaJ);
    }
    
    // 7. Suma letra U
    public void sumaLetraU() {
        if (fila == 0 || columna == 0) {
            System.out.println("No hay elementos");
            return;
        }
        int sumaU = 0;
        for (int i = 0; i < fila; i++) {
            sumaU += matriz[i][0];
        }
        for (int i = 0; i < fila; i++) {
            sumaU += matriz[i][columna - 1];
        }
        for (int j = 1; j < columna - 1; j++) {
            sumaU += matriz[fila - 1][j];
        }
        System.out.println("Suma de la letra U: " + sumaU);
    }
    
    // 8. Menor de cada fila
    public void menorPorFila() {
        if (fila == 0 || columna == 0) {
            System.out.println("No hay elementos");
            return;
        }
        for (int i = 0; i < fila; i++) {
            int menorFila = matriz[i][0];
            for (int j = 1; j < columna; j++) {
                if (matriz[i][j] < menorFila) {
                    menorFila = matriz[i][j];
                }
            }
            System.out.println("Menor de la fila " + (i+1) + ": " + menorFila);
        }
    }
    
    // 9. Contar pares
    public void contarPares() {
        int contador = 0;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }
        System.out.println("Cantidad de pares: " + contador);
    }
    
    // 10. Mover a la derecha
    public void moverDerecha() {
        if (columna <= 1) {
            System.out.println("No hay columnas suficientes");
            return;
        }
        for (int i = 0; i < fila; i++) {
            int ultimo = matriz[i][columna - 1];
            for (int j = columna - 1; j > 0; j--) {
                matriz[i][j] = matriz[i][j - 1];
            }
            matriz[i][0] = ultimo;
        }
        System.out.println("Elementos movidos a la derecha");
        listado();
    }
}