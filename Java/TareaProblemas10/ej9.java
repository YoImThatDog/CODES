package TareaProblemas10;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias;
        dias = scanner.nextInt();
        if (dias == 366) {
            System.out.println("si es año bisiesto");
        } else {
            System.out.println("no es año bisiesto");
        }
        scanner.close();
    }
}

