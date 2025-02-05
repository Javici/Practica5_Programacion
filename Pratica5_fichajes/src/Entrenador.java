import java.text.Normalizer.Form;

public class Entrenador {
    private String nombreEntrenador;

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        nombreEntrenador = this.nombreEntrenador;
    }

    private Formaciones Formaciones;

    public Formaciones getFormaciones() {
        return Formaciones;
    }

    public void setFormaciones(Formaciones Formaciones) {
        Formaciones = this.Formaciones;
    }

    private Equipo Equipo;

    public Equipo getEquipo() {
        return Equipo;
    }

    public void Equipo(Equipo Equipo) {
        Equipo = this.Equipo;
    }

    // constructor

    public Entrenador(String nombreEntrenador, Formaciones Formaciones, Equipo Equipo) {
        this.nombreEntrenador = nombreEntrenador;
        this.Formaciones = Formaciones;
        this.Equipo = Equipo;
    }

    public String toString() {
        return "Los datos del entrenador son:\nNombre: " + this.nombreEntrenador + "\nFormación insiginia: "
                + this.Formaciones
                + "\nEquipo: "
                + this.Equipo.getNombre() + "\n\n-----------------------------\n";
    }

    public void AprobarPorEntrenador(Jugador Jugador) {
        if (Jugador.getTraspasos() == Traspasos.SOLICITADO && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El entrenador aprueba el fichaje");
            Jugador.setTraspasos(Traspasos.APROBADO_POR_ENTRENADOR);
        }
    }

    public void RechazarPorEntrenador(Jugador Jugador) {
        if (Jugador.getTraspasos() == Traspasos.SOLICITADO && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El entrenador rechaza el fichaje");
            Jugador.setTraspasos(Traspasos.RECHAZADO_POR_ENTRENADOR);
        }
    }

}
