import java.util.Scanner;

public class lradio {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float P, A;
        int R;

        System.out.print("Vamos a calcuar un circulo pero ocupo del Radio: ");
        R = t.nextInt();

        P = (float) (2 * Math.PI * R);
        A = (float) (Math.PI * Math.pow(R, 2));

        System.out.println("Tu perimetro es de: " + P);
        System.out.println("Tu area es de: " + A);

        t.close();
    }
}
