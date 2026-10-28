import java.util.Scanner;

public class dias {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int dias;
        float minutos, segundos;

        System.out.print("dime cuantos dias quieres calcular: ");
        dias = t.nextInt();

        minutos = dias * 24 * 60;
        segundos = minutos * 60;

        System.out.println("En " + dias + " dias hay:");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");

        t.close();
    }
}
