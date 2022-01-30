/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 *
 * @author Adrian Aguilar
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a parsear: (ejemplo: 101.011)");
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
    
}
