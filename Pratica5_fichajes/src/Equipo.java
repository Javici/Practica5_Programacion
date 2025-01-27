public class Equipo {

    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        Nombre = this.Nombre;
    }

    private String Abreviatura;

    public String getAbreviatura() {
        return Abreviatura;
    }

    public void setAbreviatura(String Abreviatura) {
        Abreviatura = this.Abreviatura;
    }

    public Equipo(String Nombre, String Abreviatura) {
        this.Nombre = Nombre;
        this.Abreviatura = Abreviatura;
    }
}
