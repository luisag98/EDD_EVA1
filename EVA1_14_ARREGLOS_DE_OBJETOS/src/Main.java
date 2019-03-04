
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
        
        Persona[] apDatos = new Persona[5];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < apDatos.length; i++) {
            apDatos[i] = new Persona();
            System.out.println("Nombre: ");
            apDatos[i].setNombre(sc.nextLine());
            System.out.println("Apellido: ");
            apDatos[i].setApellido(sc.nextLine());
            System.out.println("Edad: ");
            apDatos[i].setEdad(sc.nextInt());
            sc.nextLine();
            System.out.println("Nacionalidad: ");
            apDatos[i].setNacionalidad(sc.nextLine());
        }
        
        for (Persona apDato : apDatos) {
            System.out.println("Datos de la persona");
            System.out.println("Nombre completo: "+apDato.getNombre()+" "+apDato.getApellido());
            System.out.println("Edad: "+apDato.getEdad());
            System.out.println("Nacionalidad: "+apDato.getNacionalidad());
            System.out.println("-------------------");
        }
        
    }
    
}

class Persona{
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}