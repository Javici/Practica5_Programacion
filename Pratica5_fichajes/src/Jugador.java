
import java.util.Date;

public class Jugador {
    /**
     * Creamos los atributos de la clase jugadores
     * 
     */

    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    /**
     * Setter del Nombre del jugador 
     * @param Nombre
     */

    public void setNombre(String Nombre) {
        Nombre = this.Nombre;
    }

    private Date Fecha_nacimiento;

    public Date getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    /**
     * Setter de laFecha de nacimiento
     * @param Fecha_nacimiento
     */
    public void setFecha_nacimiento(Date Fecha_nacimiento) {
        Fecha_nacimiento = this.Fecha_nacimiento;
    }

    private Posiciones Posicion;

    public Posiciones getPosicion() {
        return Posicion;
    }

    /**
     * Setter de la posicion, que son enums
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
     * @param Dorsal
     */
    public void setDorsal(int Dorsal) {
        Dorsal = this.Dorsal;
    }

    private String Pais_origen;

    public String getPais_origen() {
        return Pais_origen;
    }

    /**
     * Setter del pais de origen 
     * @param Pais_origen
     */

    public void setpais_origen(String Pais_origen) {
        Pais_origen = this.Pais_origen;
    }

    private Traspasos Traspasos;

    public Traspasos getTraspasos() {
        return Traspasos;
    }

    /**
     * Setter del estado de los traspasos (enums)
     * @param Traspasos
     */

    public void setTraspasos(Traspasos Traspasos) {
        Traspasos = this.Traspasos;
    }

    /**
     * Aqui tenemos el constructor
     */

    public Jugador(String Nombre, Date Fecha_nacimiento, Posiciones Posicion, int Dorsal, String Pais_origen,
            Traspasos Traspasos) {
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
     System.out.println(
                Nombre + " " + Fecha_nacimiento + " " + Dorsal + " " + Posicion + " " + Pais_origen + " " + Traspasos);
    }

}