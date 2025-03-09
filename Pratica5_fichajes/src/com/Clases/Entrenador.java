package com.Clases;

import java.util.ArrayList;
import java.util.Date;
import com.Enum.*;
import com.Interfaces.GestorTraspasos;

public class Entrenador extends Trabajador implements GestorTraspasos {
    /**
     * Creamos los atributos de la clase entrenador
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

    /**
     * Construcutor de la clase entrenador
     * 
     * @param nombreEntrenador
     * @param FechaNacimiento
     * @param PaisOrigen
     * @param Formaciones
     * @param Equipo
     * @param TipoTrabajador
     */

    public Entrenador(String nombreEntrenador, Date FechaNacimiento, String PaisOrigen,
            Formaciones Formaciones, Equipo Equipo, TipoTrabajador TipoTrabajador) {
        super(nombreEntrenador, FechaNacimiento, PaisOrigen, Equipo, TipoTrabajador);
        this.Formaciones = Formaciones;
    }

    /**
     * Metodo toString de la clase entrenador
     */

    public String toString() {
        return "Los datos del entrenador son:\nNombre: " + this.Nombre + "\nFormación insiginia: "
                + this.Formaciones
                + "\nEquipo: "
                + this.Equipo.getNombre() + "\n\n-----------------------------\n";
    }

    // implementacion del metodo mostarInfo

    public void mostrarInfo() {
        System.out.println(Nombre.toString() + " es " + TipoTrabajador.toString());
    }

    /**
     * Metodo para aprobar y rechazar traspasos por el entrenador con la interfaz
     */

    public void apobarTraspaso(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2) {
        if (Jugador.getTraspasos() == Traspasos.SOLICITADO && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El entrenador " + Nombre + " aprueba el fichaje de " + Jugador.Nombre);
            Jugador.setTraspasos(Traspasos.APROBADO_POR_ENTRENADOR);
        } else {
            System.out.println("Este entrenador " + Nombre + " no puede decidir sobre el fichaje de " + Jugador.Nombre);
        }
    }

    public void rechazarTraspaso(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2) {
        if (Jugador.getTraspasos() == Traspasos.SOLICITADO && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El entrenador " + Nombre + " rechaza el fichaje de " + Jugador.Nombre
                    + "\nEl fichaje queda cancelado");
            Jugador.setTraspasos(Traspasos.RECHAZADO_POR_ENTRENADOR);
        } else {
            System.out.println("Este entrenador " + Nombre + " no puede decidir sobre el fichaje de " + Jugador.Nombre
                    + "\nEl fichaje queda cancelado");
        }
    }
}
