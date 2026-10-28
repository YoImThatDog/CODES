import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Definir valorDelDado Como Entero;
        int valorDelDado;
        
        // valorDelDado = Aleatorio(1,6);
        Random random = new Random();
        valorDelDado = random.nextInt(6) + 1; // Genera un número del 1 al 6
        
        // Escribir "El valor del dado fue de: " valorDelDado;
        System.out.println("El valor del dado fue de: " + valorDelDado);
    }
}
