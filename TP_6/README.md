## Trabajo Práctico Nº 6 – 2022 - Abstracciones

_Para cada una de los siguientes problemas **identificar los objetos que intervienen, su estado y su comportamiento**. Implementar en Java_

## Enunciados:
  1. [Sistema de Alquiler](#sistema-de-alquiler)
  1. [Centro de Cómputos](#centro-de-cómputos)
  1. [Puerto de Cereales](#puerto-de-cereales)
  1. [Abstracción](#abstracción)
  

###  Sistema de Alquiler
Para evitar convertirse en un nuevo Blockbuster, un videoclub de barrio ha decidido diversificarse e incorporar a su cartera de negocios el alquiler de autos. Para modernizarse, abandonará los registros en papel e implementará un sistema unificado de alquiler. 

El sistema: 
* Debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada 
* Debe llevar control de los ítems alquilados a cada cliente. 

Las películas poseen:
* Información filmográfica 
* Cantidad de copias que se dispone de la misma. 

Una película puede ser alquilada si hay copias aún disponibles.

De los vehículos, se registra: 
* Marca
* Kilometraje 
* Patente. 

Los vehículos pueden ser eléctricos, nafteros o diesel. Ademas, sólo pueden ser alquilados a un cliente por vez.

Por ultimo, se debe proveer la funcionalidad necesaria para permitir conocer quiénes son los clientes que poseen alquileres vencidos.

🔼 [Volver a los enunciados](#enunciados)

### Centro de Cómputos
Un centro de cómputos se encarga de ejecutar **procesos** utilizando algunas de las **computadoras** que dispone. 

Si no hay computadoras disponibles los procesos a ejecutar deben esperar en una **cola de espera** que los ordena teniendo en cuenta sus requerimientos de memoria (los procesos con mayor requerimiento de memoria serán atendidos en primer lugar). 

Las computadoras disponibles para ejecutar procesos se ordenan en una cola que prioriza la selección de las computadoras más rápidas.

🔼 [Volver a los enunciados](#enunciados)

### Puerto de Cereales
Un puerto debe coordinar las actividades de carga de los barcos con cereal traído por camiones desde el campo. 

Sólo se puede cargar un barco a la vez. 

Los barcos que esperan ser cargados se ubican en una cola de espera que los ordena teniendo en cuenta su capacidad (los barcos con mayor capacidad serán atendidos en primer lugar). 

Sólo se puede descargar un camión a la vez. Los camiones que esperan ser descargados se ubican en una cola de espera que los ordena teniendo en cuenta la fecha en que fueron cargados (los camiones que fueron cargados primero serán atendidos en primer lugar).

🔼 [Volver a los enunciados](#enunciados)

###  Abstracción
Abstraer el comportamiento en común de los ejercicios 2 y 3 e implementar la solución.

Implementar como quedaron las dos versiones.

🔼 [Volver a los enunciados](#enunciados)