package TareaProblemas10;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad, experiencia;
        boolean titulo;
        edad = scanner.nextInt();
        experiencia = scanner.nextInt();
        titulo = scanner.nextBoolean();
        if (edad > 21 && experiencia > 0 && titulo) {
            System.out.println("es apto para el trabajo");
        }
        scanner.close();
    }
}
