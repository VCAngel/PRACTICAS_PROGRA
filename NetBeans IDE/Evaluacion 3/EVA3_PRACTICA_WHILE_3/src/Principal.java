
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        int iNum, iCont, iWhile;
        
        System.out.println("Introduce un número");
        iNum = input.nextInt();
        iCont = 0;
        iWhile = 1;
        while(iWhile <= iNum) {            
            int iMod = iNum % iWhile;
            iWhile++;
            if(iMod == 0)
                iCont++;
         }
        if(iCont <= 2){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
            
    }
    
}
