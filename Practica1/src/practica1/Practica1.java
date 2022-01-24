/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 *
 * @author Adrian Aguilar
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion = "";
        Scanner sc = new Scanner(System.in);
        while(!opcion.equals("3")){
            System.out.println("Ingrese el numero de la opcion que desee: ");
            System.out.println("1. Lista de cadenas");
            System.out.println("2. Numeros binarios");
            System.out.println("3. Salir del programa");
            opcion = sc.nextLine();
            if(opcion.equals("1")){
                System.out.println("Ingrese la cadena a analizar");
            }else if(opcion.equals("2")){
                System.out.println("Ingrese el numero binario");
            }else if(!opcion.equals("1") && opcion.equals("2") && opcion.equals("3")){
                System.out.println("No ha ingresado una opcion valida");
            }
            if(opcion.equals("1") || opcion.equals("2")){
                String cadena = sc.nextLine();
                analizadores.Sintactico Parser;
                try {
                    Parser = new analizadores.Sintactico(new analizadores.Lexico( new ByteArrayInputStream(cadena.getBytes(Charset.forName("UTF-8")))));
                    Parser.parse();
                } catch(Exception e) {
                    System.out.println("Error fatal en compilación de entrada.");
                    System.out.println("Causa: "+e.getCause());
                }
            }      
            sc.nextLine();
        }
        
        
    }
    
}
