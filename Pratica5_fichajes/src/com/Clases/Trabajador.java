package com.Clases;

import java.util.Date;

public abstract class Trabajador {
    protected String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    protected Date FechaNacimiento;

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    protected String Pais;

    public String getPais() {
        return Pais;
    }

    public void setPais(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    protected String Equipo;

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    protected String TipoTrabajador;

    public String getTipoTrabajador() {
        return TipoTrabajador;
    }

    public void setTipoTrabajador(String TipoTrabajador) {
        this.TipoTrabajador = TipoTrabajador;
    }

    /*
     * public void mismaNacionalidad(String Trabajador1, String Trabajador2) {
     * if (PaisOrigen.equals(PaisOrigen)) {
     * System.out.println("Mismo pais");
     * 
     * } else {
     * System.out.println("Distinto pais");
     * }
     * 
     * }
     * 
     * public abstract String mostrarInfo(String Nombre, String Tipo);
     */
}
