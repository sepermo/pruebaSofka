package main;

import Modelo.ClsHistorico;
import Modelo.ClsNivel;
import Modelo.ClsOpcion;
import Modelo.ClsPregunta;
import java.io.FileNotFoundException;
//import Vistas.ResponderPreguntas;
import java.util.*;

public class principal {

    public static void main(String[] args) throws FileNotFoundException {
        /*ResponderPreguntas panelPreguntas=new ResponderPreguntas();
        panelPreguntas.setVisible(true);*/
     
        //Se crean los niveles
//---------------------------------empieza nivel 1------------------------------------
        Scanner leer = new Scanner(System.in);
        ClsNivel[] niveles=new ClsNivel[5];
        ClsNivel nivel1,nivel2,nivel3,nivel4,nivel5;
        ClsPregunta pregunta;
        ClsOpcion opcionA,opcionB,opcionC, opcionD;
        
        nivel1=new ClsNivel(1);
        
        opcionA=new ClsOpcion("murcielago", true);
        opcionB=new ClsOpcion("alcon", false);
        opcionC=new ClsOpcion("caballo", false);
        opcionD=new ClsOpcion("pez volador", false);
        pregunta=new ClsPregunta(
                "¿cual es el unico mamifero que puede volar?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel1.setPregunta1(pregunta);
        
        opcionA=new ClsOpcion("dos meses", false);
        opcionB=new ClsOpcion("9 meses", false);
        opcionC=new ClsOpcion("entre un año y medio y dos años", true);
        opcionD=new ClsOpcion("5 años", false);
        pregunta=new ClsPregunta(
                "¿cuanto dura el embarazo de un elefante hembra?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        ); 
        nivel1.setPregunta2(pregunta);
        
        opcionA=new ClsOpcion("oso", false);        
        opcionB=new ClsOpcion("medusa", false);
        opcionC=new ClsOpcion("el pulpo", false);
        opcionD=new ClsOpcion("la lombriz de tierra", true);
   
        pregunta=new ClsPregunta(
                "¿que animal tiene mas de 10 corazones?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );  
        nivel1.setPregunta3(pregunta);
        
        opcionA=new ClsOpcion("la ballena azul", true);        
        opcionB=new ClsOpcion("e cachalote", false);
        opcionC=new ClsOpcion("la jirafa", false);
        opcionD=new ClsOpcion("el elefante", false);
   
        pregunta=new ClsPregunta(
                "¿cual es el animal mas grande de la tierra?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel1.setPregunta4(pregunta);
        
        opcionA=new ClsOpcion("4", false);       
        opcionB=new ClsOpcion("8", true);
        opcionC=new ClsOpcion("20", false);
        opcionD=new ClsOpcion("2", false);
   
        pregunta=new ClsPregunta(
                "¿cuantas patas tiene una araña?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        ); 
        nivel1.setPregunta5(pregunta);   
        
        niveles[0]=nivel1;
    
        //---------------------------------empieza nivel 2------------------------------------
        nivel2=new ClsNivel(2);
        
        opcionA=new ClsOpcion("16", true);
        opcionB=new ClsOpcion("15", false);
        opcionC=new ClsOpcion("1", false);
        opcionD=new ClsOpcion("13", false);
        pregunta=new ClsPregunta(
                "¿cuanto es (3+5)x2?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel2.setPregunta1(pregunta);
        
        opcionA=new ClsOpcion("15", false);
        opcionB=new ClsOpcion("19", false);
        opcionC=new ClsOpcion("10", true);
        opcionD=new ClsOpcion("5", false);
        pregunta=new ClsPregunta(
                "¿cual es la mitad de 20?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel2.setPregunta2(pregunta);
        
        opcionA=new ClsOpcion("1", false);        
        opcionB=new ClsOpcion("2", true);
        opcionC=new ClsOpcion("4", false);
        opcionD=new ClsOpcion("8", false);
        pregunta=new ClsPregunta(
                "¿cual es la raiz cuadrada de 4?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel2.setPregunta3(pregunta);
        
        opcionA=new ClsOpcion("5", false);        
        opcionB=new ClsOpcion("10", false);
        opcionC=new ClsOpcion("15", false);
        opcionD=new ClsOpcion("4", true);
        pregunta=new ClsPregunta(
                "¿cuanto es 20/5?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel2.setPregunta4(pregunta);
        
        opcionA=new ClsOpcion("9", true);       
        opcionB=new ClsOpcion("6", false);
        opcionC=new ClsOpcion("12", false);
        opcionD=new ClsOpcion("3", false);
        pregunta=new ClsPregunta(
                "¿cuanto es el triple de 3?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel2.setPregunta5(pregunta);  
        
        niveles[1]=nivel2;
        
         //--------------------------------empieza nivel 3-------------------------------
        nivel3=new ClsNivel(3);
        
        opcionA=new ClsOpcion("lila ", true);
        opcionB=new ClsOpcion("negro", false);
        opcionC=new ClsOpcion("amarillo", false);
        opcionD=new ClsOpcion("verde", false);
        pregunta=new ClsPregunta(
                "¿que color se forma al mezclar rojo y azul?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel3.setPregunta1(pregunta);
             
        opcionA=new ClsOpcion("verde", true);
        opcionB=new ClsOpcion("lila", false);
        opcionC=new ClsOpcion("naranja", false);
        opcionD=new ClsOpcion("cafe", false);
        pregunta=new ClsPregunta(
                "¿que color se forma al mezclar amarillo y azul?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel3.setPregunta2(pregunta);
        
        opcionA=new ClsOpcion("verde", false);        
        opcionB=new ClsOpcion("amarillo", false);
        opcionC=new ClsOpcion("rojo", false);
        opcionD=new ClsOpcion("naranja", true);
        pregunta=new ClsPregunta(
                "¿que color se forma al mezclar amarillo y rojo?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );  
        nivel3.setPregunta3(pregunta);
        
        opcionA=new ClsOpcion("azul", false);        
        opcionB=new ClsOpcion("verde", false);
        opcionC=new ClsOpcion("cafe", true);
        opcionD=new ClsOpcion("naranja", false);
        pregunta=new ClsPregunta(
                "¿que color se forma al mezclar verde y rojo?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );    
        nivel3.setPregunta4(pregunta);
        
        opcionA=new ClsOpcion("rojo", false);       
        opcionB=new ClsOpcion("amarillo", false);
        opcionC=new ClsOpcion("verde", true);
        opcionD=new ClsOpcion("azul", false);
        pregunta=new ClsPregunta(
                "¿cual de los siguientes colores no es un color primario?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel3.setPregunta5(pregunta);   
        
        niveles[2]=nivel3;
        
         //-----------------------------empieza nivel 4-------------------------------------
        nivel4=new ClsNivel(4);
        
        opcionA=new ClsOpcion("15", false);
        opcionB=new ClsOpcion("90", false);
        opcionC=new ClsOpcion("60", true);
        opcionD=new ClsOpcion("30", false);
        pregunta=new ClsPregunta(
                "¿Cuántos minutos tiene una hora?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel4.setPregunta1(pregunta);
        
        opcionA=new ClsOpcion("365", true);
        opcionB=new ClsOpcion("300", false);
        opcionC=new ClsOpcion("265", false);
        opcionD=new ClsOpcion("370", false);
        pregunta=new ClsPregunta(
                "¿cuantos dias tiene un año?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel4.setPregunta2(pregunta);
        
        opcionA=new ClsOpcion("20", false);        
        opcionB=new ClsOpcion("48", false);
        opcionC=new ClsOpcion("24", true);
        opcionD=new ClsOpcion("12", false);
        pregunta=new ClsPregunta(
                "¿cuantas horas tiene un dia?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );   
        nivel4.setPregunta3(pregunta);
        
        opcionA=new ClsOpcion("60", true);        
        opcionB=new ClsOpcion("30", false);
        opcionC=new ClsOpcion("25", false);
        opcionD=new ClsOpcion("90", false);
        pregunta=new ClsPregunta(
                "¿cuantos segundos tiene un minuto?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel4.setPregunta4(pregunta);
        
        opcionA=new ClsOpcion("12", true);       
        opcionB=new ClsOpcion("20", false);
        opcionC=new ClsOpcion("10", false);
        opcionD=new ClsOpcion("6", false);
        pregunta=new ClsPregunta(
                "¿cuantos meses tiene un año?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );   
        nivel4.setPregunta5(pregunta); 
        
        niveles[3]=nivel4;
        
         //----------------------empieza nivel 5------------------------------
        nivel5=new ClsNivel(5);
        
        opcionA=new ClsOpcion("la tierra", true);
        opcionB=new ClsOpcion("marte", false);
        opcionC=new ClsOpcion("jupiter", false);
        opcionD=new ClsOpcion("saturno", false);
        pregunta=new ClsPregunta(
                "¿en que planeta nos encontramos?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel5.setPregunta1(pregunta);
        
        opcionA=new ClsOpcion("jupiter", true);
        opcionB=new ClsOpcion("saturno", false);
        opcionC=new ClsOpcion("marte", false);
        opcionD=new ClsOpcion("urano", false);
        pregunta=new ClsPregunta(
                "¿cual es el planeta mas grande del sistema solar?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );   
        nivel5.setPregunta2(pregunta);
        
        opcionA=new ClsOpcion("la tierra", false);        
        opcionB=new ClsOpcion("marte", false);
        opcionC=new ClsOpcion("saturno", true);
        opcionD=new ClsOpcion("la luna", false);
        pregunta=new ClsPregunta(
                "¿que planeta tiene anillos a su alrededor?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );
        nivel5.setPregunta3(pregunta);
        
        opcionA=new ClsOpcion("halley", false);        
        opcionB=new ClsOpcion("saturno", false);
        opcionC=new ClsOpcion("marte", false);
        opcionD=new ClsOpcion("luna", true);  
        pregunta=new ClsPregunta(
                "¿como se llama el satelite que gira al rededor de la tierra?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );        
        nivel5.setPregunta4(pregunta);
        
        opcionA=new ClsOpcion("5", false);       
        opcionB=new ClsOpcion("8", true);
        opcionC=new ClsOpcion("20", false);
        opcionD=new ClsOpcion("3", false);  
        pregunta=new ClsPregunta(
                "¿cuantos planetas hay en el sistema solar?", 
                opcionA, 
                opcionB, 
                opcionC, 
                opcionD
        );        
        nivel5.setPregunta5(pregunta); 
        
        niveles[4]=nivel5;
        //terminan los niveles
        boolean continuar=true;
        int contarNivel=0;
        int premio=0;
        do {  
            if(contarNivel<5){
             char opc;
            System.out.println("¿desea continuar? s / n");
            opc = leer.next().charAt(0);
            continuar=(opc=='s'||opc=='S');
            if(continuar){
                if(niveles[contarNivel].Preguntar()){
                    contarNivel++;
                    premio=premio+200;
                    System.out.println("llevas: "+premio+" puntos");
                }else{
                    continuar=false;
                    System.out.println("Fin del juego, su acumulado es "+premio);

                }
            }else{
                System.out.println("Fin del juego, su acumulado es "+premio);
                continuar=false;
            }
            }else{
                System.out.println("!haz ganado¡ tu puntaje es: "+premio);
                continuar=false;
            }
        } while (continuar);
        
        new ClsHistorico().guardar(premio);
    
    }       
} 