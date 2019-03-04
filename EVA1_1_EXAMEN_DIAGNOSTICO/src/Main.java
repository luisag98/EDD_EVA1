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
        Primo pNum = new Primo();
        pNum.setiNum(4);
        pNum.esPrimo();
        
        Primo pNum2 = new Primo();
        pNum2.setiNum(4673);
        pNum2.esPrimo();
    }
    
}

class Primo{ // default 
    private int iNum;

    public Primo() {
    }
    
    public Primo(int iNum) {
        this.iNum = iNum;
    }
    
    public int getiNum() {
        return iNum;
    }

    public void setiNum(int iNum) {
        this.iNum = iNum;
    }
    
    public void esPrimo(){
        String sMensa= iNum + " es primo";
        for(int i=2; i<iNum; i++){
            if(iNum % i == 0){
                sMensa = iNum + " no es primo";
                break;
            }
            else{
                
            }
        }
        System.out.println(sMensa);
        
    }
    
}