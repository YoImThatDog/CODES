package TareaProblemas10;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad, salario;
        boolean empleo;
        edad = scanner.nextInt();
        salario = scanner.nextInt();
        empleo = scanner.nextBoolean();
        if (edad > 18 && salario > 10000 && empleo) {
            System.out.println("estas disponible para el credito");
        } else {
            System.out.println("lo sentimos no estas apto para un credito");
        }
        scanner.close();
    }
}
