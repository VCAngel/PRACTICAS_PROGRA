
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
                
        int iRand = (int)(Math.random() * 10) + 1;
        int iNum = 0;
        
        while(iRand != iNum){
        System.out.println("Adivina el número: ");
            iNum = input.nextInt();
        }
        System.out.println("ADIVINASTE!");
    }
    
}
