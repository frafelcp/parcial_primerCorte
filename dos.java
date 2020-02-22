/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class dos {
    public static void main(String[] args) {
        //INGRESAR COMPETIDORES
        int competidores;
        String [] nombCompetidores;
        
        competidores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "
                + "cuantos competidores hay"));
        
        nombCompetidores = new String[competidores];
        
        JOptionPane.showMessageDialog(null, "Registro de competidores");
        for (int i = 0; i < competidores; i++) {
            nombCompetidores[i] = JOptionPane.showInputDialog("Ingresa el nombre "
                    + "del " + (i + 1) + " competidor");
        }
        
        //TIEMPO DE LOS COMPETIDORES
        double [] tiempo = new double[competidores];
        
        JOptionPane.showMessageDialog(null, "Registro de tiempo de los competidores");
        for (int i = 0; i < competidores; i++) {
            tiempo[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa "
                    + "el tiempo del competidor " + nombCompetidores[i]));
        }
        
        //GANADOR
        double gan = tiempo[0];
        int g = 0;
        
        for (int i = 0; i < tiempo.length; i++) {
            if (tiempo[i] <= gan) {
                gan = tiempo[i];
                g = i;
            }
        }
        
        for (int i = 0; i < competidores; i++) {
            if (i == gan) {
                JOptionPane.showMessageDialog(null, "El ganador es con tiempo de " + gan);
            }
        }
        
        //PROMEDIO
        double sum = 0;
        double prom;
        
        for (int i = 0; i < tiempo.length; i++) {
            sum += tiempo[i];
        }
        
        prom = sum / tiempo.length;
        
        JOptionPane.showMessageDialog(null, "El promedio de tiempo es " + prom);
        
        //LISTADO
        //LISTA POR DEBAJO DEL PROMEDIO
        int mProm = 0;
        for (int i = 0; i < tiempo.length; i++) {
            if (tiempo[i] <= prom) {
                mProm++;
            }
        }
        
        double [] menProm = new double[mProm];
        for (int i = 0; i < tiempo.length; i++) {
            if (tiempo[i] <= prom) {
                menProm[i] = tiempo[i];
            }
        }
        
        for (int i = 0; i < menProm.length; i++) {
            JOptionPane.showMessageDialog(null, "tiempos menor y igual al promedio" 
                    + menProm[i]);
        }
    }
}
