import java.util.Random;

public class TableroAl100 {
    public static void main(String[] args) {
        Random random = new Random();

        // Definir variables de Jugador 1 y Jugador 2 Como Entero
        int T1J1, T2J1, T3J1, T4J1, T5J1, T6J1;
        int T1J2, T2J2, T3J2, T4J2, T5J2, T6J2;

        // Asignación Jugador 1
        T1J1 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));
        T2J1 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));
        T3J1 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));
        T4J1 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));
        T5J1 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));
        T6J1 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));

        // Asignación Jugador 2
        T1J2 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));
        T2J2 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));
        T3J2 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));
        T4J2 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));
        T5J2 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));
        T6J2 = (int) ((random.nextInt(6) + 1) * Math.pow(10, random.nextInt(2)));

        // Imprimir tablero
        System.out.println("|" + T1J1 + "|" + T1J2 + "|");
        System.out.println("|" + T2J1 + "|" + T2J2 + "|");
        System.out.println("|" + T3J1 + "|" + T3J2 + "|");
        System.out.println("|" + T4J1 + "|" + T4J2 + "|");
        System.out.println("|" + T5J1 + "|" + T5J2 + "|");
        System.out.println("|" + T6J1 + "|" + T6J2 + "|");

        // Imprimir Puntajes
        System.out.println("Puntaje de:");
        System.out.println("Jugador 1: " + (T1J1 + T2J1 + T3J1 + T4J1 + T5J1 + T6J1));
        System.out.println("Jugador 2: " + (T1J2 + T2J2 + T3J2 + T4J2 + T5J2 + T6J2));
    }
}
