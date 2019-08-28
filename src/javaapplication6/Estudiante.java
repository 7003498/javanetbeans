
package javaapplication6;

import javax.swing.JOptionPane;

public class Estudiante {
    private String nombre,asignatura;
    private int n,porcentaje[];
    private double notFin,notas[];
    
    public void crearNotas(){
        porcentaje = new int[n];
        notas = new double[n];
    }
    public void setNombre(String nom1){
        nombre = nom1;
    }
    public void setAsignatura(String asig1){
        asignatura = asig1;
    }
    public void setPorcentaje(int porc1[]){
        for (int i = 0; i < n; i++) {
            porcentaje[i] = porc1[i];
        }
    }
    public void setNotas(double not1[]){
        for (int i = 0; i < n; i++) {
            notas = not1;
        }
    }
    public void setN(int n1){
           n = n1;
       }
    
    public int getN(){
        return n;
    }
    public String getNombre(){
        return nombre;
    }
    public String getAsigantura(){
        return asignatura;
    }
    public void CalcularNota(String aux[], String auxp[]){
        for (int i = 0; i < n; i++) {
            notas[i] = Double.parseDouble(aux[i]);
            porcentaje[i] = Integer.parseInt(auxp[i]);
            notFin += Math.rint(notas[i]*porcentaje[i]/100);
        }
        if (notFin < 3 && notFin >= 2.6 ){
            JOptionPane.showMessageDialog(null, "Su Nota final es de: " + notFin + " \nSr "+ nombre +" puede habilitar la materia de "+asignatura+".", "Calificacion", JOptionPane.ERROR_MESSAGE);
        }
        else if(notFin < 2.6){
            JOptionPane.showMessageDialog(null, "Su Nota final es de: " + notFin + " \n Lo sentimos Sr "+ nombre +" reprobo la materia de "+asignatura+".", "Calificacion", JOptionPane.ERROR_MESSAGE);
        } 
        else {
        JOptionPane.showMessageDialog(null, "Su Nota final es de: " + notFin + "\nFelicidades "+ nombre+" aprobo la materia de "+ asignatura+".", "Calificacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
