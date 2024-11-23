package Condicionales.IF;

import java.util.Scanner;

public class Anidadas {
    public static void main(String[] args) {
        // El promedio es aprobatorio si tiene 7 o más
        // Si sacó 10 decir = Eres el mejor de la clase, pana
        // Si el promedio es aprobatorio pero menor a 10 = Felicidades
        // Si el promedio no es aprobatorio = te quedaste, jaja pendejo

        // Como vamos a querer ver las calificaciones, necesitamos hacer que se ingrese
        // por teclado
        // biblioteca Scanner nombreScanner = Objeto(Entrada)
        Scanner scansito = new Scanner(System.in);

        // Escribimos lo que debe hacer el usuario
        // Si se quiere que la opción de escritura sea en la misma linea de la petición,
        // solo poner print (Quitamos el ln)
        System.out.println("Ingrese el promedio del alumno");
        // Aquí se va a guardar la nota que ponga el usuario
        // tipo de dato nombreVariable = nombreScanner.nextTIPODEDATO
        // en caso que sea String, es nextLine
        double nota = scansito.nextDouble();

        if (nota == 10) {
            System.out.println("Sobresaliente, sacaste " + nota);
        } else if (nota >= 7) {
            System.out.println("Lo hiciste bien, pasaste con " + nota);
        } else {
            System.out.println("tu nota fue de " + nota + ", no aprobaste");
        }

        scansito.close();
    }
}
