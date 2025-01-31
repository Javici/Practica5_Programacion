import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class App {
        public static void main(String[] args) throws Exception {
                ArrayList<String> ListaJugadorRaimon;
                ArrayList<String> ListaJugadorInazumaJapon;
                ArrayList<String> ListaJugadorLittleGiants;

                ListaJugadorRaimon = new ArrayList<>();
                ListaJugadorInazumaJapon = new ArrayList<>();
                ListaJugadorLittleGiants = new ArrayList<>();
                /**
                 * Le resto 1 al mes porque estan guardados del 0 al 11 y es mas intuitivo asi
                 */
                Equipo InazumaJapon = new Equipo("Inazuma Japon", "InzJPN");
                Equipo Raimon = new Equipo("Raimon", "RMN");
                Equipo LittleGiants = new Equipo("Little Giants", "LTG");

                Jugador MarkEvans = new Jugador("Mark Evans", FechaNacimiento(1999, (5 - 1), 7), Posiciones.Portero, 1,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, InazumaJapon);
                Jugador NathanSwift = new Jugador("Nathan Swift", FechaNacimiento(1999, (8 - 1), 20),
                                Posiciones.Defensa, 2,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, InazumaJapon);
                Jugador JackWallside = new Jugador("Jack Wallside", FechaNacimiento(1999, (10 - 1), 21),
                                Posiciones.Defensa, 3,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, InazumaJapon);
                Jugador ScottBanyan = new Jugador("Scott Banyan", FechaNacimiento(1999, (7 - 1), 15),
                                Posiciones.Defensa, 6,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, InazumaJapon);
                Jugador ArcherHawkins = new Jugador("Archer Hawkins", FechaNacimiento(1998, (11 - 1), 30),
                                Posiciones.Defensa,
                                7,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, InazumaJapon);
                Jugador CalebStonewall = new Jugador("Caleb Stonewall", FechaNacimiento(1998, (8 - 1), 17),
                                Posiciones.Centrocampista, 8,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, Raimon);
                Jugador ShawnFrost = new Jugador("Shawn Frost", FechaNacimiento(1999, (1 - 1), 7), Posiciones.Delantero,
                                9,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, Raimon);
                Jugador AxelBlaze = new Jugador("Axel Blaze", FechaNacimiento(1998, (7 - 1), 10), Posiciones.Delantero,
                                10,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, Raimon);
                Jugador AustinHobbes = new Jugador("Austin Hobbes", FechaNacimiento(2000, (9 - 1), 25),
                                Posiciones.Delantero,
                                11,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, Raimon);
                Jugador JudeSharp = new Jugador("Jude Sharp", FechaNacimiento(1999, (5 - 1), 11),
                                Posiciones.Centrocampista, 14,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, Raimon);
                Jugador DavidSamford = new Jugador("David Samford", FechaNacimiento(1999, (6 - 1), 17),
                                Posiciones.Centrocampista, 16,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, LittleGiants);
                Jugador KevinDragonfly = new Jugador("Kevin Dragonfly", FechaNacimiento(1998, (2 - 1), 26),
                                Posiciones.Delantero, 17,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, LittleGiants);
                Jugador XavierFoster = new Jugador("Xavier Foster", FechaNacimiento(1999, (1 - 1), 20),
                                Posiciones.Centrocampista, 18,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, LittleGiants);
                Jugador DarrenLachance = new Jugador("Darren Lachance", FechaNacimiento(1999, (12 - 1), 13),
                                Posiciones.Portero,
                                20,
                                "Japon",
                                Traspasos.SIN_SOLICITAR, LittleGiants);

                System.out.println(JudeSharp.toString());
                DarrenLachance.toString();
                System.out.println(MarkEvans.getEquipo().getNombre());

                ListaJugadorInazumaJapon.add("Mark Evans");
                ListaJugadorInazumaJapon.add("Nathan Swift");
                ListaJugadorInazumaJapon.add("Jack Wallside");
                ListaJugadorInazumaJapon.add("Scott Banyan");
                ListaJugadorInazumaJapon.add("Archer Hawkins");

                ListaJugadorRaimon.add("Caleb Stonewall");
                ListaJugadorRaimon.add("Shawn Frost");
                ListaJugadorRaimon.add("Axel Blaze");
                ListaJugadorRaimon.add("Austin Hobbes");
                ListaJugadorRaimon.add("Jude Sharp");

                ListaJugadorLittleGiants.add("David Samford");
                ListaJugadorLittleGiants.add("Kevin Dragonfly");
                ListaJugadorLittleGiants.add("Xavier Foster");
                ListaJugadorLittleGiants.add("Darren Lachance");

                // toString de la lista de jugadores
                ListaJugadorInazumaJapon.toString();
                ListaJugadorLittleGiants.toString();
                ListaJugadorRaimon.toString();
                System.out.println("La lista de jugadores del Inazuma Japón es: " + ListaJugadorInazumaJapon);
                System.out.println("La lista de jugadores del Raimon es: " + ListaJugadorRaimon);
                System.out.println("La lista de jugadores del Little Giants es: " + ListaJugadorLittleGiants);
                // toString de los datos de presidentes
                Presidente CameliaTravis = new Presidente("987654321Z", "Camelia Travis", InazumaJapon);
                Presidente SilviaWoods = new Presidente("7539514862D", "Silvia Woods", Raimon);
                Presidente NellyRaimon = new Presidente("123456789A", "Nelly Raimon", LittleGiants);
                System.out.println(CameliaTravis.toString());
                System.out.println(SilviaWoods.toString());
                System.out.println(NellyRaimon.toString());
                // toString de la lista de entrenadores
                Entrenador PercivalTravis = new Entrenador("Percival Travis", Formaciones._434, InazumaJapon);
                Entrenador SeymourHillman = new Entrenador("Seymour Hillman", Formaciones._352, Raimon);
                Entrenador DavidEvans = new Entrenador("David Evans", Formaciones._4321, LittleGiants);
                System.out.println(PercivalTravis.toString());
                System.out.println(SeymourHillman.toString());
                System.out.println(DavidEvans.toString());
        }

        public static Date FechaNacimiento(int ano, int mes, int dia) {
                Calendar cal = Calendar.getInstance();
                cal.set(ano, mes, dia);
                Date date = cal.getTime();
                return date;
        }

}
