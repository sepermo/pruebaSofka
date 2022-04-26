/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.*;
/**
 *
 * @author seper
 */
public class ClsNivel {
    private ClsPregunta pregunta1, pregunta2, pregunta3, pregunta4, pregunta5;
    private int numeroNivel;

    public ClsNivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
    }

    public ClsPregunta getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(ClsPregunta pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public ClsPregunta getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(ClsPregunta pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public ClsPregunta getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(ClsPregunta pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public ClsPregunta getPregunta4() {
        return pregunta4;
    }

    public void setPregunta4(ClsPregunta pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public ClsPregunta getPregunta5() {
        return pregunta5;
    }

    public void setPregunta5(ClsPregunta pregunta5) {
        this.pregunta5 = pregunta5;
    }

    public int getNumeroNivel() {
        return numeroNivel;
    }

    public void setNumeroNivel(int numeroNivel) {
        this.numeroNivel = numeroNivel;
    }

    public boolean Preguntar() {
        int aleatorio=(int) (Math.random() * (4+1));
        ClsPregunta pregunta=null;
        switch (aleatorio) {
            case 1:
                pregunta=pregunta1;
                break;
            case 2:
                pregunta=pregunta2;
                break;
           case 3:
                pregunta=pregunta3;
                break;
            case 4:
                pregunta=pregunta4;
                break;
           case 5:
                pregunta=pregunta5;
                break;
        }
        System.out.println("Ronda "+this.numeroNivel);
        System.out.println(pregunta.getPregunta());
        pregunta.mostrarOpciones();
        int opc;
        Scanner leer = new Scanner (System.in);
        opc = leer.nextInt();
        
        return (pregunta.getOpciones()[opc-1].isCorrecto());
    }
    
    
    
}
