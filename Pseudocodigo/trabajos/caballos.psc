Algoritmo sin_titulo
	Definir detenerpartida,seguirjugando Como Logico
	Definir caballo1,caballo2,Saldo,eleccion Como Entero
	
	detenerpartida = Falso
	seguirjugando = Verdadero
	Saldo = 1000
	
	Repetir
		Mientras seguirjugando y Saldo > 0 Hacer
			
			Escribir "vamos a jugar a apuestas de caballo"
			Escribir "quieres jugar?"
			Leer seguirjugando
			
			si seguirjugando == Verdadero Entonces
				caballo1 = Aleatorio(1,50)
				caballo2 = Aleatorio(1,50)
				
				Escribir "por que caballo apuestas? por el 1 o 2?"
				Leer eleccion
				
				Si eleccion==1 Entonces
					
					si caballo1 > caballo2 Entonces
						Escribir "tu caballo numero 1 gano "
						//Ganas dinero por apuesta
						Saldo = Saldo + 500
					SiNo
						Escribir "jaja pendejo"
						Saldo = saldo - 1000
					FinSi
					
				SiNo
					
					si caballo2 > caballo1 Entonces
						Escribir "tu caballo numero 2 gano "
						//Ganas dinero por apuesta
						Saldo = Saldo + 500
					SiNo
						Escribir "bruto"
						Saldo = saldo - 1000
					FinSi
					
				Fin Si
			SiNo
				detenerpartida = Verdadero
			FinSi
		Fin Mientras
		
		detenerpartida = Verdadero
		
	Hasta Que detenerpartida //se acabo el juego
	
	si saldo > 0 Entonces
		Escribir "ganaste tanto saldo ",saldo,"$"
	SiNo
		Escribir "te chingaste tu saldo fue de ",saldo,"$"
	FinSi
FinAlgoritmo
