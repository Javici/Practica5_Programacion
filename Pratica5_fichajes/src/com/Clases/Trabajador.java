package com.Clases;

import java.util.Date;

import com.Enum.TipoTrabajador;

public abstract class Trabajador {
    protected String Nombre;
    private static int contador = 0;

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
        contador++;

    }

    // declaracion del metodo mismaNacionalidad

    public boolean mismaNacionalidad(Trabajador Trabajador) {
        return this.Pais.equals(Trabajador.Pais);

    }

    // declaracion del metodo mostrarInfo

    public abstract void mostrarInfo();

    // declaracion del metodo contador

    public static int getContador() {
        return contador;
    }

}
