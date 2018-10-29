
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vargas Casavantes Ángel- 18550627
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int iAnnio, iMod, iMod2, iMod3;
        
        System.out.println("Introduce un año: ");
        iAnnio = input.nextInt();
        iMod = iAnnio % 4;
        iMod2 = iAnnio % 100;
        iMod3 = iAnnio % 400;
        
        if((iMod == 0) && ((iMod2 != 0) || (iMod3 == 0)))
            System.out.println("ES BISIESTO");
        else
            System.out.println("NO ES BISIESTO");
            
    }
    
}
