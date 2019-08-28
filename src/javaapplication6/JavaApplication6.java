/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class JavaApplication6 {

    
    public static void main(String[] args) {
        ventana v1 = new ventana();
        v1.show(true);
        
        
        
        
        
        
        
        
        
        
        /*
        Scanner entrada = new Scanner(System.in);
        Estudiante student = new Estudiante();
        String nombre,asignatura;
        int n;
        double notFin = 0;
        System.out.print("Ingrese el nombre del estudiante: ");
        nombre = entrada.next();
        student.setNombre(nombre);
        System.out.print("Ingrese el nombre de la asignatura: ");
        asignatura = entrada.next();
        student.setAsignatura(asignatura);
        System.out.println("Ingrese la cantidad de notas: ");
        n = entrada.nextInt();
        student.setN(n);
        double [] notas = new double[student.getN()];
        int [] porcentajes = new int[student.getN()];
        JOptionPane.showMessageDialog(null, "Por favor ingrese la nota desde 0 hasta 50 ");
        for (int i = 0; i < student.getN(); i++) {
                notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota #"+ (i+1)+": " ));   
                porcentajes[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcertanje de la nota #"+ (i+1)+": "));
                notFin += (notas[i]*porcentajes[i]/100);
        }
        if (notFin < 3 && notFin >= 2.6 ){
            JOptionPane.showMessageDialog(null, "Su Nota final es de: " + notFin + " \nSr "+student.getNombre() +" puede habilitar la materia de "+student.getAsigantura()+".", "Calificacion", JOptionPane.ERROR_MESSAGE);
        }
        else if(notFin < 2.6){
            JOptionPane.showMessageDialog(null, "Su Nota final es de: " + notFin + " \n Lo sentimos Sr "+ student.getNombre() +" reprobo la materia de "+student.getAsigantura()+".", "Calificacion", JOptionPane.ERROR_MESSAGE);
        } 
        else {
        JOptionPane.showMessageDialog(null, "Su Nota final es de: " + notFin + "\nFelicidades "+ student.getNombre()+" aprobo la materia de "+ student.getAsigantura()+".", "Calificacion", JOptionPane.INFORMATION_MESSAGE);
        }
*/
    }
       
}
    

