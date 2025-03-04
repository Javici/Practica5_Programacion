package com.Clases;

import com.Enum.*;
import java.util.ArrayList;

public class Equipo {
    /**
     * Declaracion de los atributos de la clase equipo
     */
    private static int contadorEquipo = 0;
    private String NombreEquipo;

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    /**
     * Setter del nombre del equipo
     * 
     * @param NombreEquipo
     */
    public void setNombre(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }

    private String Abreviatura;

    public String getAbreviatura() {
        return Abreviatura;
    }

    /**
     * Setter de la abreviatura del equipo
     * 
     * @param Abreviatura
     */
    public void setAbreviatura(String Abreviatura) {
        Abreviatura = this.Abreviatura;
    }

    private Entrenador entrenador;

    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * Setter del entrenador del equipo
     * 
     * @param entrenador
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    private Presidente presidente;

    public Presidente getPresidente() {
        return presidente;
    }

    /**
     * Setter del presidente del equipo
     * 
     * @param presidente
     */
    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    /**
     * Constructor del equipo
     * 
     * @param NombreEquipo
     * @param Abreviatura
     */
    public Equipo(String NombreEquipo, String Abreviatura) {
        this.NombreEquipo = NombreEquipo;
        this.Abreviatura = Abreviatura;
        contadorEquipo++;

    }

    // contador del numero de equipos

    public static int getContadorEquipo() {
        return contadorEquipo;
    }

}
