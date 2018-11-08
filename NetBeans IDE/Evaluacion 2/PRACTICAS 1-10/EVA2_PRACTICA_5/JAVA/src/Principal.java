
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
        
        int iNum1, iNum2, iNum3;
        
        System.out.println("Introduce el primer valor: ");
        iNum1 = input.nextInt();
        
        System.out.println("Introduce el segundo valor: ");
        iNum2 = input.nextInt();
        
        System.out.println("Introduce el tercer valor: ");
        iNum3 = input.nextInt();
        
        System.out.print("El número mayor es = ");
        if(iNum1 >= iNum2 && iNum1 >= iNum3)
            System.out.println(iNum1);
        else if(iNum2 >= iNum1 && iNum2 >= iNum3)
            System.out.println(iNum2);
        else if(iNum3 >= iNum1 && iNum3 >= iNum2)
            System.out.println(iNum3);
    }
    
}
