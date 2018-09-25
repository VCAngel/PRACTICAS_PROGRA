
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
        
        System.out.println("Introduce tu nombre:");
        String sNombre;
        sNombre = input.nextLine();
        
        System.out.println("Introduce tu edad:");
        int iEdad;
        iEdad = input.nextInt();
        
        int iAño;
        iAño = 2018 - iEdad;
        
        System.out.println("Tu nombre es " + sNombre);
        System.out.println("Tu año de nacimiento es " + iAño);
    }
    
}
