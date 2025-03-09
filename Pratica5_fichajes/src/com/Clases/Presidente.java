package com.Clases;

import java.util.Date;
import com.Enum.*;
import com.Interfaces.GestorTraspasos;

import java.util.ArrayList;

public class Presidente extends Trabajador implements GestorTraspasos {
    /**
     * Creamos los atributos de la clase presidente
     * 
     */
    private String dni;
    private Traspasos Traspasos;

    public String getdni() {
        return dni;
    }

    /**
     * Setter del dni del presidente
     * 
     * @param dni
     */
    public void setdni(String dni) {
        dni = this.dni;
    }

    /**
     * Constructor del presidente
     * 
     * @param dni
     * @param Nombre
     * @param Equipo
     */

    public Presidente(String dni, String Nombre, Date FechaNacimiento, String Pais,
            Equipo Equipo, TipoTrabajador TipoTrabajador) {
        super(Nombre, FechaNacimiento, Pais, Equipo, TipoTrabajador);
        this.dni = dni;
    }

    public String toString() {
        return "Los datos del presidente son:\nNombre: " + this.Nombre + "\nDNI: "
                + this.dni
                + "\nEquipo: "
                + this.Equipo.getNombre() + "\n\n-----------------------------\n";
    }

    /**
     * Funciones para aprobar o rechazar el traspaso de un jugador despues de que lo
     * haya aprobado el entrenador
     */

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

    // implementacion del metodo mostarInfo

    public void mostrarInfo() {
        System.out.println(Nombre.toString() + "\n" + TipoTrabajador.toString());
    }

    public void apobarTraspaso(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2) {
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

    public void rechazarTraspaso(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2) {
        if (Jugador.getTraspasos() == Traspasos.APROBADO_POR_ENTRENADOR && Jugador.getEquipo() == this.Equipo) {
            Jugador.setTraspasos(Traspasos.RECHAZADO_POR_PRESIDENTE);
            System.out.println("El presidente rechaza el fichaje\nEl fichaje queda cancelado");
        } else {
            System.out.println("Este presidente no puede decidir sobre el fichaje\nEl fichaje queda cancelado");
        }
    }
}
