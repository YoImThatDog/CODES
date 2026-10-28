import java.util.Scanner;

public class promedio3 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        float a, b, c, r;
        System.out.println("vamos a sacar el promedio de 3 numeros:");
        System.out.print("dame tu primer valor: ");
        a = t.nextFloat();

        System.out.print("dame tu segundo valor: ");
        b = t.nextFloat();

        System.out.print("dame tu tercer valor: ");
        c = t.nextFloat();

        r = a + b + c;
        r = r / 3;

        System.out.println("tu promedio es de: " + (int) r);
        t.close();
    }
}
