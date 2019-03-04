
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
        int iNum1, iNum2;
        
        System.out.println("Introduzca los dos numeros para conocer su maximo divisor comun");
        iNum1 = sc.nextInt();
        iNum2 = sc.nextInt();
        
        System.out.println("Maximo comun divisor: " + gcd(iNum1, iNum2));
    }
    
    public static int gcd(int iVal, int iVal2){
        if(iVal2==0){
            return iVal;
        }
        else{
            return gcd(iVal2, iVal%iVal2);
        }
        
    }
    
}
