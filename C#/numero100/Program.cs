using System;

class Program {
    static void Main() {
        Random random = new Random();

        // Definir variables de Jugador 1 y Jugador 2 Como Entero
        int T1J1, T2J1, T3J1, T4J1, T5J1, T6J1;
        int T1J2, T2J2, T3J2, T4J2, T5J2, T6J2;

        // Asignación Jugador 1 (El límite de Next(0, 2) genera 0 o 1)
        T1J1 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));
        T2J1 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));
        T3J1 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));
        T4J1 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));
        T5J1 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));
        T6J1 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));

        // Asignación Jugador 2
        T1J2 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));
        T2J2 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));
        T3J2 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));
        T4J2 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));
        T5J2 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));
        T6J2 = (int)((random.Next(1, 7)) * Math.Pow(10, random.Next(0, 2)));

        // Imprimir tablero
        Console.WriteLine("|" + T1J1 + "|" + T1J2 + "|");
        Console.WriteLine("|" + T2J1 + "|" + T2J2 + "|");
        Console.WriteLine("|" + T3J1 + "|" + T3J2 + "|");
        Console.WriteLine("|" + T4J1 + "|" + T4J2 + "|");
        Console.WriteLine("|" + T5J1 + "|" + T5J2 + "|");
        Console.WriteLine("|" + T6J1 + "|" + T6J2 + "|");

        // Imprimir Puntajes
        Console.WriteLine("Puntaje de:");
        Console.WriteLine("Jugador 1: " + (T1J1 + T2J1 + T3J1 + T4J1 + T5J1 + T6J1));
        Console.WriteLine("Jugador 2: " + (T1J2 + T2J2 + T3J2 + T4J2 + T5J2 + T6J2));
    }
}
