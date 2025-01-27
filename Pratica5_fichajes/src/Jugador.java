
import java.util.Date;

public class Jugador {
    /**
     * Creamos los atributos de la clase jugadores
     * 
     * @param nombre
     * @param fecha_nacimiento
     * @param posicion
     * @param dorsal
     */

    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        Nombre = this.Nombre;
    }

    private Date Fecha_nacimiento;

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        Fecha_nacimiento = this.Fecha_nacimiento;
    }

    private Posiciones Posicion;

    public Posiciones getPosicion() {
        return Posicion;
    }

    public void setposicion(Posiciones Posicion) {
        Posicion = this.Posicion;
    }

    private int Dorsal;

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int Dorsal) {
        Dorsal = this.Dorsal;
    }

    private String Pais_origen;

    public String getPais_origen() {
        return Pais_origen;
    }

    public void setpais_origen(String Pais_origen) {
        Pais_origen = this.Pais_origen;
    }

    private Traspasos Traspasos;

    public Traspasos getTraspasos() {
        return Traspasos;
    }

    public void setTraspasos(Traspasos Traspasos) {
        Traspasos = this.Traspasos;
    }

    /**
     * Aqui tenemos el constructor
     */

<<<<<<< HEAD:Pratica5_fichajes/src/Jugador.java
    public Jugador(String Nombre, Date Fecha_nacimiento, Posiciones Posicion, int Dorsal, String Pais_origen,
            Traspasos Traspasos) {
=======

    public Jugador(String Nombre, Date Fecha_nacimiento, Posiciones Posicion, int Dorsal, String Pais_origen,
            Traspasos Traspasos) {

>>>>>>> 76b6cce69686fcff65c5c246a03c3e78326c9249:Pratica5_fichajes/src/jugador.java
        this.Nombre = Nombre;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.Posicion = Posicion;
        if (Dorsal > 0) {
            this.Dorsal = Dorsal;
        } else {
            this.Dorsal = 0;
        }
        this.Pais_origen = Pais_origen;
        this.Traspasos = Traspasos;

    }

    public void check() {
<<<<<<< HEAD:Pratica5_fichajes/src/Jugador.java
        System.out.println(
                Nombre + " " + Fecha_nacimiento + " " + Dorsal + " " + Posicion + " " + Pais_origen + " " + Traspasos);
=======

        System.out.println(
                Nombre + " " + Fecha_nacimiento + " " + Dorsal + " " + Posicion + " " + Pais_origen + " " + Traspasos);

>>>>>>> 76b6cce69686fcff65c5c246a03c3e78326c9249:Pratica5_fichajes/src/jugador.java
    }

}