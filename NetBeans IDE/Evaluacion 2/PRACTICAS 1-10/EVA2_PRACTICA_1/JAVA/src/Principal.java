
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
        
        int iNum1, iNum2;
        System.out.println("Introduce el primer número: ");
        iNum1 = input.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        iNum2 = input.nextInt();
        
        if(iNum1 == iNum2)
            System.out.println("Son número iguales");
        else
            System.out.println("No son números iguales");
    }
    
}
