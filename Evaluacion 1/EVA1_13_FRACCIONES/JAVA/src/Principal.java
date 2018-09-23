
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vargas Casavantes Angel 18550627
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Operaciones Aritméticas. Introduce los datos.");
         int iNum1, iDen1, iNum2, iDen2;
         int iCNSum, iCNRes, iCNPro, iCNDiv, iCDDiv, iCD;
        //CN() = Común numerador y su operación
        //CD() = Común denominador y su operación                                            
         
         System.out.print("Numerador 1 = ");
         iNum1 = input.nextInt();
         
         System.out.print("Denominador 1 = ");
         iDen1 = input.nextInt();
         
         System.out.print("Numerador 2 = ");
         iNum2 = input.nextInt();
         
         System.out.print("Denominador 2 = ");
         iDen2 = input.nextInt();
         
            iCNSum = ((iNum1 * iDen2) + (iDen1 * iNum2));
            iCNRes = ((iNum1 * iDen2) - (iDen1 * iNum2));
            iCNPro = (iNum1 * iNum2);
            iCNDiv = (iNum1 * iDen2);
            iCDDiv = (iNum2 * iDen1);
            iCD = (iDen1 * iDen2);
         
         System.out.print(iNum1 + "/" + iDen1 + " + ");
         System.out.print(iNum2 + "/" + iDen2 + " = ");
            System.out.println(iCNSum + "/" + iCD);
            
         System.out.print(iNum1 + "/" + iDen1 + " - ");
         System.out.print(iNum2 + "/" + iDen2 + " = ");
            System.out.println(iCNRes + "/" + iCD); 
              
         System.out.print(iNum1 + "/" + iDen1 + " * ");
         System.out.print(iNum2 + "/" + iDen2 + " = ");
            System.out.println(iCNPro + "/" + iCD);
              
         System.out.print(iNum1 + "/" + iDen1 + " / ");
         System.out.print(iNum2 + "/" + iDen2 + " = ");
            System.out.println(iCNDiv + "/" + iCDDiv);
    }
    
}
