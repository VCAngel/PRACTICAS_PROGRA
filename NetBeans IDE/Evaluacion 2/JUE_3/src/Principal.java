
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vargas Casavantes Ángel - 18550627
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el valor 1 : ");
        int iNum = input.nextInt();
        
        System.out.println("Introduce el valor 2 : ");
        int iNum2 = input.nextInt();
        
        double dDiv = (double)iNum / iNum2;
        System.out.println("División = " + dDiv);
        
        int dDivEnt = iNum / iNum2;
        System.out.println("División entera = " + dDivEnt);
        
        int iMod = iNum % iNum2;
        System.out.println("Residuo = " + iMod);
        
    }
    
}
