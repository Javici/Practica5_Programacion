package com.Clases;

import java.util.Date;

import com.Enum.TipoTrabajador;

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

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    protected Equipo Equipo;

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }

    protected TipoTrabajador TipoTrabajador;

    public TipoTrabajador getTipoTrabajador() {
        return TipoTrabajador;
    }

    public void setTipoTrabajador(TipoTrabajador TipoTrabajador) {
        this.TipoTrabajador = TipoTrabajador;
    }

    public Trabajador(String Nombre, Date FechaNacimiento, String Pais, Equipo Equipo, TipoTrabajador TipoTrabajador) {
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Equipo = Equipo;
        this.Pais = Pais;
        this.TipoTrabajador = TipoTrabajador;
    }

    /*
     * public void mismaNacionalidad(String Trabajador1, String Trabajador2) {
     * if (Pais.equals(Pais)) {
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
