import java.util.Scanner;
import java.util.Random;

public class horserace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean detenerpartida;
        boolean seguirjugando;
        int caballo1, caballo2, Saldo, eleccion;

        detenerpartida = false;
        seguirjugando = true;
        Saldo = 1000;

        do {
            while (seguirjugando && Saldo > 0) {

                System.out.println("We are going to play horse betting!");
                System.out.print("Do you want to play? (true/false): ");
                // Reads true or false from the console
                seguirjugando = scanner.nextBoolean();

                if (seguirjugando) {
                    // Generates a random number between 1 and 50
                    caballo1 = random.nextInt(50) + 1;
                    caballo2 = random.nextInt(50) + 1;

                    System.out.print("Which horse do you bet on? 1 or 2?: ");
                    eleccion = scanner.nextInt();

                    if (eleccion == 1) {

                        if (caballo1 > caballo2) {
                            System.out.println("Your horse number 1 won!");
                            // You win money from the bet
                            Saldo = Saldo + 500;
                        } else {
                            System.out.println("Haha, loser!");
                            Saldo = Saldo - 1000;
                        }

                    } else {

                        if (caballo2 > caballo1) {
                            System.out.println("Your horse number 2 won!");
                            // You win money from the bet
                            Saldo = Saldo + 500;
                        } else {
                            System.out.println("You lost!");
                            Saldo = Saldo - 1000;
                        }

                    }
                } else {
                    detenerpartida = true;
                }
            }

            detenerpartida = true;

        } while (!detenerpartida); // Game over

        if (Saldo > 0) {
            System.out.println("You won this amount of balance: " + Saldo + "$");
        } else {
            System.out.println("You went broke! Your final balance was: " + Saldo + "$");
        }

        scanner.close();
    }
}