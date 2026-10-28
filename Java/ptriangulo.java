import java.util.Scanner;

public class ptriangulo {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("Ingrese dato de Cateto A: ");
        double CA = t.nextDouble();
        System.out.print("Ingrese dato de Cateto B: ");
        double CB = t.nextDouble();

        double P = CA + CB + Math.sqrt(Math.pow(CA, 2) + Math.pow(CB, 2));

        System.out.println("El perímetro total es: " + P + " cm");

        t.close();
    }
}
