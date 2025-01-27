import java.text.Normalizer.Form;

public class Entrenador {
    private String nombreEntrenador;

    public String getNombreEntrenador(){
        return nombreEntrenador;
    }
    public void setNombreEntrenador(String nombreEntrenador){
        nombreEntrenador=this.nombreEntrenador;
    }

    private Formaciones Formaciones;

    public Formaciones getFormaciones(){
        return Formaciones;
    }

    public void setFormaciones(Formaciones Formaciones){
        Formaciones=this.Formaciones;
    }
 //a ver si detecta esto
}
