import java.util.ArrayList;

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

    
    private Entrenador entrenador;

    public Entrenador getEntrenador(){
        return entrenador;
    }

    public void setEntrenador (Entrenador entrenador){
        this.entrenador = entrenador;
    }

    private Presidente presidente;

    public Presidente getPresidente(){
        return presidente;
    }

    public void setPresidente (Presidente presidente){
        this.presidente = presidente;
    }


    private ArrayList <Jugador> ListaJugador;
    public ArrayList <Jugador> getListaJugador(){
        return ListaJugador;
    }

    public void setListaJugador(ArrayList <Jugador> ListaJugador){
        this.ListaJugador = ListaJugador;
    }

    
    public void CheckArray(){
    ListaJugador.forEach(System.out::println);
    }

    public Equipo(String Nombre, String Abreviatura) {
        this.Nombre = Nombre;
        this.Abreviatura = Abreviatura;
        }

}
