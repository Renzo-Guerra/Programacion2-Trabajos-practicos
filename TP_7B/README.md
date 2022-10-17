## Trabajo Práctico Nº 7 (parte A) – 2022

_Para cada una de los siguientes problemas **identificar los objetos que intervienen, su estado y su comportamiento**. Implementar en Java_

## Enunciados:
  1. [Sistema de Archivos](#sistema-de-archivos)
  1. [Compañía de envíos](#compañía-de-envíos)
  1. [Expresiones matemáticas](#expresiones-matemáticas)
___

### Sistema de Archivos
Un Sistema de Archivos debe organizar y manipular los siguientes elementos: 
* archivos.
* directorios. 
* links
* archivos comprimidos. 

Los archivos se definen por:
* un nombre.
* una fecha de creación.
* una fecha de última modificación 
* un tamaño. 

Los directorios tienen:
* un nombre.
* una fecha de creación.
* un conjunto de archivos 
* un conjunto de sub-directorios. 

El tamaño de un directorio está dado por _"el tamaño de sus sub-directorios, sus archivos, sus links y sus archivos comprimidos"_. 

Los links son vínculos a otro archivo o directorio y tienen:
* un nombre.
* una fecha de creación
* un tamaño en disco (el cual es siempre igual a 1Kb). 

Los archivos comprimidos son un tipo particular de archivo que contienen otros archivos y/o directorios en formato comprimido según una tasa de compresión dada, tienen: 
* un nombre.
* una fecha de creación.

Implementar una solución orientada a objetos para este problema que permita determinar:
* La cantidad de elementos que posee un directorio particular.
* El tamaño total de un directorio particular.



🔼 [Volver a los enunciados](#enunciados)
___

### Compañía de envíos
Una compañía de envíos posee distintos tipos de servicios de envíos, entre los mismos se encuentran:
* Envío de paquetes y cartas, una carta/paquete posee:
  * un destinatario con su dirección.
  * un remitente con su dirección,
  * si la retiran en la sucursal de destino o la envían a
domicilio, 
  * y su peso.
* Combo Postal, es una modalidad por la cual se agrupa un conjunto de envíos (cualquier tipo de envío). 
  * (**Todos los envíos incluidos en un combo postal deben tener la misma ciudad de destino.**)

Todos los envíos poseen un único número de tracking que permite hacer su seguimiento (**Un ID**). 

En los combos el tracking es el mismo para todos los elementos que contiene, y cuando un elemento se agrega a un combo se le cambia el tracking del elemento poniendo el del combo. (**Si el elemento agregado era un combo, este debe cambiar también el tracking de todos sus elementos para adecuarse al nuevo valor**).

El peso de los combos es la suma de todos los elementos que este contiene. 

El destinatario, remitente y la dirección de un "**combo**" es el valor del primer elemento que ellos poseen (no se tiene en cuenta el resto de los elementos)

🔼 [Volver a los enunciados](#enunciados)
___

### Expresiones matemáticas
En un congreso de Aritmética decidieron utilizar un sistema para organizar sus expresiones matemáticas. 

Las expresiones con las que trabajan son expresiones básicas, que incluyen :
* suma.
* resta.
* producto.
* división.
* potencia. 
* raíz. 
```
  Por ejemplo:

  ((2 + 3) * 5)
  ((5 + 5) ^ (3 - 1))
  ((7 + 8) / (5 - 3))
```

Luego de muchas discusiones se pusieron de acuerdo en qué es lo que querían que el sistema fuera capaz de proveer:

1. Obtener el valor de la expresión: en los ejemplos anteriores, serían:
    * 25
    * 100
    * 7,5
2. Obtener una lista con sólo los números de la expresión: en los ejemplos serian:
    * [2,3,5]
    * [5,5,3,1]
    * [7,8,5,3]
3. Obtener una lista con sólo los operadores de la expresión: en los ejemplos serían 
    * [+,*]
    * [+,^, -]
    * [+,/,-]
4. Imprimir fácilmente las expresiones, por ello quieren que poder obtener un String con la expresión propiamente dicha incluyendo los paréntesis: 
    * "((2+3)*5)"
    * "((5+5)^(3-1))"
    * "((7+8) / (5-3))"

🔼 [Volver a los enunciados](#enunciados)