/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

/**
 *
 * @author seper
 */
public class ClsPregunta {
    private String pregunta;
    private ClsOpcion opcionA,opcionB,opcionC,opcionD;
    private ClsOpcion opciones[]=new ClsOpcion[4];

    public ClsPregunta(String pregunta, ClsOpcion opcionA, ClsOpcion opcionB, ClsOpcion opcionC, ClsOpcion opcionD) {
        this.pregunta = pregunta;
        this.opcionA = opcionA;
        this.opcionB = opcionB;
        this.opcionC = opcionC;
        this.opcionD = opcionD;
        opciones[0]=opcionA;
        opciones[1]=opcionB;
        opciones[2]=opcionC;
        opciones[3]=opcionD;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public ClsOpcion getOpcionA() {
        return opcionA;
    }

    public void setOpcionA(ClsOpcion opcionA) {
        this.opcionA = opcionA;
    }

    public ClsOpcion getOpcionB() {
        return opcionB;
    }

    public void setOpcionB(ClsOpcion opcionB) {
        this.opcionB = opcionB;
    }

    public ClsOpcion getOpcionC() {
        return opcionC;
    }

    public void setOpcionC(ClsOpcion opcionC) {
        this.opcionC = opcionC;
    }

    public ClsOpcion getOpcionD() {
        return opcionD;
    }

    public void setOpcionD(ClsOpcion opcionD) {
        this.opcionD = opcionD;
    }

    public ClsOpcion[] getOpciones() {
        return opciones;
    }

    public void setOpciones(ClsOpcion[] opciones) {
        this.opciones = opciones;
    }

    void mostrarOpciones() {
        System.out.println("1. "+opcionA.getTexto());
        System.out.println("2. "+opcionB.getTexto());
        System.out.println("3. "+opcionC.getTexto());
        System.out.println("4. "+opcionD.getTexto());
    }
    
    
}
