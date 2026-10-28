Algoritmo sin_titulo
	Definir sala,vidajugador,accion,dañojugador,vidazombie Como Entero
	Dimensionar vidazombie(2)
	dañojugador = 20
	sala = 1
	vidajugador=50
	
	Escribir "oprime cualquier tecla para continuar"
	Esperar Tecla
	Limpiar Pantalla
	
	Repetir
		
		Mientras sala <= 3 Hacer
			vidaesqueleto = 50
			vidazombie(1) = 50
			
			Escribir "TE ENCUENTRAS EN LA SALA ",sala
			Esperar 3 Segundos
			Limpiar Pantalla
			
			//COMBATE
			Repetir
				
				Limpiar Pantalla
				Escribir "HP JUGADOR: ",vidajugador
				Escribir "HP ESQUELETO: ",vidaesqueleto,"   HP ZOMBIE:",vidazombie(1)
				Escribir "||1:ATACAR||   ||2:OBJETO||   ||3:DEFENDER||"
				
				//ACCION ELEGIDA
				Leer accion
				Segun accion Hacer
					1:
						Escribir "ATACASTE"
						vidaesqueleto = vidaesqueleto - dañojugador
						vidazombie(1) = vidazombie(1) - dañojugador
					2:
						Escribir "TE CURASTE"
					3:
						Escribir "TE DEFIENDES"
					De Otro Modo:
						Escribir "Elige otra opcion"
				Fin Segun
				
				Esperar 1 Segundos
				
			Hasta Que vidaesqueleto<=0 Y vidazombie(1)<=0 o vidajugador<=0
			
			//Finaliza combate
			Limpiar Pantalla
			Esperar 1 Segundos
			sala = sala + 1
			
		Fin Mientras
		
	Hasta Que sala == 4
	
	Escribir "Felicidades has ganado"
	
FinAlgoritmo
