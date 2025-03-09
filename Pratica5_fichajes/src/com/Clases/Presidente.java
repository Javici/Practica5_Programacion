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
     * Constructor de la clase Presidente
     * 
     * @param dni
     * @param Nombre
     * @param FechaNacimiento
     * @param Pais
     * @param Equipo
     * @param TipoTrabajador
     */

    public Presidente(String dni, String Nombre, Date FechaNacimiento, String Pais,
            Equipo Equipo, TipoTrabajador TipoTrabajador) {
        super(Nombre, FechaNacimiento, Pais, Equipo, TipoTrabajador);
        this.dni = dni;
    }

    /**
     * Metodo toString de la clase Presidente
     */

    public String toString() {
        return "Los datos del presidente son:\nNombre: " + this.Nombre + "\nDNI: "
                + this.dni
                + "\nEquipo: "
                + this.Equipo.getNombre() + "\n\n-----------------------------\n";
    }

    // implementacion del metodo mostarInfo

    public void mostrarInfo() {
        System.out
                .println(
                        Nombre.toString() + " es " + TipoTrabajador.toString() + "\n\n-----------------------------\n");
    }

    /**
     * Metodo de aprobar y rechazar traspasos por el presidente con la interfaz
     */

    public void apobarTraspaso(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2) {
        if (Jugador.getTraspasos() == Traspasos.APROBADO_POR_ENTRENADOR && Jugador.getEquipo() == this.Equipo) {
            System.out.println("El presidente " + Nombre + " aprueba el fichaje de " + Jugador.Nombre
                    + "\n\n-----------------------------\n");
            Jugador.setTraspasos(Traspasos.APROBADO_POR_PRESIDENTE);
            lista1.remove(Jugador.getNombre());
            lista2.add(Jugador.getNombre());
            System.out.println("Las listas actualizadas de jugadores de los equipos 1 y 2 son:\n"
                    + lista1.toString() + "\n" + lista2.toString() + "\n\n-----------------------------\n");
        } else {
            System.out.println("Este presidente " + Nombre + " no puede decidir sobre el fichaje de " + Jugador.Nombre
                    + "\nEl fichaje queda cancelado\n\n-----------------------------\n");
        }
    }

    public void rechazarTraspaso(Jugador Jugador, ArrayList<String> lista1, ArrayList<String> lista2) {
        if (Jugador.getTraspasos() == Traspasos.APROBADO_POR_ENTRENADOR && Jugador.getEquipo() == this.Equipo) {
            Jugador.setTraspasos(Traspasos.RECHAZADO_POR_PRESIDENTE);
            System.out.println("El presidente " + Nombre + " rechaza el fichaje de " + Jugador.Nombre
                    + "\nEl fichaje queda cancelado\n\n-----------------------------\n");
        } else {
            System.out.println("Este presidente " + Nombre + " no puede decidir sobre el fichaje de " + Jugador.Nombre
                    + "\nEl fichaje queda cancelado\n\n-----------------------------\n");
        }
    }
}
