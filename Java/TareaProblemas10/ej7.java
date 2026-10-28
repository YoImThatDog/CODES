package TareaProblemas10;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int generacion;
        generacion = scanner.nextInt();
        if (generacion > 7) {
            System.out.println("es posible instalar windows");
        }
        scanner.close();
    }
}

