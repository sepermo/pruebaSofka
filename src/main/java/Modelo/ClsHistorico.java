/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 *
 * @author seper
 */
public class ClsHistorico {

    public ClsHistorico() {
    }
    
    public void guardar(int nuevalinea) {
        File ficheroAntiguo = new File("historico.txt");
        /*Obtengo un numero aleatorio*/  
        Random numaleatorio= new Random(3816L);   
        /*Creo un nombre para el nuevo fichero apartir del 
         *numero aleatorio*/  
        String nombreFicheroNuevo="auxiliar"+String.valueOf(Math.abs(numaleatorio.nextInt()))+".txt";  
        /*Crea un objeto File para el fichero nuevo*/  
        File FficheroNuevo=new File(nombreFicheroNuevo);  
        try {   
                BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FficheroNuevo,true), "utf-8"));  
                /*Escribe en el fichero la cadena que recibe la función.  
                 *el string "\r\n" significa salto de linea*/  
                Fescribe.write(nuevalinea + "\r\n");  
                //Cierra el flujo de escritura  
                Fescribe.close();                     
                /*Obtengo el nombre del fichero inicial*/  
                File nombreAntiguo=new File(" "+ficheroAntiguo.getName()); 
                /*Borro el fichero inicial*/  
                ficheroAntiguo.delete();
                /*renombro el nuevo fichero con el nombre del  fichero inicial*/  
                FficheroNuevo.renameTo(nombreAntiguo);    
        } catch (Exception ex) {  
            /*Captura un posible error y le imprime en pantalla*/   
             System.out.println(ex.getMessage());  
        }  
    }
}
