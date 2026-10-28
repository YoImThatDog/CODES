Algoritmo ejercicio7para
	
	Definir numeral Como Entero
    Definir peso, suma, promedio Como Real
    
    Escribir "Solicita la cantidad de muestras de peso:"
    Leer numeral
    
    suma = 0
    Para i <- 1 Hasta numeral Con Paso 1 Hacer
        Escribir "Ingrese el peso de la muestra ", i, ":"
        Leer peso
        suma = suma + peso
    FinPara
    
    promedio = suma / numeral
    Escribir "El promedio de todas las muestras es: ", promedio
	
FinAlgoritmo
