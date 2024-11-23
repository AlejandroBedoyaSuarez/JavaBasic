package Condicionales.IF;


public class IF {
    public static void main(String[] args) {
        String colorAzul= "Azul";

        //Si condición es x
        if (colorAzul.equals("Azul")) {
            //entonces va a imprimir "Color correcto"
            System.out.println("Color correcto");
            //sino si
        }else if (colorAzul.equals("Amarillo")) {
            System.out.println("Acceso a medias");
            //sino
        }else {
            //Se va a imprimir que el color es incorrecto
            System.out.println("Color incorrecto");
        }
    }
}
