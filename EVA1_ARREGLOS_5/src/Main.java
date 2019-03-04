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
        
        for (int i = 0; i < aiArray.length; i++) {
            aiArray[i] = (int)(Math.random()*100+1);
            System.out.print("["+aiArray[i]+"]");
        }
        System.out.println("");
        for (int i : aiArray) {
            if(i%2==0){
                System.out.print("["+i+"]");
            }
        }
    }
    
}
