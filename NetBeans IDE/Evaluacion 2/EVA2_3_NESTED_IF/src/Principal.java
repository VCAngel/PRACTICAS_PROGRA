/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vargas Casavantes Angel - 18550627
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iCali = 200;
        
        if (iCali == 100) {
            System.out.println("A");
        } else if(iCali == 90){
            System.out.println("B");
        } else if(iCali == 80){
            System.out.println("C");
        } else if(iCali == 70){
            System.out.println("D");
        } else if(iCali == 60){
            System.out.println("F");
        } else {
            System.out.println("Fuera de rango");
      }
    }
    
}
