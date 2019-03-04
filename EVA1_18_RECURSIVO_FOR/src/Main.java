
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
        
        System.out.println("Introduce un numero: ");
        int iNum = sc.nextInt();
        sc.nextLine();
        recursiveDown(iNum);
        System.out.println("");
        recursiveUp(iNum, 1);
        /*for (int i = iNum; i >= 1; i--) {
            System.out.println(i + " - ");
        }*/
        
        
        
    }
    public static void recursiveDown(int iVal){
        /* DOS CARACTERISTICAS:
        1. LLAMADA RECURSIA: EL METODO DEBE LLAMARSE A SI MISMO
        2. DETENERSE: EL METODO DEBE PROPORCIONAR MANERAS PARA DETENER LA RECURSION
        */
        System.out.print(iVal);
        if(iVal>1){
            System.out.print(" - ");
            recursiveDown(iVal - 1);
        } 
    }
    
    public static void recursiveUp(int iVal, int iCount){
        /* DOS CARACTERISTICAS:
        1. LLAMADA RECURSIA: EL METODO DEBE LLAMARSE A SI MISMO
        2. DETENERSE: EL METODO DEBE PROPORCIONAR MANERAS PARA DETENER LA RECURSION
        */
        System.out.print(iCount);
        if(iCount<iVal){
            System.out.print(" - ");
            recursiveUp(iVal, iCount + 1);
        } 
        // recursiveDown(iVal - 1);
    }
}
