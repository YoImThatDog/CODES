import java.util.Scanner;

public class hora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la hora actual (0-23): ");
        int t = teclado.nextInt();

        System.out.print("Introduce el numero de horas a sumar (h): ");
        int h = teclado.nextInt();

        int horaFutura = (t + h) % 24;

        System.out.println("Dentro de " + h + " horas, el reloj marcara las: " + horaFutura);
        
        teclado.close();
    }
}