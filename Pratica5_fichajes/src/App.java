import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Le resto 1 al mes porque estan guardados del 0 al 11 y es mas intuitivo asi
         */
        Jugador jude = new Jugador("Jude Sharp", FechaNacimiento(1999, (1 - 1), 13), Posiciones.Centrocampista, 9,
                "Macedonia",
                Traspasos.SIN_SOLICITAR);

        jude.check();
    }

    public static Date FechaNacimiento(int ano, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(ano, mes, dia);
        Date date = cal.getTime();
        return date;
    }

}
