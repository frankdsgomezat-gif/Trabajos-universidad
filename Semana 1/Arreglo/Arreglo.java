package Arreglo;
import java.util.Scanner;

public class Arreglo {
    static int[] numerito;
    static int tope = 0;
    static Scanner teclado = new Scanner(System.in);
    
    public Arreglo() {
    }
    
    public void creaArreglo(int valor) {
        numerito = new int[valor];
        tope = 0;
    }
    
    public void lectura() {
        if (tope < numerito.length) {
            numerito[tope] = getNumero();
            tope++;
        } else {
            System.out.println("El arreglo ya esta lleno");
        }
    }
    
    public int getNumero() {
        int valor;
        System.out.print("Ingrese un numero: ");
        valor = teclado.nextInt();
        return valor;
    }
    
    public void escritura() {
        System.out.println("\tListado");
        System.out.println("\t=======");
        if (tope > 0) {
            for (int i = 0; i < tope; i++) {
                System.out.print(numerito[i] + "\t");
            }
        } else {
            System.out.println("No existe elementos");
        }
        System.out.println("\n");
    }
    
    public void sumaPares() {
        int suma = 0;
        for (int i = 0; i < tope; i++) {
            if (numerito[i] % 2 == 0) {
                suma = suma + numerito[i];
            }
        }
        System.out.println("La Suma es : " + suma);
    }
    
    public void primerParAlFinal() {
        if (tope > 0) {
            for (int i = 0; i < tope - 1; i++) {
                if (numerito[i] % 2 == 0) {
                    int aux = numerito[i];
                    numerito[i] = numerito[tope - 1];
                    numerito[tope - 1] = aux;
                    break;
                }
            }
        }
    }
    
    // ACTIVIDAD 1
    public void eliminarElemento(int x) {
        int posicion = -1;
        for (int i = 0; i < tope; i++) {
            if (numerito[i] == x) {
                posicion = i;
                break;
            }
        }
        if (posicion == -1) {
            System.out.println("El elemento " + x + " no se encuentra");
            return;
        }
        for (int i = posicion; i < tope - 1; i++) {
            numerito[i] = numerito[i + 1];
        }
        tope--;
        System.out.println("Se elimino el elemento " + x);
    }
    
    public void modificarElemento(int antiguo, int nuevo) {
        for (int i = 0; i < tope; i++) {
            if (numerito[i] == antiguo) {
                numerito[i] = nuevo;
                System.out.println("Elemento modificado correctamente");
                return;
            }
        }
        System.out.println("No se encontro el elemento");
    }
    
    public void insertarEnPosicion(int y, int posicion) {
        if (posicion < 0 || posicion > tope) {
            System.out.println("Posicion no valida");
            return;
        }
        if (tope >= numerito.length) {
            System.out.println("No hay espacio para insertar");
            return;
        }
        for (int i = tope; i > posicion; i--) {
            numerito[i] = numerito[i - 1];
        }
        numerito[posicion] = y;
        tope++;
        System.out.println("Elemento insertado");
    }
    
    public void eliminarPorPosicion(int posicion) {
        if (posicion < 0 || posicion >= tope) {
            System.out.println("Posicion invalida");
            return;
        }
        for (int i = posicion; i < tope - 1; i++) {
            numerito[i] = numerito[i + 1];
        }
        tope--;
        System.out.println("Elemento eliminado de la posicion " + posicion);
    }
    
    public void eliminarMenorMayorPromedio() {
        if (tope == 0) {
            System.out.println("No hay datos en el arreglo");
            return;
        }
        int menor = numerito[0];
        int mayor = numerito[0];
        int suma = numerito[0];
        for (int i = 1; i < tope; i++) {
            if (numerito[i] < menor) menor = numerito[i];
            if (numerito[i] > mayor) mayor = numerito[i];
            suma = suma + numerito[i];
        }
        double promedio = suma / (double) tope;
        eliminarElemento(menor);
        eliminarElemento(mayor);
        int posCercana = 0;
        double diferenciaMenor = Math.abs(numerito[0] - promedio);
        for (int i = 1; i < tope; i++) {
            double dif = Math.abs(numerito[i] - promedio);
            if (dif < diferenciaMenor) {
                diferenciaMenor = dif;
                posCercana = i;
            }
        }
        eliminarPorPosicion(posCercana);
        System.out.println("Se eliminaron menor, mayor y el valor mas cercano al promedio");
    }
    
    public void sumaImpares() {
        int suma = 0;
        for (int i = 0; i < tope; i++) {
            if (numerito[i] % 2 != 0) {
                suma = suma + numerito[i];
            }
        }
        System.out.println("La suma de los impares es: " + suma);
    }
    
    public void moverPrimeroAlFinal() {
        if (tope <= 1) {
            System.out.println("No hay suficientes elementos");
            return;
        }
        int primero = numerito[0];
        for (int i = 0; i < tope - 1; i++) {
            numerito[i] = numerito[i + 1];
        }
        numerito[tope - 1] = primero;
        System.out.println("Primer elemento movido al final");
    }
    
    public void moverUltimoAlInicio() {
        if (tope <= 1) {
            System.out.println("No hay suficientes elementos");
            return;
        }
        int ultimo = numerito[tope - 1];
        for (int i = tope - 1; i > 0; i--) {
            numerito[i] = numerito[i - 1];
        }
        numerito[0] = ultimo;
        System.out.println("Ultimo elemento movido al inicio");
    }
    
    // ACTIVIDAD 2 - Notas
    private double[] notas = new double[50];
    private int cantidad = 0;
    
    public void ingresarNota(double valor) {
        if (cantidad < notas.length) {
            notas[cantidad] = valor;
            cantidad++;
        } else {
            System.out.println("No se pueden guardar mas notas");
        }
    }
    
    public double hallarPromedio() {
        if (cantidad == 0) return 0;
        double suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma = suma + notas[i];
        }
        return suma / cantidad;
    }
    
    public double hallarNotaMenor() {
        if (cantidad == 0) return 0;
        double baja = notas[0];
        for (int i = 1; i < cantidad; i++) {
            if (notas[i] < baja) {
                baja = notas[i];
            }
        }
        return baja;
    }
    
    public double promedioSinMenor() {
        if (cantidad <= 1) return 0;
        double suma = 0;
        double menor = hallarNotaMenor();
        boolean yaQuitada = false;
        for (int i = 0; i < cantidad; i++) {
            if (!yaQuitada && notas[i] == menor) {
                yaQuitada = true;
                continue;
            }
            suma = suma + notas[i];
        }
        return suma / (cantidad - 1);
    }
    
    public void mostrarReporteNotas() {
        System.out.println("=== Reporte de Notas ===");
        System.out.println("Notas ingresadas:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(notas[i] + "  ");
        }
        System.out.println("\nCantidad: " + cantidad);
        System.out.println("Nota mas baja: " + hallarNotaMenor());
        System.out.println("Promedio general: " + String.format("%.2f", hallarPromedio()));
        System.out.println("Promedio sin la nota mas baja: " + String.format("%.2f", promedioSinMenor()));
    }
}