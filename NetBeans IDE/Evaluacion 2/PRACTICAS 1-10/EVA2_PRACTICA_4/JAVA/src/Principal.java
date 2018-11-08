
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vargas Casavante Ángel - 18550627
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int iNum;
        
        System.out.println("Introduce un número: ");
        iNum = input.nextInt();
        
        if(iNum > 0)
            System.out.println("1");
        else if(iNum < 0)
            System.out.println("-1");
        else
            System.out.println("0");
    }
    
}
