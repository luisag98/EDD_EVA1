/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pipol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiArray[] = new int[50];
        int temporal, menor=100, mayor=0;
        for (int i = 0; i < aiArray.length; i++) {
            aiArray[i] = (int)(Math.random()*100+1);
        }
        for (int i : aiArray) {
            System.out.print("["+i+"]");
            if(i>mayor){
                mayor = i;
            }
            else if(i<menor){
                menor=i;
            }
        }
        System.out.println("");
        System.out.println("Valor menor: "+menor);
        System.out.println("Valor mayor: "+mayor);
    }
    
}
