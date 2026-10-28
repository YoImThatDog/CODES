package TareaProblemas10;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int producto, descuento;
        boolean enStock;
        producto = scanner.nextInt();
        descuento = scanner.nextInt();
        enStock = scanner.nextBoolean();
        if ((producto < 100 || descuento > 20) && enStock) {
            System.out.println("producto en oferta, pasando de " + producto + "$ a solo " + (producto * ((double)descuento / 100)) + "$");
        }
        scanner.close();
    }
}

