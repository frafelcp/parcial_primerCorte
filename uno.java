/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class uno {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //LEER LAS RESPUESTAS
        int res;
        String [] respuestas;
        
        res = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuntas "
                + "respuesta tiene la prueba:"));
        
        respuestas = new String[res];
        
        JOptionPane.showMessageDialog(null, "Ingresar las respuestas correctas y "
                + "erradas");
        for (int i = 0; i < respuestas.length; i++) {
            respuestas[i] = JOptionPane.showInputDialog("Ingrese la respuesta " + 
                    (i + 1) + ":");
        }
        
        //RESPUESTAS CORRECTAS Y ERRADAS
        int resC = 0;
        int resE = 0;
        
        for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i].equals("correcta")) {
                resC++;
            } else {
                resE++;
            }
        }        
       
        JOptionPane.showMessageDialog(null, "Respuetas correctas:" + resC + "\nRe"
                + "spuestas erradas:" + resE + "\n");
        
        //NOTA FINAL
        int cali = 0;
        int valRE = 0;
        int [] califi = {2, 1};
        
        
        for (int i = 0; i < respuestas.length; i++) {
            if ("correcta".equals(respuestas[i])) {
                cali += califi[0];
            } else {
                cali -= califi[1];
            }
        }
        
        JOptionPane.showMessageDialog(null, "la nota final de la preba es:" + cali);
    }
}
