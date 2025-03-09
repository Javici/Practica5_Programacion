package com.Clases;

import java.util.ArrayList;
import java.util.Date;
import com.Enum.*;

import java.util.Date;

public class Jugador extends Trabajador {

    private Posiciones Posicion;

    public Posiciones getPosicion() {
        return Posicion;
    }

    /**
     * Setter de la posicion, que son enums
     * 
     * @param Posicion
     */

    public void setposicion(Posiciones Posicion) {
        Posicion = this.Posicion;
    }

    private int Dorsal;

    public int getDorsal() {
        return Dorsal;
    }

    /**
     * Setter del dorsal del jugador
     * 
     * @param Dorsal
     */
    public void setDorsal(int Dorsal) {
        Dorsal = this.Dorsal;
    }

    private Traspasos Traspasos;

    public Traspasos getTraspasos() {
        return Traspasos;
    }

    /**
     * Setter del estado de los traspasos (enums)
     * 
     * @param Traspasos
     */

    public void setTraspasos(Traspasos Traspasos) {
        this.Traspasos = Traspasos;
    }

    public Jugador(String Nombre, Date FechaNacimiento, Posiciones Posicion, int Dorsal, String Pais,
            Equipo Equipo, TipoTrabajador TipoTrabajador) {
        super(Nombre, FechaNacimiento, Pais, Equipo, TipoTrabajador);
        this.Posicion = Posicion;
        if (Dorsal > 0) {
            this.Dorsal = Dorsal;
        } else {
            this.Dorsal = 0;
        }
        this.Traspasos = Traspasos.SIN_SOLICITAR;

    }

    public String toString() {

        return "Los datos del jugador son:\nNombre: " + this.Nombre + "\nEquipo: " + this.Equipo.getNombre()
                + "\nFecha y hora de nacimiento: "
                + this.FechaNacimiento
                + "\nNúmero de dorsal: " + this.Dorsal + "\nPosición: " + this.Posicion
                + "\nPaís de origen: " + this.Pais + "\nEstado de la solicitud de traspaso: " + this.Traspasos
                + "\n\n-----------------------------\n";

    }

    /**
     * Funcion para cambiar el estado de traspaso a solicitado
     */

    public void solicitarTraspaso(Jugador Jugador) {
        if (Traspasos == Traspasos.SIN_SOLICITAR) {
            this.Traspasos = Traspasos.SOLICITADO;
            System.out.println("Traspaso solicitado por el jugador " + Jugador.Nombre);
        } else {
            System.out.println("Error");
        }

    }

    // implementacion del metodo mostarInfo

    public void mostrarInfo() {
        System.out.println(Nombre.toString() + "\n" + TipoTrabajador.toString());
    }

}