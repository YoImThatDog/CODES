Algoritmo ejerecicio2para
	Definir numeral,suma Como Entero
	
	Escribir "ingresar dato a contar y sumar"
	Leer numeral
	
	Para i<-0 Hasta numeral-1 Con Paso 1 Hacer
		
		suma=numeral+suma
		Escribir "#",i+1," se va a sumar ",numeral," con ",suma
		
	Fin Para
	
	Escribir "el total es de: ",suma
	
FinAlgoritmo
