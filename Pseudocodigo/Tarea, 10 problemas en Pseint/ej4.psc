//Determinar si un numero es positivo y es multiplo de 5 o 10
Algoritmo ej4
	Definir num Como Entero;
	Leer num;
	
	si num > 0 y num mod 10 == 0 Entonces
		Escribir "Es positivo y multiplo de 10";
	FinSi
	
	si num > 0 y num mod 5 == 0 Entonces
		Escribir "Es positivo y multiplo de 5";
	SiNo
		Escribir "no cumple ninguna condicion";
	FinSi
	
FinAlgoritmo
