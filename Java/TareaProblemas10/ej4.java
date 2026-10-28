package TareaProblemas10;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        if (num > 0 && num % 10 == 0) {
            System.out.println("Es positivo y multiplo de 10");
        }
        if (num > 0 && num % 5 == 0) {
            System.out.println("Es positivo y multiplo de 5");
        } else {
            System.out.println("no cumple ninguna condicion");
        }
        scanner.close();
    }
}
