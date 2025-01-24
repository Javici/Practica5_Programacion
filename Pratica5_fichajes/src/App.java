import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Calendar cal = Calendar.getInstance();
        cal.set(1996, 10, 18);
        Date date = cal.getTime();
        System.out.println(date);

        Jugador jude = new Jugador("Jude Sharp", date, Posiciones.Centrocampista, 9, "Macedonia",
                Traspasos.SIN_SOLICITAR);

        jude.check();
    }

}
