import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Le resto 1 al mes porque estan guardados del 0 al 11 y es mas intuitivo asi
         */
        Equipo InazumaJapon = new Equipo("Inazuma Japon", "InzJPN", );
        Equipo Raimon = new Equipo("Raimon", "RMN");
        Equipo LittleGiants = new Equipo("Little Giants", "LTG");
       
         Jugador MarkEvans = new Jugador("Mark Evans", FechaNacimiento(1999, (5 - 1), 7), Posiciones.Portero, 1,
                "Japon",
                Traspasos.SIN_SOLICITAR, InazumaJapon);
        Jugador NathanSwift = new Jugador("Nathan Swift", FechaNacimiento(1999, (8 - 1), 20), Posiciones.Defensa, 2,
                "Japon",
                Traspasos.SIN_SOLICITAR, InazumaJapon);
        Jugador JackWallside = new Jugador("Jack Wallside", FechaNacimiento(1999, (10 - 1), 21), Posiciones.Defensa, 3,
                "Japon",
                Traspasos.SIN_SOLICITAR, InazumaJapon);
        Jugador ScottBanyan = new Jugador("Scott Banyan", FechaNacimiento(1999, (7 - 1), 15), Posiciones.Defensa, 6,
                "Japon",
                Traspasos.SIN_SOLICITAR, InazumaJapon);
        Jugador ArcherHawkins = new Jugador("Archer Hawkins", FechaNacimiento(1998, (11 - 1), 30), Posiciones.Defensa,
                7,
                "Japon",
                Traspasos.SIN_SOLICITAR, InazumaJapon);
        Jugador CalebStonewall = new Jugador("Caleb Stonewall", FechaNacimiento(1998, (8 - 1), 17),
                Posiciones.Centrocampista, 8,
                "Japon",
                Traspasos.SIN_SOLICITAR, Raimon);
        Jugador ShawnFrost = new Jugador("Shawn Frost", FechaNacimiento(1999, (1 - 1), 7), Posiciones.Delantero, 9,
                "Japon",
                Traspasos.SIN_SOLICITAR, Raimon);
        Jugador AxelBlaze = new Jugador("Axel Blaze", FechaNacimiento(1998, (7 - 1), 10), Posiciones.Delantero, 10,
                "Japon",
                Traspasos.SIN_SOLICITAR, Raimon);
        Jugador AustinHobbes = new Jugador("Austin Hobbes", FechaNacimiento(2000, (9 - 1), 25), Posiciones.Delantero,
                11,
                "Japon",
                Traspasos.SIN_SOLICITAR, Raimon);
        Jugador JudeSharp = new Jugador("Jude Sharp", FechaNacimiento(1999, (5 - 1), 11), Posiciones.Centrocampista, 14,
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
        Jugador DarrenLachance = new Jugador("Darren Lachance", FechaNacimiento(1999, (12 - 1), 13), Posiciones.Portero,
                20,
                "Japon",
                Traspasos.SIN_SOLICITAR, LittleGiants);

        JudeSharp.check();
        DarrenLachance.check();
        System.out.println(AxelBlaze);
        
        
        Raimon.mostrar();
        
    }

    public static Date FechaNacimiento(int ano, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(ano, mes, dia);
        Date date = cal.getTime();
        return date;
    }

}
