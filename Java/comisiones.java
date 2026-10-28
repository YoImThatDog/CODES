import java.util.Scanner;

public class comisiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seleccion, tipodecuerpo = 0;
        while (tipodecuerpo == 0) {
            System.out.println("Que tamaño de cuerpo para tu comision buscas?");
            System.out.println("1: Icon 2:Half 3:Full");
            seleccion = scanner.nextInt();
            if (seleccion == 1) {
                tipodecuerpo = 15;
            } else if (seleccion == 2) {
                tipodecuerpo = 30;
            } else if (seleccion == 3) {
                tipodecuerpo = 50;
            } else {
                System.out.println("Opción inválida. Por favor, selecciona 1, 2 o 3.");
            }
        }
        System.out.println("el costo es de "+tipodecuerpo+("$"));
        scanner.close();
    }
}
