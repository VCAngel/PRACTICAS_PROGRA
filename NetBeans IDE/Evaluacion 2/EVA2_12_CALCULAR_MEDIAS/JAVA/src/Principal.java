
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
        
        int iSumaEdad = 0;
        System.out.println("Edad 1: ");
            iSumaEdad += input.nextInt();
        System.out.println("Edad 2: ");
            iSumaEdad += input.nextInt();
        System.out.println("Edad 3: ");
            iSumaEdad += input.nextInt();
        System.out.println("Edad 4: ");
            iSumaEdad += input.nextInt();
        System.out.println("Edad 5: ");
            iSumaEdad += input.nextInt();
        
        double dMedia = (double)iSumaEdad/5;
        System.out.println("La suma es = " + iSumaEdad);
        System.out.println("La media es = " + dMedia);
        
        
    }
    
}
