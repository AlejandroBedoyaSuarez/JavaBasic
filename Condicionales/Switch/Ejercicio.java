package Condicionales.Switch;
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {

        /*
         * Escribe un programa en Java que funcione como una calculadora básica. El
         * programa debe:
         
         * Pedir al usuario que ingrese dos números.
         
         * Mostrar un menú con las siguientes opciones:
         
         * Sumar
         * Restar
         * Multiplicar
         * Dividir
         
         * Usar un switch para realizar la operación seleccionada.
         * Mostrar el resultado de la operación.
         * Si el usuario ingresa una opción inválida, mostrar un mensaje de error.
         */

        Scanner scaneao = new Scanner(System.in);

        System.out.println("Calculadora Básica");
        System.out.print("Ingrese el primer número: ");
        double numeroUno= scaneao.nextDouble();
        System.out.print("Ingrese el segundo número");
        double numeroDos= scaneao.nextDouble();

 // Mostrar el menú de operaciones
 System.out.println("Seleccione una operación:");
 System.out.println("1. Sumar");
 System.out.println("2. Restar");
 System.out.println("3. Multiplicar");
 System.out.println("4. Dividir");

 System.out.print("Opción: ");
 int opcion = scaneao.nextInt();

 // Variable para almacenar el resultado
 double resultado;

 // Estructura switch para realizar la operación
 switch (opcion) {
     case 1:
         resultado = numeroUno + numeroDos;
         System.out.println("Resultado: " + resultado);
         break;

     case 2:
         resultado = numeroUno - numeroDos;
         System.out.println("ResultadonumeroDos: " + resultado);
         break;

     case 3:
         resultado = numeroUno * numeroDos;
         System.out.println("Resultado: " + resultado);
         break;

     case 4:
         // Validar división por cero
         if (numeroDos != 0) {
             resultado = numeroUno / numeroDos;
             System.out.println("Resultado: " + resultado);
         } else {
             System.out.println("Error: No se puede dividir entre cero.");
         }
         break;

     default:
         System.out.println("Opción inválida. Por favor, seleccione una opción del 1 al 4.");
         break;
 }

 // Cerrar el scanner
 scaneao.close();
}
}
