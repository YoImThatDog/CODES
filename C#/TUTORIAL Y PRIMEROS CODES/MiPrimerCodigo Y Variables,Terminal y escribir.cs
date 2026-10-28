// el Console.ForegroundColor=ConsoleColor.(color); es para cambiar el texto de la terminal, darle reset para que vuelva a la normalidad
Console.ForegroundColor=ConsoleColor.Magenta;
Console.WriteLine("Usar: -dotnet run- para correr el programa en la terminal");
Console.WriteLine("importante igual para limpiar la terminal usando -cls- que es clean screen para limpiar la terminal");
Console.WriteLine("Puedo usar Ctrl+ñ para abrir la terminal");
Console.WriteLine("Hola como estan todos, es un gusto poder escribir en C#");
// --- VARIABLES NUMÉRICAS (ENTEROS Y REALES) ---

int vida = 100; 
// int guarda números enteros (sin decimales). Ideal para vida, munición o niveles.

float velocidad = 5.5f; 
// float guarda números reales (con decimales). Lleva una 'f' al final obligatoria. Ideal para velocidades, tiempo y físicas.

double gravedad = -9.81; 
// double guarda números reales de alta precisión (con más decimales que float). No lleva letra al final. Ideal para cálculos matemáticos complejos.


// --- VARIABLES DE TEXTO (CARÁCTER Y CADENA) ---

char grupoSanguineo = 'A'; 
// char guarda un solo carácter o letra. El valor va OBLIGATORIAMENTE entre comillas simples (' ').

string nombreJugador = "Aragorn"; 
// string guarda cadenas de texto (palabras o frases completas). El valor va entre comillas dobles (" "). Ideal para nombres, diálogos o descripciones.


// --- VARIABLES LÓGICAS (BOOLEANOS) ---

bool juegoTerminado = false; 
// bool (booleano) solo puede guardar dos valores: true (verdadero) o false (falso). Ideal para interruptores: ¿está vivo?, ¿tiene la llave?, ¿está saltando?


// --- VARIABLES ESPECIALES ---

var puntuacion = 500; 
// var es una variable de "tipo implícito". C# es inteligente y adivina el tipo automáticamente según el valor (en este caso, detecta que es un 'int').
// //saldra error cuando no uses tus variables por esta razon usamos estos comandos para escribirlos en la terminal
Console.ForegroundColor = ConsoleColor.Green;
Console.WriteLine("--- DATOS DEL JUGADOR ---");
Console.ForegroundColor = ConsoleColor.Blue;
Console.WriteLine("Nombre: " + nombreJugador);
Console.ForegroundColor = ConsoleColor.Red;
Console.WriteLine("Puntos de Vida: " + vida);
Console.ResetColor();
Console.WriteLine("Velocidad de movimiento: " + velocidad + " m/s");
Console.WriteLine("Gravedad del mundo: " + gravedad);
Console.WriteLine("Tipo de sangre: " + grupoSanguineo);
