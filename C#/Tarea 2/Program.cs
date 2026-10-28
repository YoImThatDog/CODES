using System;

class Program 
{
    static void Main() 
    {
        int valorDelDado;
        Random random = new Random();
        valorDelDado = random.Next(1, 7);
        Console.WriteLine("El valor del dado fue de: " + valorDelDado);
    }
}