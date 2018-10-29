
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
        
        int iAng1, iAng2, iAng3;
        System.out.print("Valor del angulo 1: ");
        iAng1 = input.nextInt();
        
        System.out.print("Valor del angulo 2: ");
        iAng2 = input.nextInt();
        
        System.out.print("Valor del angulo 3: ");
        iAng3 = input.nextInt();
        
        if(iAng1 == (iAng2 & iAng3))
            System.out.println("Triangulo Equilatero");
        else if(iAng1 == iAng2 || iAng1 == iAng3 || iAng2 == iAng3)
            System.out.println("Triangulo Isosceles");  
        else
            System.out.println("Triangulo Escaleno");
    }
    
}
