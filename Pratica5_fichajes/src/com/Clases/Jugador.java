package com.Clases;

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

    public Jugador(String NombreJugador, Date FechaNacimiento, Posiciones Posicion, int Dorsal, String PaisOrigen,
            Equipo Equipo, TipoTrabajador TipoTrabajador) {
        super(NombreJugador, FechaNacimiento, PaisOrigen, TipoTrabajador);
        this.Posicion = Posicion;
        if (Dorsal > 0) {
            this.Dorsal = Dorsal;
        } else {
            this.Dorsal = 0;
        }
        this.Traspasos = Traspasos.SIN_SOLICITAR;
        this.TipoTrabajador = TipoTrabajador;
        this.Equipo = Equipo;
        contadorJugador++;

    }

    public String toString() {

        return "Los datos del jugador son:\nNombre: " + this.NombreJugador + "\nEquipo: " + this.Equipo.getNombre()
                + "\nFecha y hora de nacimiento: "
                + this.Fecha_nacimiento
                + "\nNúmero de dorsal: " + this.Dorsal + "\nPosición: " + this.Posicion
                + "\nPaís de origen: " + this.PaisOrigen + "\nEstado de la solicitud de traspaso: " + this.Traspasos
                + "\n\n-----------------------------\n";

    }

    /**
     * Funcion para cambiar el estado de traspaso a solicitado
     */

    public void solicitarTraspaso(Jugador Jugador) {
        if (Traspasos == Traspasos.SIN_SOLICITAR) {
            this.Traspasos = Traspasos.SOLICITADO;
            System.out.println("Traspaso solicitado por el jugador " + Jugador.NombreJugador);
        } else {
            System.out.println("Error");
        }

    }

    // contador del numero de jugadores

    public static int getContadorJugador() {
        return contadorJugador;
    }
}