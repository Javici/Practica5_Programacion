import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class App {
        public static void main(String[] args) throws Exception {
                ArrayList<String> ListaJugadorEquipo1;
                ArrayList<String> ListaJugadorEquipo2;
                ArrayList<String> ListaJugadorEquipo3;

                ListaJugadorEquipo1 = new ArrayList<>();
                ListaJugadorEquipo2 = new ArrayList<>();
                ListaJugadorEquipo3 = new ArrayList<>();
                /**
                 * Le resto 1 al mes porque estan guardados del 0 al 11 y es mas intuitivo asi
                 */
                Equipo InazumaJapon = new Equipo("Inazuma Japon", "InzJPN");
                Equipo Raimon = new Equipo("Raimon", "RMN");
                Equipo LittleGiants = new Equipo("Little Giants", "LTG");

                Jugador Jugador1 = new Jugador("Mark Evans", FechaNacimiento(1999, (5 - 1), 7), Posiciones.Portero, 1,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, InazumaJapon);
                Jugador Jugador2 = new Jugador("Nathan Swift", FechaNacimiento(1999, (8 - 1), 20),
                                Posiciones.Defensa, 2,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, InazumaJapon);
                Jugador Jugador3 = new Jugador("Jack Wallside", FechaNacimiento(1999, (10 - 1), 21),
                                Posiciones.Defensa, 3,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, InazumaJapon);
                Jugador Jugador4 = new Jugador("Scott Banyan", FechaNacimiento(1999, (7 - 1), 15),
                                Posiciones.Defensa, 6,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, InazumaJapon);
                Jugador Jugador5 = new Jugador("Archer Hawkins", FechaNacimiento(1998, (11 - 1), 30),
                                Posiciones.Defensa,
                                7,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, InazumaJapon);
                Jugador Jugador6 = new Jugador("Caleb Stonewall", FechaNacimiento(1998, (8 - 1), 17),
                                Posiciones.Centrocampista, 8,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, Raimon);
                Jugador Jugador7 = new Jugador("Shawn Frost", FechaNacimiento(1999, (1 - 1), 7), Posiciones.Delantero,
                                9,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, Raimon);
                Jugador Jugador8 = new Jugador("Axel Blaze", FechaNacimiento(1998, (7 - 1), 10), Posiciones.Delantero,
                                10,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, Raimon);
                Jugador Jugador9 = new Jugador("Austin Hobbes", FechaNacimiento(2000, (9 - 1), 25),
                                Posiciones.Delantero,
                                11,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, Raimon);
                Jugador Jugador10 = new Jugador("Jude Sharp", FechaNacimiento(1999, (5 - 1), 11),
                                Posiciones.Centrocampista, 14,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, Raimon);
                Jugador Jugador11 = new Jugador("David Samford", FechaNacimiento(1999, (6 - 1), 17),
                                Posiciones.Centrocampista, 16,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, LittleGiants);
                Jugador Jugador12 = new Jugador("Kevin Dragonfly", FechaNacimiento(1998, (2 - 1), 26),
                                Posiciones.Delantero, 17,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, LittleGiants);
                Jugador Jugador13 = new Jugador("Xavier Foster", FechaNacimiento(1999, (1 - 1), 20),
                                Posiciones.Centrocampista, 18,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, LittleGiants);
                Jugador Jugador14 = new Jugador("Darren Lachance", FechaNacimiento(1999, (12 - 1), 13),
                                Posiciones.Portero,
                                20,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, LittleGiants);

                ListaJugadorEquipo1.add("Mark Evans");
                ListaJugadorEquipo1.add("Nathan Swift");
                ListaJugadorEquipo1.add("Jack Wallside");
                ListaJugadorEquipo1.add("Scott Banyan");
                ListaJugadorEquipo1.add("Archer Hawkins");

                ListaJugadorEquipo2.add("Caleb Stonewall");
                ListaJugadorEquipo2.add("Shawn Frost");
                ListaJugadorEquipo2.add("Axel Blaze");
                ListaJugadorEquipo2.add("Austin Hobbes");
                ListaJugadorEquipo2.add("Jude Sharp");

                ListaJugadorEquipo3.add("David Samford");
                ListaJugadorEquipo3.add("Kevin Dragonfly");
                ListaJugadorEquipo3.add("Xavier Foster");
                ListaJugadorEquipo3.add("Darren Lachance");

                // Ejercicio 4, toString con ejemplos mediante sout

                System.out.println("\n-----------------------------\n");

                // toString de datos de jugadores

                System.out.println(Jugador6.toString()); // todos los datos del jugador 6, por ejemplo
                System.out.println(Jugador3.getEquipo().getNombre() + "\n\n-----------------------------\n"); // consulta
                                                                                                              // del
                                                                                                              // equipo
                                                                                                              // del
                                                                                                              // jugador
                                                                                                              // 3

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
                Presidente Presidente1 = new Presidente("987654321Z", "Camelia Travis", InazumaJapon);
                Presidente Presidente2 = new Presidente("7539514862D", "Silvia Woods", Raimon);
                Presidente Presidente3 = new Presidente("123456789A", "Nelly Raimon", LittleGiants);
                System.out.println(Presidente1.toString());
                System.out.println(Presidente2.toString());
                System.out.println(Presidente3.toString());
                // toString de la lista de entrenadores
                Entrenador Entrenador1 = new Entrenador("Percival Travis", Formaciones._434, InazumaJapon);
                Entrenador Entrenador2 = new Entrenador("Seymour Hillman", Formaciones._352, Raimon);
                Entrenador Entrenador3 = new Entrenador("David Evans", Formaciones._4321, LittleGiants);
                System.out.println(Entrenador1.toString());
                System.out.println(Entrenador2.toString());
                System.out.println(Entrenador3.toString());

                // Ej5: modificar fichajes

                Jugador1.solicitarTraspaso();
                Entrenador1.aceptarTraspaso(Jugador1);
                Presidente1.rechazarTraspaso(Jugador1);
                if (Jugador1.Traspaso == APROBADO_POR_ENTRENADOR && Jugador1.Traspaso == APROBADO_POR_PRESIDENTE) {
                        System.out.println("Joya");
                }

        }

        public static Date FechaNacimiento(int ano, int mes, int dia) {
                Calendar cal = Calendar.getInstance();
                cal.set(ano, mes, dia);
                Date date = cal.getTime();
                return date;
        }
}
