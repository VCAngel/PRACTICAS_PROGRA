
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
        System.out.println("¿Tienes INE?");
        boolean bINE;
        
        bINE = input.nextBoolean();
        if (bINE == true){
            System.out.println("Si tiene INE");        
        } else {
            System.out.println("No tiene INE");
        }
    }
    
}
