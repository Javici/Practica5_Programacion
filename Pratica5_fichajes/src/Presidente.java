import java.text.Normalizer.Form;

public class Presidente {
    private String dni;

    public String getdni() {
        return dni;
    }

    public void setdni(String dni) {
        dni = this.dni;
    }

    private String nombrePresidente;

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        nombrePresidente = this.nombrePresidente;
    }

    private Equipo Equipo;

    public Equipo getEquipo() {
        return Equipo;
    }

    public void Equipo(Equipo Equipo) {
        Equipo = this.Equipo;
    }

    // constructor

    public Presidente(String dni, String nombrePresidente, Equipo Equipo) {
        this.dni = dni;
        this.nombrePresidente = nombrePresidente;
        this.Equipo = Equipo;
    }

}
