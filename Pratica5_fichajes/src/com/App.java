package com;

import com.Clases.*;
import com.Enum.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * Esta es la practica 5 del grupo 1
 * 
 * @version 1.0
 * @author Javier Lujan y Javier Uya
 */

public class App {
        public static void main(String[] args) throws Exception {
                ArrayList<String> ListaJugadorEquipo1;
                ArrayList<String> ListaJugadorEquipo2;
                ArrayList<String> ListaJugadorEquipo3;

                ListaJugadorEquipo1 = new ArrayList<>();
                ListaJugadorEquipo2 = new ArrayList<>();
                ListaJugadorEquipo3 = new ArrayList<>();

                Equipo InazumaJapon = new Equipo("Inazuma Japon", "InzJPN");
                Equipo Raimon = new Equipo("Raimon", "RMN");
                Equipo LittleGiants = new Equipo("Little Giants", "LTG");

                /**
                 * Declaramos los jugadores con todos sus atributos
                 * Le resto 1 al mes porque estan guardados del 0 al 11 y es mas intuitivo asi
                 */

                Jugador Jugador1 = new Jugador("Mark Evans", FechaNacimiento(1999, (5 - 1), 7), Posiciones.Portero, 1,
                                "Japon",
                                InazumaJapon, TipoTrabajador.Jugador);
                Jugador Jugador2 = new Jugador("Nathan Swift", FechaNacimiento(1999, (8 - 1), 20),
                                Posiciones.Defensa, 2,
                                "Japon",
                                InazumaJapon, TipoTrabajador.Jugador);
                Jugador Jugador3 = new Jugador("Jack Wallside", FechaNacimiento(1999, (10 - 1), 21),
                                Posiciones.Defensa, 3,
                                "Japon",
                                InazumaJapon, TipoTrabajador.Jugador);
                Jugador Jugador4 = new Jugador("Scott Banyan", FechaNacimiento(1999, (7 - 1), 15),
                                Posiciones.Defensa, 6,
                                "Japon",
                                InazumaJapon, TipoTrabajador.Jugador);
                Jugador Jugador5 = new Jugador("Archer Hawkins", FechaNacimiento(1998, (11 - 1), 30),
                                Posiciones.Defensa,
                                7,
                                "Japon",
                                InazumaJapon, TipoTrabajador.Jugador);
                Jugador Jugador6 = new Jugador("Caleb Stonewall", FechaNacimiento(1998, (8 - 1), 17),
                                Posiciones.Centrocampista, 8,
                                "Japon",
                                Raimon, TipoTrabajador.Jugador);
                Jugador Jugador7 = new Jugador("Shawn Frost", FechaNacimiento(1999, (1 - 1), 7), Posiciones.Delantero,
                                9,
                                "Japon",
                                Raimon, TipoTrabajador.Jugador);
                Jugador Jugador8 = new Jugador("Axel Blaze", FechaNacimiento(1998, (7 - 1), 10), Posiciones.Delantero,
                                10,
                                "Japon",
                                Raimon, TipoTrabajador.Jugador);
                Jugador Jugador9 = new Jugador("Austin Hobbes", FechaNacimiento(2000, (9 - 1), 25),
                                Posiciones.Delantero,
                                11,
                                "Japon",
                                Raimon, TipoTrabajador.Jugador);
                Jugador Jugador10 = new Jugador("Jude Sharp", FechaNacimiento(1999, (5 - 1), 11),
                                Posiciones.Centrocampista, 14,
                                "Japon",
                                Raimon, TipoTrabajador.Jugador);
                Jugador Jugador11 = new Jugador("David Samford", FechaNacimiento(1999, (6 - 1), 17),
                                Posiciones.Centrocampista, 16,
                                "Japon",
                                LittleGiants, TipoTrabajador.Jugador);
                Jugador Jugador12 = new Jugador("Kevin Dragonfly", FechaNacimiento(1998, (2 - 1), 26),
                                Posiciones.Delantero, 17,
                                "Japon",
                                LittleGiants, TipoTrabajador.Jugador);
                Jugador Jugador13 = new Jugador("Xavier Foster", FechaNacimiento(1999, (1 - 1), 20),
                                Posiciones.Centrocampista, 18,
                                "Japon",
                                LittleGiants, TipoTrabajador.Jugador);
                Jugador Jugador14 = new Jugador("Darren Lachance", FechaNacimiento(1999, (12 - 1), 13),
                                Posiciones.Portero,
                                20,
                                "Japon",
                                LittleGiants, TipoTrabajador.Jugador);

                ListaJugadorEquipo1.add(Jugador1.getNombre());
                ListaJugadorEquipo1.add(Jugador2.getNombre());
                ListaJugadorEquipo1.add(Jugador3.getNombre());
                ListaJugadorEquipo1.add(Jugador4.getNombre());
                ListaJugadorEquipo1.add(Jugador5.getNombre());

                ListaJugadorEquipo2.add(Jugador6.getNombre());
                ListaJugadorEquipo2.add(Jugador7.getNombre());
                ListaJugadorEquipo2.add(Jugador8.getNombre());
                ListaJugadorEquipo2.add(Jugador9.getNombre());
                ListaJugadorEquipo2.add(Jugador10.getNombre());

                ListaJugadorEquipo3.add(Jugador11.getNombre());
                ListaJugadorEquipo3.add(Jugador12.getNombre());
                ListaJugadorEquipo3.add(Jugador13.getNombre());
                ListaJugadorEquipo3.add(Jugador14.getNombre());

                // Ejercicio 4, toString con ejemplos mediante sout

                System.out.println("\n-----------------------------\n");

                // toString de datos de jugadores
                /*
                 * System.out.println(Jugador6.toString()); // todos los datos del jugador 6,
                 * por ejemplo
                 * System.out.println(Jugador3.getEquipo().getNombreEquipo() +
                 * "\n\n-----------------------------\n"); // consulta
                 * // del
                 * // equipo
                 * // del
                 * // jugador
                 * // 3
                 */
                // toString de la lista de jugadores
                ListaJugadorEquipo1.toString();
                ListaJugadorEquipo3.toString();
                ListaJugadorEquipo2.toString();
                System.out.println("La lista de jugadores del Inazuma Japón es: " + ListaJugadorEquipo1
                                + "\n\n-----------------------------\n");
                System.out.println("La lista de jugadores del Raimon es: " + ListaJugadorEquipo2
                                + "\n\n-----------------------------\n");
                System.out.println("La lista de jugadores del Little Giants es: " + ListaJugadorEquipo3
                                + "\n\n-----------------------------\n");
                // toString de los datos de presidentes
                Presidente Presidente1 = new Presidente("987654321Z", FechaNacimiento(1999, (5 - 1), 7), "Japon",
                                "Camelia Travis", InazumaJapon,
                                TipoTrabajador.Presidente);
                Presidente Presidente2 = new Presidente("7539514862D", FechaNacimiento(1999, (5 - 1), 7), "Japon",
                                "Silvia Woods", Raimon,
                                TipoTrabajador.Presidente);
                Presidente Presidente3 = new Presidente("123456789A", FechaNacimiento(1999, (5 - 1), 7), "Japon",
                                "Nelly Raimon", LittleGiants,
                                TipoTrabajador.Presidente);
                System.out.println(Presidente1.toString());
                System.out.println(Presidente2.toString());
                System.out.println(Presidente3.toString());
                // toString de la lista de entrenadores
                Entrenador Entrenador1 = new Entrenador("Percival Travis", FechaNacimiento(1999, (5 - 1), 7),
                                "Japon", Formaciones._434, InazumaJapon,
                                TipoTrabajador.Entrenador);
                Entrenador Entrenador2 = new Entrenador("Seymour Hillman", FechaNacimiento(1999, (5 - 1), 7),
                                "Japon", Formaciones._352, Raimon,
                                TipoTrabajador.Entrenador);
                Entrenador Entrenador3 = new Entrenador("David Evans", FechaNacimiento(1999, (5 - 1), 7),
                                "Japon", Formaciones._4321, LittleGiants,
                                TipoTrabajador.Entrenador);
                System.out.println(Entrenador1.toString());
                System.out.println(Entrenador2.toString());
                System.out.println(Entrenador3.toString());

        }

        public static Date FechaNacimiento(int ano, int mes, int dia) {
                Calendar cal = Calendar.getInstance();
                cal.set(ano, mes, dia);
                Date date = cal.getTime();
                return date;
        }
}
