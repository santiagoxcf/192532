import java.util.Scanner;

public class ejercicio1
 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingresa tu edad:");
        int numero = scanner.nextInt();

        System.out.print("ingresa la clave ultra secreta:");
        int clave = scanner.nextInt();

        System.out.print("ingresa correctamente la frase correcta:");
        String frase = scanner.nextLine();

     
            System.out.println("Acceso confirmado");
            
        scanner.close();
       
    }
}
