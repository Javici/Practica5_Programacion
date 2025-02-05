import java.text.Normalizer.Form;

public class Presidente {
    private String dni;

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

    public void AprobarPorPresidente(Jugador Jugador) {
        if (Jugador.getTraspasos() == Traspasos.APROBADO_POR_ENTRENADOR && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El presidente aprueba el fichaje");
            Jugador.setTraspasos(Traspasos.APROBADO_POR_PRESIDENTE);
        }
    }

    public void RechazarPorPresidente(Jugador Jugador) {
        if (Jugador.getTraspasos() == Traspasos.APROBADO_POR_ENTRENADOR && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El presidente rechaza el fichaje");
            Jugador.setTraspasos(Traspasos.RECHAZADO_POR_PRESIDENTE);
        }
    }
}
