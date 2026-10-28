package TareaProblemas10;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        if (num % 2 == 0 && Math.pow(2, num) > 50) {
            System.out.println("Es par y es mayor a 50");
        }
        scanner.close();
    }
}
