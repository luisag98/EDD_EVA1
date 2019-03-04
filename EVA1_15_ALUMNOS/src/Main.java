
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de grupos: ");
        int x = sc.nextInt();
        
        for (int i = 0; i < x; i++) {
            System.out.println("Introduzca la cantidad de alumnos para el grupo "+i+" :");
            int j= sc.nextInt();
            Alumno[][] aGrupo = new Alumno[i][j];
        }
    }
    
}

class Alumno{
    private String nombre;
    private int edad;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
