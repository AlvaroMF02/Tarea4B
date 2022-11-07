package alvaro;

import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author alvaro
 */
public class Tarea4BPassword {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.println("ESCOJA UNA OPCIÓN");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    String pin = generarPin();
                    System.out.println(pin);
                    break;

                case 2:
                    String passw = generarContr();
                    System.out.println(passw);
                    break;

                case 3:
                    String passw2 = generarContrAvan();
                    System.out.println(passw2);
                    break;
                case 4:
                    System.out.println("SALIDA DEL PROGRAMA");
                    break;

                default:
                    System.out.println("ESCRIBA BIEN UN CÓDIGO");
            }

        } while (opcion != 4);

    }

    public static void mostrarMenu() {
        String menu = """
                    --------------MENU-------------
                    
                    1. GENERAR PIN
                    2. GENERAR CONTRASEÑA
                    3. GENERAR CONTRASEÑA AVANZADA
                    4. PARA SALIR
                      
                    -------------------------------
                    """;

        System.out.println(menu);
    }

    //CON VOID SE HARIA MEJOR PERO LO HE QUERIDO HACER ASI
    public static String generarPin() {
        //OPC 1- PIN DE 4
        String pin = RandomStringUtils.randomNumeric(4);

        return pin;
    }

    public static String generarContr() {
        //OPC 2 - CONTRASEÑA CON NUMEROS Y LETRAS

        String contra = RandomStringUtils.randomAlphanumeric(8);

        return contra;
    }

    public static String generarContrAvan() {
        //OPC 3 - CONJUNTO ALEA DE LO QUE YO ELIJA

        char[] conjuntoCaract = {'a', 'f', '*', '/', 'ñ', ')', 'q', '0', 'e', 'r'};
        int numero = 10;

        String contra = RandomStringUtils.random(numero, conjuntoCaract);

        return contra;
    }

}
