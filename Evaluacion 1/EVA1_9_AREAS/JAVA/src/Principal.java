
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
    
    System.out.println("Área de un trapecio. Introduzca los datos.");
    float rBaMa, rBaMe, rAlt, rArea;
    
    System.out.println("Base mayor:");
            rBaMa = input.nextFloat();
            
    System.out.println("Base menor:");
            rBaMe = input.nextFloat();
            
    System.out.println("Altura:");
            rAlt = input.nextFloat();
            
        rArea = ((rBaMa + rBaMe)/2) * rAlt;
    System.out.println("Área = " + rArea);
    }
    
}
