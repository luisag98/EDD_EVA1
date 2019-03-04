
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
        
        int total=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de edades que desea capturar");
        int x = sc.nextInt();
        
        int[] edad = new int[x];
        
        for (int i = 0; i < edad.length; i++) {
            System.out.println(i+". Introduzca la edad: ");
            edad[i] = sc.nextInt();
            total += edad[i];
        }
        
        double media;
        media = total/x;
        
        System.out.println("La edad media es: "+media);
        
    }
    
}
