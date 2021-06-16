
package test;

import dominio.Estudiante;
import java.util.Scanner;


public class testEstudiante {
    static Scanner datos = new Scanner (System.in);
    public static void main (String[] args){
        Estudiante [] Estudiantes;
        int num; 
        System.out.println("Introduzca el numero de estudiantes: ");
        num = datos.nextInt();
        Estudiantes = new Estudiante[num];
        llenarDatos(Estudiantes);
        
    }
    
    public static void llenarDatos(Estudiante est[]){
        String nombres;
        String sexo;
        double nota;
        for (int i=0;i<est.length;i++){
             System.out.println("Nombre: ");
             nombres = datos.nextLine();
             System.out.println("Sexo: ");
             sexo = datos.nextLine();
             System.out.println("Nota: ");
             nota = datos.nextDouble();
        }  
    }
  
}
