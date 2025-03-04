package com.Clases;

import java.util.Date;
import com.Enum.*;

public class Entrenador extends Trabajador {
    /**
     * Creamos los atributos de la clase entrenador
     * 
     * private static int contadorEntrenador = 0;
     * private String nombreEntrenador;
     * 
     * public String getNombreEntrenador() {
     * return nombreEntrenador;
     * }
     * 
     * 
     * Setter del nombre del entrenador
     * 
     * @param nombreEntrenador
     * 
     *                         public void setNombreEntrenador(String
     *                         nombreEntrenador) {
     *                         nombreEntrenador = this.nombreEntrenador;
     *                         }
     */
    private Formaciones Formaciones;

    public Formaciones getFormaciones() {
        return Formaciones;
    }

    /**
     * Setter de la formacion del entrenador
     * 
     * @param Formaciones
     */
    public void setFormaciones(Formaciones Formaciones) {
        Formaciones = this.Formaciones;
    }

    public Entrenador(String nombreEntrenador, Date FechaNacimiento, String PaisOrigen,
            Formaciones Formaciones, Equipo Equipo, TipoTrabajador TipoTrabajador) {
        super(nombreEntrenador, FechaNacimiento, PaisOrigen, Equipo, TipoTrabajador);
        this.Formaciones = Formaciones;
        this.TipoTrabajador = TipoTrabajador;
        contadorEntrenador++;
    }

    public String toString() {
        return "Los datos del entrenador son:\nNombre: " + this.nombreEntrenador + "\nFormación insiginia: "
                + this.Formaciones
                + "\nEquipo: "
                + this.Equipo.getNombre() + "\n\n-----------------------------\n";
    }

    /**
     * Funciones para aprobar o rechazar el traspaso de un jugador que lo haya
     * solicitado
     */

    public void AprobarPorEntrenador(Jugador Jugador) {
        if (Jugador.getTraspasos() == Traspasos.SOLICITADO && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El entrenador aprueba el fichaje");
            Jugador.setTraspasos(Traspasos.APROBADO_POR_ENTRENADOR);
        } else {
            System.out.println("Este entrenador no puede decidir sobre el fichaje");
        }
    }

    public void RechazarPorEntrenador(Jugador Jugador) {
        if (Jugador.getTraspasos() == Traspasos.SOLICITADO && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El entrenador rechaza el fichaje\nEl fichaje queda cancelado");
            Jugador.setTraspasos(Traspasos.RECHAZADO_POR_ENTRENADOR);
        } else {
            System.out.println("Este entrenador no puede decidir sobre el fichaje\nEl fichaje queda cancelado");
        }
    }

    // contador del numero de entrenadores

    public static int getContadorEntrenador() {
        return contadorEntrenador;
    }
}
