package com.Clases;

import com.Enum.*;

public class Entrenador {
    /**
     * Creamos los atributos de la clase entrenador
     */
    private static int contadorEntrenador = 0;
    private String nombreEntrenador;

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    /**
     * Setter del nombre del entrenador
     * 
     * @param nombreEntrenador
     */
    public void setNombreEntrenador(String nombreEntrenador) {
        nombreEntrenador = this.nombreEntrenador;
    }

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

    private Equipo Equipo;

    public Equipo getEquipo() {
        return Equipo;
    }

    /**
     * Setter del equipo del entrenador
     * 
     * @param Equipo
     */
    public void setEquipo(Equipo Equipo) {
        Equipo = this.Equipo;
    }

    /**
     * Constructor del entrenador
     * 
     * @param nombreEntrenador
     * @param Formaciones
     * @param Equipo
     */

    public Entrenador(String nombreEntrenador, Formaciones Formaciones, Equipo Equipo) {
        this.nombreEntrenador = nombreEntrenador;
        this.Formaciones = Formaciones;
        this.Equipo = Equipo;
        contadorEntrenador++;
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

    public static int getContadorEntrenador() {
        return contadorEntrenador;
    }
}
