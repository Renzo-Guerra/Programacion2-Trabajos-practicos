## Trabajo Práctico Nº 1 – 2022

_Para cada uno de los siguientes problemas, implementarlos en Java._

**Ejercicios:**
  1. [Persona](#persona)
  1. [Electrodomésticos](#electrodomésticos)
  1. [Elementos geométricos](#elementos-geométricos)
  1. [Clase Rectangulo](#clase-rectangulo)

### Persona
Consigna: Implementar una clase llamada Persona con las siguientes características:
* Atributos: 
  * nombre
  * edad
  * fecha de nacimiento
  * DNI
  * sexo
  * peso 
  * altura
* Valores por defecto:
  * El DNI es un valor obligatorio, no posee valor por defecto.
  * En caso de la fecha de nacimiento será el 1 de enero de 2000.
  * Sexo será Femenino por defecto.
  * El nombre por defecto es N y el apellido es N.
  * El peso y la altura son 1 por defecto.
* Acorde a lo anterior se deben crear los constructores:
  * con DNI
  * con DNI, nombre y apellido
  * con DNI, nombre, apellido y Fecha de nacimiento….

* La responsabilidad de la clase es la siguiente:
  * Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice de masa corporal el cual es peso / altura2

  * Saber si está en forma. Está en forma si el índice de masa corporal se encuentra entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad).
  * Saber si está cumpliendo años.
  * Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18 años.
  * Métodos set de cada parámetro, excepto de DNI.
  * Saber si puede votar. Es necesario ser mayor de 16 años.
  * Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
  * Mostrar toda la información del objeto. Es decir devolver un String con la información del mismo.

## Electrodomésticos
Consigna: Crear una clase **Electrodomestico** con las siguientes características:

* Atributos:
  * nombre
  * precio base
  * color
  * consumo energético
  * peso.
* Valores por defecto:
  * El color por defecto es gris plata.
  * El consumo energético 10 Kw.
  * Precio base 100 pesos.
  * El peso es 2 kg.
* Implementar todos los constructores.
* La funcionalidad de la clase es la siguiente:
  * Todos los métodos get y set.
  * Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
  * Calcular el balance, el mismo es el resultado de dividir el costo por el peso
  * Indicar si un producto es de alta gama, el balance es mayor que 3

## Elementos Geométricos
Consigna: Implementar la clase **PuntoGeometrico**, la cual posee dos valores de coordenada X, Y.
El valor por defecto de los mismos es (0,0)

La funcionalidad que posee la clase es la siguiente:
  * Desplazar el punto en el plano: Se encarga de trasladar el punto a otra posición del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad (cierto desplazamiento en X y cierto desplazamiento en Y). 
  * Calcular la distancia euclídea: Dado un punto es posible establecer la distancia euclídea con otro punto acorde a la siguiente formula:
***
    Distancia^2= (X1 – X2)^2 + (Y1 – Y2)^2

    ACLARACION: ^ = elevado | potencia.
***
La clase **Math** de Java define un método de clase **sqrt** para el cálculo de la raíz cuadrada.
Implementar la clase **Rectangulo**.

Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se trabajará con Rectángulos cuyos lados estén paralelos a los ejes.

<u>Nota:</u> Definir la estructura que deber poseer un rectángulo y en base a esto implementar los atributos de la clase.

La **funcionalidad** que debe proveer un rectángulo es la siguiente: 
  * Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e Y.
  * Calcular el Área del rectángulo.
  * Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área del mismo es mayor que la del otro.
  * Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las propiedades para que sea un cuadrado.
  * Determinar el largo del lado superior.
  * Determinar si está acostado o parado (si el alto es más que el ancho). 


## Clase Rectangulo
Consigna: A la clase **Rectangulo** del ejercicio 3 implementarla nuevamente, guardando solo un vértice y las longitudes de los lados. Implementar la misma interfaz que en el ejercicio 3.

<u>Nota:</u> Tener en cuenta la dirección de los lados. Proveer dos constructores, uno con los 4 puntos y otro con los datos anteriores.