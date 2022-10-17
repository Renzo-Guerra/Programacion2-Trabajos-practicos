package TP_7A.consigna5;

import TP_7A.consigna5.condicion.condicionalesLogicos.*;
import TP_7A.consigna5.condicion.condicionesEspecificas.*;
import TP_7A.consigna5.condicion.condicionesEspecificas.ConDirectorIdentico;
import TP_7A.consigna5.condicion.condicionesEspecificas.anioEstreno.*;
import TP_7A.consigna5.condicion.condicionesEspecificas.duracion.*;
import TP_7A.consigna5.condicion.condicionesEspecificas.titulo.*;

public class Main {
  public static void main(String[] args) {
    // Instanciacion de peliculas
    Pelicula pelicula1 = new Pelicula("Batman: el caballero de la noche asciende", "Ocho años después de asumir la culpa por la muerte de Harvey Dent y desaparecer en la noche, Batman se ve obligado a salir del exilio autoimpuesto gracias a una ladrona astuta y a un terrorista despiadado.", "Christopher Nolan", 2012, 165, 13);
    pelicula1.agregarGenero("accion");
    pelicula1.agregarGenero("policial");
    pelicula1.agregarGenero("drama");
    pelicula1.agregarGenero("thriller");
    pelicula1.agregarActor("actor1");
    pelicula1.agregarActor("actor7");
    pelicula1.agregarActor("actor3");
    pelicula1.agregarActor("actor9");
    pelicula1.agregarActor("actor10");
    
    Pelicula pelicula2 = new Pelicula("Blonde", "Una mirada al ascenso a la fama y la épica desaparición de la actriz Marilyn Monroe, una de las estrellas más grandes del mundo.", "Andrew Dominik", 2022, 166, 16);
    pelicula2.agregarGenero("drama");
    pelicula2.agregarActor("actor1");
    pelicula2.agregarActor("actor4");
    pelicula2.agregarActor("actor2");
    pelicula2.agregarActor("actor8");
    
    Pelicula pelicula3 = new Pelicula("El Camino", "Tras un dramático escape de su cautiverio, Jesse Pinkman debe lidiar con su pasado para pensar en un futuro.", "Vince Gilligan", 2019, 122, 16);
    pelicula3.agregarGenero("drama");
    pelicula3.agregarGenero("crimen");
    pelicula3.agregarActor("actor4");
    pelicula3.agregarActor("actor2");
    pelicula3.agregarActor("actor5");
    pelicula3.agregarActor("actor6");
    
    Pelicula pelicula4 = new Pelicula("1917", "Durante la Primera Guerra Mundial, dos jóvenes soldados británicos reciben una orden, aparentemente, imposible de ejecutar: en una carrera contra el reloj, deben infiltrarse en territorio enemigo para entregar un mensaje que podría salvar a miles de compañeros.", "Sam Mendes", 2019, 119, 13);
    pelicula4.agregarGenero("guerra");
    pelicula4.agregarGenero("drama");
    pelicula4.agregarGenero("historia");
    pelicula4.agregarGenero("accion");
    pelicula4.agregarGenero("ficcion");
    pelicula4.agregarActor("actor2");
    pelicula4.agregarActor("actor3");
    pelicula4.agregarActor("actor7");
    pelicula4.agregarActor("actor11");
    
    Pelicula pelicula5 = new Pelicula("Nosotros", "Adelaide y su esposo viajan a la casa en la que ella creció junto a la playa. Tiene un presentimiento siniestro que precede a un encuentro espeluznante: cuatro enmascarados se presentan ante su casa. Lo aterrador viene cuando muestran sus rostros.", "Jordan Peele", 2019, 121, 16);
    pelicula5.agregarGenero("thriller");
    pelicula5.agregarGenero("terror");
    pelicula5.agregarActor("actor2");
    pelicula5.agregarActor("actor3");
    pelicula5.agregarActor("actor1");
    pelicula5.agregarActor("actor6");
    
    Pelicula pelicula6 = new Pelicula("Psicópata americano", "En la década de 1980, Patrick Bateman es un hombre exitoso y obsesionado por la competencia y por la perfección material, quien utiliza los más caros cosméticos masculinos, equipos de gimnasia, solárium y demás maquinaria estética para lograr un cuerpo atlético y bien acicalado, identificador material del éxito social.", "Mary Harron", 2000, 102, 16);
    pelicula6.agregarGenero("thriller");
    pelicula6.agregarGenero("comedia");
    pelicula6.agregarGenero("drama");
    pelicula6.agregarGenero("policial");
    pelicula6.agregarActor("actor1");
    pelicula6.agregarActor("actor2");
    pelicula6.agregarActor("actor3");
    pelicula6.agregarActor("actor4");
    
    Pelicula pelicula7 = new Pelicula("La teoría del todo", "Durante los años sesenta, el estudiante de la Universidad de Cambridge y futuro físico Stephen Hawking se enamora de su compañera Jane Wilde. A pesar de que le diagnostican una enfermedad devastadora, él y Jane abren nuevos caminos científicos.", "James Marsh", 2015, 123, 10);
    pelicula7.agregarGenero("drama");
    pelicula7.agregarGenero("romantico");
    pelicula7.agregarActor("actor4");
    pelicula7.agregarActor("actor3");
    pelicula7.agregarActor("actor7");
    pelicula7.agregarActor("actor9");

    // La condicion especificada fue la de: "Películas cuya duración sea menor a 120 minutos, que no sean del género 'comedia'"
    Plataforma plataforma = new Plataforma(new CondicionNot(
                                            new CondicionOr(
                                              new CondicionOr(
                                                new CDuracionIgualA(120), 
                                                new CDuracionMayorA(120)), 
                                              new ConTieneGenero("comedia")
                                            )
                                          ));
    // Agregando las peliculas a la plataforma
    plataforma.agregarPelicula(pelicula1);
    plataforma.agregarPelicula(pelicula2);
    plataforma.agregarPelicula(pelicula3);
    plataforma.agregarPelicula(pelicula4);
    plataforma.agregarPelicula(pelicula5);
    plataforma.agregarPelicula(pelicula6);
    plataforma.agregarPelicula(pelicula7);

    /**
     * Verificando si una pelicula va a ser rentable (o no) 
     * [Esto se puede ejecutar sin siquiera haber agregado previamente la pelicula a la plataforma]
     * [Lo ideal calculo que seria que al agregar una pelicula, internamente verifique si es rentable o no,
     * y que en caso de que no lo sea NO la agregue]
     */
    System.out.println("La pelicula '" + pelicula1.getTitulo() + "' será rentable: " + plataforma.laPeliculaSeraRentable(pelicula1));
    // Tira false porque la pelicula NO dura menos que 120 minutos
    System.out.println("");

    /* ⚡TESTING⚡ */
    System.out.println("Buscar todas las películas que en el título contenga la palabra 'de': ");
    System.out.println(plataforma.getPeliculasWhere(new ConTituloContiene("de")));
    System.out.println("");
    System.out.println("Buscar todas las películas que contengan el genero 'comedia': ");
    System.out.println(plataforma.getPeliculasWhere(new ConTieneGenero("comedia")));
    System.out.println("");
    System.out.println("Buscar todas las películas en las que haya actuado 'actor1' y cuyo director NO haya sido 'Andrew Dominik': ");
    System.out.println(plataforma.getPeliculasWhere(new CondicionAnd(
                                                      new ConTieneActor("actor1"), 
                                                      new CondicionNot(
                                                        new ConDirectorIdentico("Andrew Dominik"))
                                                    )));
    System.out.println("");
    System.out.println("Buscar todas las películas que se hayan grabado antes del 2015 y cuya duración sea menor a 120 minutos: ");
    System.out.println(plataforma.getPeliculasWhere(new CondicionNot(
                                  new CondicionAnd(
                                    new CondicionOr(
                                      new CAnioMayorA(2015), 
                                      new CAnioIgualA(2015)),
                                    new CondicionOr(
                                      new CDuracionMayorA(120),
                                      new CDuracionIgualA(120))
                                  )
                                )));
    System.out.println("");
    System.out.println("Todas las peliculas: ");
    System.out.println(plataforma.getAllPeliculas());
    System.out.println("");
    System.out.println("Cambiandole la rentabilidad a la condicion de que la pelicula dura mas de 120 minutos: ");
    plataforma.setRentabilidad(new CDuracionMayorA(120));
    System.out.println("La pelicula '" + pelicula1.getTitulo() + "' será rentable: " + plataforma.laPeliculaSeraRentable(pelicula1));
    // Ahora si tira true, ya que la condicion de rentabilidad cambió, y la pelicula dura mas de 120 minutos
    System.out.println("");
  }
}
