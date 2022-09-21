## Trabajo Práctico Nº 4 – 2022

_Para cada una de los siguientes problemas **identificar los objetos que intervienen, su estado y su comportamiento**. Implementar en Java_

## Enunciados:
  1. [Alarma](#alarma)
  1. [Alarma Sensorial](#alarma-sensorial)
  1. [Sueldos](#sueldos)
  1. [Selección de fútbol](#selección-de-fútbol)
  1. [Avícola](#avícola)
  1. [Registro Empresa](#registro-empresa)

### Alarma
Implementar en Java todo el código necesario para el funcionamiento de una alarma. La alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana, se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal sonora.

Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora, encienda una luz cuando alguno de los indicadores está activado.

**Consejo**: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el método encender().

🔼 [Volver a los enunciados](#enunciados)

### Alarma Sensorial
Modificar el ejercicio anterior de manera tal que las variables que utiliza la alarma se cambien por sensores que poseen un comportamiento y pueden sondear diferentes partes de la casa. Cada sensor posee el nombre de la zona que controla. Permitir que se incorporen nuevos sensores. Modificar la alarma para que además de hacer sonar el timbre, imprima por pantalla el nombre de la zona en conflicto (pueden ser más de una). 

🔼 [Volver a los enunciados](#enunciados)

### Sueldos
Una empresa de informática posee tres tipos de empleados. Los empleados contratados reciben un salario fijo semanal, sin importar la cantidad de horas trabajadas. Los empleados por horas extras reciben un monto fijo semanal más un monto extra por cada hora trabajada. Finalmente, los empleados por comisión reciben un sueldo fijo, más un porcentaje por la cantidad de ventas realizadas. Implementar un sistema que permita saber cuánto se le debe pagar un empleado al finalizar la semana.

🔼 [Volver a los enunciados](#enunciados)

###  Selección de fútbol
El contingente de la selección de fútbol de un país está formado tanto por futbolistas como por un cuerpo técnico. Cada integrante del contingente posee un nombre, apellido, número de pasaporte y fecha de nacimiento. Los futbolistas, además, poseen una posición, si es zurdo o derecho y la cantidad de goles convertidos. Los entrenadores poseen un identificador de la federación a la que pertenecen y los masajistas el título que poseen y la cantidad de  de experiencia.

El sistema debe permitir conocer el estado de una persona. El estado puede ser "Viajando", "En concentración", "En país de origen". Se debe poder saber si una persona está disponible o no para un evento solidario para recaudar fondos. Una persona estará disponible si está en el país de origen y no está concentrando para un partido.

**Consejo**: Una misma persona no comparte dos roles distintos, por ejemplo un técnico no puede ser futbolista, ni masajista.

🔼 [Volver a los enunciados](#enunciados)

###  Avícola
Una empresa encargada de la comercialización de productos avícolas trabaja con tres tipos de productos: productos frescos (huevos de gallina blancos y de color, huevos de codorniz, etc), productos refrigerados (pollos frescos, milanesas de pollo, de cerdo y de ternera, pollo arrollado, chorizos de cerdo, etc) y productos congelados (hamburguesas, papas fritas, arvejas, granos de maíz, formas de pollo rebozadas, etc.). 

Todos los productos llevan esta **información común**: 
* fecha de vencimiento.
* número de lote. 

A su vez, cada tipo de producto lleva alguna **información específica**. 
* Los productos frescos deben llevar la fecha de envasado y la granja de origen. 
* Los productos refrigerados deben llevar el código del organismo de supervisión alimentaria, la fecha de envasado, la temperatura de mantenimiento recomendada y la granja de origen. 
* Los productos congelados deben llevar la fecha de envasado, el código del organismo de supervisión alimentaria, la granja de origen y la temperatura de mantenimiento recomendada.

Hay tres tipos de productos congelados: congelados por aire, congelados por agua y congelados por nitrógeno. 
* Los productos congelados por aire deben llevar la información de la composición del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido de carbono y % de vapor de agua). 
* Los productos congelados por agua deben llevar la información de la salinidad del agua con que se realizó la congelación en gramos de sal por litro de agua. 
* Los productos congelados por nitrógeno deben llevar la información del método de congelación empleado y del tiempo de exposición al nitrógeno expresada en segundos. 

Implementar los métodos necesarios para obtener cada uno de los atributos de un producto. Implementar un método que permita obtener la etiqueta de un producto (un String con la combinación de los atributos).

🔼 [Volver a los enunciados](#enunciados)

###  Registro Empresa
Implementar en java el sistema de registro de una empresa. Este sistema de registro permite exportar un String con el listado de todas las personas asociadas a la empresa. 

NOTA: \n permite un salto de linea sin romper la String (Se pueden agregar espacios antes o despues de "\n"), ej: "esto esta arriba\nesto esta abajo

En el String [en cada línea (usar "\n" para concatenar los Strings)] se muestra: 
* el cargo de la persona. 
* su nombre. 
* apellido.
* edad. 

En el sistema existen distintos tipos de roles: 
* el **empleado**, del cual, además del nombre, apellido y edad, se guarda el número de legajo y su sueldo; 
* el **usuario final**, del cual se guarda el nombre, apellido, edad, nombre de usuario y password; 
* el **jerárquico**, del cual se registra su nombre, apellido, edad, número de legajo, sueldo y una lista de empleados a cargo.

🔼 [Volver a los enunciados](#enunciados)