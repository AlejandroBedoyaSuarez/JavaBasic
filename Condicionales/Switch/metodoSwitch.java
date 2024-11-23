package Condicionales.Switch;

public class metodoSwitch {
    public static void main(String[] args) {
        String colorLuz= "Amarillo";

        // swtich, variable o condición
        switch (colorLuz){
            //caso 1
            case "Verde" :
            System.out.println("Puede continuar"); 
            break; //Siempre cerrar con break
            
            //Caso 2
            case "Rojo" :
            System.out.println("El color es Rojo");
            break;

            //Caso 3
            case "Amarillo" :
            System.out.println("Se aplico el color de la luz");
            break;
        } 


    }
}
