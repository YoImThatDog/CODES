package TareaProblemas10;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double promedio;
        promedio = scanner.nextDouble();
        if (promedio > 7) {
            System.out.println("si paso");
        } else {
            System.out.println("no paso");
        }
        scanner.close();
    }
}

