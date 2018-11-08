
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
        
        int iTemp;
        System.out.print("Temperatura (ºC): "); 
        iTemp = input.nextInt();
        
        if(iTemp < 0)
            System.out.println("Freezing Cold Weather");
        else if(iTemp >= 0 && iTemp < 10)
            System.out.println("Very Cold Weather");
        else if(iTemp >= 10 && iTemp < 20)
            System.out.println("Cold Weather");
        else if(iTemp >= 20 && iTemp < 30)
            System.out.println("Normal in Temperature");
        else if(iTemp >= 30 && iTemp < 40)
            System.out.println("It's Hot");
        else if(iTemp >= 40)
            System.out.println("It's Very Hot!");
   }
    
}
