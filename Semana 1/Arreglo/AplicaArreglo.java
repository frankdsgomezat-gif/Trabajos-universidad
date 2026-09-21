package Arreglo;
import java.util.Scanner;

public class AplicaArreglo {
    static Arreglo objArreglo = new Arreglo();
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    static void menu() {
        int opcion, tam;
  
        do {
            System.out.println("        Menu de Opciones");
            System.out.println("============================");
            System.out.println("--- ARREGLO DE NUMEROS ---");
            System.out.println("1.- Crear el Arreglo");
            System.out.println("2.- Ingresar Datos");
            System.out.println("3.- Mostrar Datos");
            System.out.println("4.- Eliminar elemento X");
            System.out.println("5.- Modificar elemento X");
            System.out.println("6.- Insertar en posicion");
            System.out.println("7.- Eliminar por posicion");
            System.out.println("8.- Eliminar menor, mayor y promedio");
            System.out.println("9.- Suma de impares");
            System.out.println("10.- Mover primero al final");
            System.out.println("11.- Mover ultimo al inicio");
            System.out.println("12.- Suma de pares");
            System.out.println("13.- Primer par al final");
            System.out.println("--- NOTAS DE PRACTICAS ---");
            System.out.println("14.- Ingresar notas");
            System.out.println("15.- Mostrar reporte de notas");
            System.out.println("0.- Salir");
            System.out.println("============================");
            System.out.print("Ingrese una alternativa: ");
            opcion = teclado.nextInt();
            System.out.println();
            
            if (opcion == 1) {
                System.out.print("Ingrese tamaño del Arreglo: ");
                tam = teclado.nextInt();
                objArreglo.creaArreglo(tam);
                System.out.println("Arreglo creado con " + tam + " espacios");
            }
            if (opcion == 2) {
                objArreglo.lectura();
            }
            if (opcion == 3) {
                objArreglo.escritura();
            }
            if (opcion == 4) {
                System.out.print("Ingrese el numero a eliminar: ");
                int x = teclado.nextInt();
                objArreglo.eliminarElemento(x);
            }
            if (opcion == 5) {
                System.out.print("Elemento a cambiar: ");
                int ant = teclado.nextInt();
                System.out.print("Nuevo valor: ");
                int nuev = teclado.nextInt();
                objArreglo.modificarElemento(ant, nuev);
            }
            if (opcion == 6) {
                System.out.print("Valor a insertar: ");
                int y = teclado.nextInt();
                System.out.print("En que posicion: ");
                int pos = teclado.nextInt();
                objArreglo.insertarEnPosicion(y, pos);
            }
            if (opcion == 7) {
                System.out.print("Posicion a eliminar: ");
                int posE = teclado.nextInt();
                objArreglo.eliminarPorPosicion(posE);
            }
            if (opcion == 8) {
                objArreglo.eliminarMenorMayorPromedio();
            }
            if (opcion == 9) {
                objArreglo.sumaImpares();
            }
            if (opcion == 10) {
                objArreglo.moverPrimeroAlFinal();
            }
            if (opcion == 11) {
                objArreglo.moverUltimoAlInicio();
            }
            if (opcion == 12) {
                objArreglo.sumaPares();
            }
            if (opcion == 13) {
                objArreglo.primerParAlFinal();
            }
            if (opcion == 14) {
                System.out.print("Cuantas notas va a ingresar: ");
                int n = teclado.nextInt();
                for (int i = 1; i <= n; i++) {
                    System.out.print("Nota " + i + ": ");
                    double nota = teclado.nextDouble();
                    objArreglo.ingresarNota(nota);
                }
            }
            if (opcion == 15) {
                objArreglo.mostrarReporteNotas();
            }
            
        } while (opcion != 0);
        System.out.println("Programa finalizado");
    }
}