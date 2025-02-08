import java.text.Normalizer.Form;
import java.util.ArrayList;

public class Presidente {
    private String dni;
    private Traspasos Traspasos;

    public String getdni() {
        return dni;
    }

    public void setdni(String dni) {
        dni = this.dni;
    }

    private String nombrePresidente;

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        nombrePresidente = this.nombrePresidente;
    }

    private Equipo Equipo;

    public Equipo getEquipo() {
        return Equipo;
    }

    public void Equipo(Equipo Equipo) {
        Equipo = this.Equipo;
    }

    // constructor

    public Presidente(String dni, String nombrePresidente, Equipo Equipo) {
        this.dni = dni;
        this.nombrePresidente = nombrePresidente;
        this.Equipo = Equipo;
    }

    public String toString() {
        return "Los datos del presidente son:\nNombre: " + this.nombrePresidente + "\nDNI: "
                + this.dni
                + "\nEquipo: "
                + this.Equipo.getNombre() + "\n\n-----------------------------\n";
    }

    public void AprobarPorPresidente(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2) {
        if (Jugador.getTraspasos() == Traspasos.APROBADO_POR_ENTRENADOR && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El presidente aprueba el fichaje");
            Jugador.setTraspasos(Traspasos.APROBADO_POR_PRESIDENTE);
            lista1.remove(Jugador.getNombre());
            lista2.add(Jugador.getNombre());
            System.out.println("Las listas actualizadas de jugadores de los equipos 1 y 2 son:\n"
                    + lista1.toString() + "\n" + lista2.toString());
        } else {
            System.out.println("Este presidente no puede decidir sobre el fichaje\nEl fichaje queda cancelado");
        }
    }

    public void RechazarPorPresidente(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2) {
        if (Jugador.getTraspasos() == Traspasos.APROBADO_POR_ENTRENADOR && Jugador.getEquipo() == this.Equipo) {
            Jugador.setTraspasos(Traspasos.RECHAZADO_POR_PRESIDENTE);
            System.out.println("El presidente rechaza el fichaje\nEl fichaje queda cancelado");
        } else {
            System.out.println("Este presidente no puede decidir sobre el fichaje\nEl fichaje queda cancelado");
        }
    }
}
