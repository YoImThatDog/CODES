Algoritmo ej10
	Definir producto,descuento como Entero;
	Definir enStock Como Logico;
	Leer producto,descuento,enStock;
	si producto < 100 o descuento > 20 Y enStock Entonces
		Escribir "producto en oferta, pasando de ",producto,"$ a solo ",producto * (descuento/100),"$";
	FinSi
FinAlgoritmo
