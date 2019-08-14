/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ventana nue = new ventana();
        nue.show(true);
        // clase
         
        /*
        
        int codigo,n;
        double NotFin = 0;
        student.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del estudiante: "));
        student.setAsignatura(JOptionPane.showInputDialog("Ingrese el nombre de la asignatura: "));
        student.setN(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de notas: ")));
        
        double [] notas = new double[student.getN()];
        int [] porcentajes = new int[student.getN()];
        JOptionPane.showMessageDialog(null, "Por favor ingrese la nota desde 0 hasta 50 ");
        for (int i = 0; i < student.getN(); i++) {
                notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota #"+ (i+1)+": " ));   
                porcentajes[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcertanje de la nota #"+ (i+1)+": "));
                NotFin += (notas[i]*porcentajes[i]/100);
        }
        if (NotFin < 30){
            JOptionPane.showMessageDialog(null, "Su Nota final es de: " + NotFin + " \nLo sentimos "+ student.getNombre() +" pero no aprobo la materia de "+student.getAsigantura()+".", "Calificacion", JOptionPane.ERROR_MESSAGE);
        }
        else{
        JOptionPane.showMessageDialog(null, "Su Nota final es de: " + NotFin + "\nFelicidades "+ student.getNombre()+" aprobo la materia de "+ student.getAsigantura()+".", "Calificacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }
        
    }*/
    }
}
