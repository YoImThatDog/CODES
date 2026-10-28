package TareaProblemas10;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dragonball;
        Dragonball = scanner.nextInt();
        if (Dragonball == 7) {
            System.out.println("hola Shen Long");
        } else {
            System.out.println("te hacen falta " + (7 - Dragonball) + " esferas para invocar");
        }
        scanner.close();
    }
}

