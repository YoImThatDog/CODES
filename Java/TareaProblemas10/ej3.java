package TareaProblemas10;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clave;
        System.out.println("Ingrese su contraseña (mínimo 8 caracteres):");
        clave = scanner.nextLine();
        if (clave.length() >= 8) {
            System.out.println("tiene 8 caracteres");
        } else {
            System.out.println("no cumple con los requisitos");
        }
        scanner.close();
    }
}
