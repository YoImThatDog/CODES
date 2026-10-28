Algoritmo ej3
	Definir clave Como Cadena;

    Escribir "Ingrese su contraseña (mínimo 8 caracteres):"
    Leer clave
    Si Longitud(clave) >= 8  Entonces
		Escribir "tiene 8 caracteres"
		//aqui leer si tiene un numero y una letra
    Sino
        Escribir "no cumple con los requisitos"
    FinSi
    
FinAlgoritmo
