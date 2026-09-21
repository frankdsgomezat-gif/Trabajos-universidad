package Clases;
import java.util.Scanner;

public class AplicaMatriz {
    static CMatriz objArreglo = new CMatriz();
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    static void menu() {
        int opcion, fila, columna;
        do {
            System.out.println("\n    Menu de Opciones");
            System.out.println("--------------------------");
            System.out.println("1.- Crea el Arreglo");
            System.out.println("--------------------------");
            System.out.println("2.- Ingresar Datos");
            System.out.println("3.- Mostrar Datos");
            System.out.println("4.- Suma de Elementos");
            System.out.println("5.- Elimina el ultimo numero");
            System.out.println("--------------------------");
            System.out.println("6.- Eliminar elemento X");
            System.out.println("7.- Modificar elemento X");
            System.out.println("8.- Sumar todos los elementos");
            System.out.println("9.- Menor, Mayor y Promedio");
            System.out.println("10.- Suma de la letra L");
            System.out.println("11.- Suma de la letra J");
            System.out.println("12.- Suma de la letra U");
            System.out.println("13.- Menor de cada fila");
            System.out.println("14.- Contar numeros pares");
            System.out.println("15.- Mover filas a la derecha");
            System.out.println("--------------------------");
            System.out.println("0.- Salir");
            System.out.println("--------------------------");
            System.out.print("ingrese una alternativa: ");
            opcion = teclado.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1: {
                    System.out.print("Ingrese tamaño de la Fila : ");
                    fila = teclado.nextInt();
                    System.out.print("Ingrese tamaño de la Columna : ");
                    columna = teclado.nextInt();
                    objArreglo.crearArreglo(fila, columna);
                    System.out.println("");
                }
                break;
                case 2:
                    objArreglo.leerNumero();
                    System.out.println("");
                    break;
                case 3:
                    objArreglo.listado();
                    System.out.println("");
                    break;
                case 4:
                    objArreglo.suma();
                    System.out.println("");
                    break;
                case 5:
                    objArreglo.eliminaUltimaColumna();
                    System.out.println("");
                    break;
                case 6:
                    System.out.print("Elemento a eliminar: ");
                    int x = teclado.nextInt();
                    objArreglo.eliminarElemento(x);
                    System.out.println("");
                    break;
                case 7:
                    System.out.print("Elemento actual: ");
                    int ant = teclado.nextInt();
                    System.out.print("Nuevo valor: ");
                    int nuev = teclado.nextInt();
                    objArreglo.modificarElemento(ant, nuev);
                    System.out.println("");
                    break;
                case 8:
                    objArreglo.sumarTodos();
                    System.out.println("");
                    break;
                case 9:
                    objArreglo.menorMayorPromedio();
                    System.out.println("");
                    break;
                case 10:
                    objArreglo.sumaLetraL();
                    System.out.println("");
                    break;
                case 11:
                    objArreglo.sumaLetraJ();
                    System.out.println("");
                    break;
                case 12:
                    objArreglo.sumaLetraU();
                    System.out.println("");
                    break;
                case 13:
                    objArreglo.menorPorFila();
                    System.out.println("");
                    break;
                case 14:
                    objArreglo.contarPares();
                    System.out.println("");
                    break;
                case 15:
                    objArreglo.moverDerecha();
                    System.out.println("");
                    break;
                default:
                    System.out.println("ingrese otra opcion");
            }
        } while (opcion != 0);
    }
}