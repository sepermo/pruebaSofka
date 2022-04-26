/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 *
 * @author seper
 */
public class ClsHistorico {

    public ClsHistorico() {
    }
    
    public void guardar(int nuevalinea) throws FileNotFoundException, IOException {
        String texto="";
        // Abrimos el archivo
        FileInputStream fstream = new FileInputStream("historico.txt");
        // Creamos el objeto de entrada
        DataInputStream entrada = new DataInputStream(fstream);
        // Creamos el Buffer de Lectura
        BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
        String strLinea;
        // Leer el archivo linea por linea
        for (int i = 0; i < 10; i++) {
            if ((strLinea = buffer.readLine()) != null) {
               texto+=strLinea+"\r\n";
            }
        }
        // Cerramos el archivo
        entrada.close();
        
        
        
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
                Fescribe.write(texto+nuevalinea);  
                //Cierra el flujo de escritura  
                Fescribe.close();                     
                /*Borro el fichero inicial*/  
                ficheroAntiguo.delete();
                /*renombro el nuevo fichero con el nombre del  fichero inicial*/  
                FficheroNuevo.renameTo(new File("historico.txt"));    
        } catch (Exception ex) {  
            /*Captura un posible error y le imprime en pantalla*/   
             System.out.println(ex.getMessage());  
        }  
    }
}
