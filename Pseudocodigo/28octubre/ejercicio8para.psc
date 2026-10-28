Algoritmo ejercicio8para
	Definir numeral, pares, impares Como Entero
    
    Escribir "Ingrese un límite superior N:"
    Leer numeral
    
    pares = 0
    impares = 0
    
    Para i <- 1 Hasta numeral Con Paso 1 Hacer
        Si i % 2 = 0 Entonces
            pares = pares + 1
        Sino
            impares = impares + 1
        FinSi
    FinPara
    
    Escribir "Cantidad de números pares: ", pares
    Escribir "Cantidad de números impares: ", impares
	
FinAlgoritmo
