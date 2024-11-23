package Condicionales.IF;

public class Alcance {
    public static void main(String[] args) {
        //Esta variable tiene el alcance de todo el proceso
        String colorAzul= "Azul";

        //Si condición es x
        if (colorAzul.equals("Azul")) {
            //entonces va a imprimir "Color correcto"
            System.out.println("Color correcto");
            //por otro lado, esta variable solo tendrá efecto en su proceso de if
            String mensaje2;
            if (true) {
                mensaje2= "estamos de vuelta";
            }
        }  
    }
   
}

