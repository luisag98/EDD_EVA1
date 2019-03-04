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
        int contador = 0, contador2 = 0;
        for (int i = 0; i < aiArray.length; i++) {
            aiArray[i] = (int)(Math.random()*100+1);
            System.out.print("["+aiArray[i]+"]");
        }
        System.out.println("");
        for (int i : aiArray) {
            if(i%2==0){
                contador++;
            }
        }
        int aiPares[] = new int[contador];
        int aiInpares[] = new int[aiArray.length-contador];
        contador = 0;
        for (int i : aiArray) {
            if(i%2==0){
                aiPares[contador] = i;
                System.out.print("["+aiPares[contador]+"]");
                contador++;
            }
        }
        System.out.println("");
        for (int i : aiArray) {
            if(i%2!=0){
                aiInpares[contador2] = i;
                System.out.print("["+aiInpares[contador2]+"]");
                contador2++;
            }
        }    
    }
    
}
