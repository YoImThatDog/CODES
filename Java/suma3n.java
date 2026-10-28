import java.util.Scanner;

public class suma3n {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int i, r;
        int a1, a2, a3;

        System.out.print("dame tu numero a descontruir: ");
        i = t.nextInt();

        a1 = i % 10;
        a2 = (i % 100) / 10;
        a3 = i / 100;
        r = a1 + a2 + a3;

        System.out.println("la suma de " + a3 + " + " + a2 + " + " + a1 + " es igual a = " + r);

        t.close();
    }
}
