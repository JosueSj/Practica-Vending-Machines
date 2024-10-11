import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Maquina expendedora \n");
        System.out.println("Opciones:" +
                            "\n         1: Coca-Cola" +
                            "\n         2: Coca-Cola Zero" +
                            "\n         3: Levite" +
                            "\n         4: Agua" +
                            "\n         5: Agua con GAS");
        
                          
        System.out.print("Ingrese una opcion: ");
        int option = scaner.nextInt(); 
        switch (option) {
            case 1:
            System.out.println("Coca-Cola: Disfruta tu buena Coca-cola.");
                break;

            case 2:
            System.out.println("Coca-Cola Zero: Vaya! Verdaderamente te cuidas del azucar.");
                break;

            case 3:
                System.out.println("Levita: Genial! Buena eleccion.");
                break;

            case 4:
                System.out.println("Agua: Siempre es bueno hidratarse.");
                break;
            case 5:
                System.out.println("Agua con GAS: Buena opcion para refrescarse.");
                break;
        
            default:
            System.out.println("Opcion incorrecta");
                break;
        }
    }
}
