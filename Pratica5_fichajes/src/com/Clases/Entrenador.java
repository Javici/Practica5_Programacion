package com.Clases;

import java.util.ArrayList;
import java.util.Date;
import com.Enum.*;
import com.Interfaces.GestorTraspasos;

public class Entrenador extends Trabajador implements GestorTraspasos {
    /**
     * Creamos los atributos de la clase entrenador
     * 
     * 
     * 
     * 
     * Setter del nombre del entrenador
     * 
     * @param Nombre
     * 
     * 
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
    }

    public String toString() {
        return "Los datos del entrenador son:\nNombre: " + this.Nombre + "\nFormación insiginia: "
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

    // implementacion del metodo mostarInfo

    public void mostrarInfo() {
        System.out.println(Nombre.toString() + "\n" + TipoTrabajador.toString());
    }

    public void apobarTraspaso(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2) {
        if (Jugador.getTraspasos() == Traspasos.SOLICITADO && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El entrenador aprueba el fichaje");
            Jugador.setTraspasos(Traspasos.APROBADO_POR_ENTRENADOR);
        } else {
            System.out.println("Este entrenador no puede decidir sobre el fichaje");
        }
    }

    public void rechazarTraspaso(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2) {
        if (Jugador.getTraspasos() == Traspasos.SOLICITADO && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El entrenador rechaza el fichaje\nEl fichaje queda cancelado");
            Jugador.setTraspasos(Traspasos.RECHAZADO_POR_ENTRENADOR);
        } else {
            System.out.println("Este entrenador no puede decidir sobre el fichaje\nEl fichaje queda cancelado");
        }
    }
}
