package com.Clases;

import com.Enum.*;
import java.util.ArrayList;

public class Equipo {
    /**
     * Declaracion de los atributos de la clase equipo
     */
    private static int contadorEquipo = 0;
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    /**
     * Setter del nombre del equipo
     * 
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
     * @param Nombre
     * @param Abreviatura
     */
    public Equipo(String Nombre, String Abreviatura) {
        this.Nombre = Nombre;
        this.Abreviatura = Abreviatura;
        contadorEquipo++;

    }

    public static int getContadorEquipo() {
        return contadorEquipo;
    }

}
