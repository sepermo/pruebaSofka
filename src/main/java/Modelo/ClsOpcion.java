package Modelo;

public class ClsOpcion {

    private String texto;
    private boolean correcto;

    public ClsOpcion(String texto, boolean correcto) {
        this.texto = texto;
        this.correcto = correcto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCorrecto() {
        return correcto;
    }

    public void setCorrecto(boolean correcto) {
        this.correcto = correcto;
    }
   
}
