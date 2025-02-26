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

    protected Date Fecha_nacimiento;

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    protected String Pais;

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    protected String Equipo;

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String Equipo) {
        this.Equipo = Equipo;
    }

    protected String Tipo;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void mismaNacionalidad(String Trabajador1, String Trabajador2) {
        if (Pais.equals(Pais)) {
            System.out.println("Mismo pais");

        } else {
            System.out.println("Distinto pais");
        }

    }

    public abstract String mostrarInfo(String Nombre, String Tipo);

}
