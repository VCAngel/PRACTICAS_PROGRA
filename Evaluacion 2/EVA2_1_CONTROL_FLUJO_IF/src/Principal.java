
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vargas Casavantes Ángel 18550627
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
    System.out.println("Calificación en Fundamentos de programación:");
    
        double dCali;
        dCali = input.nextDouble();
    
    System.out.println("Tu calificación es: " + dCali);
    
    if (dCali >= 70){
        System.out.println("Aprobaste");
    } else {
        System.out.println("Nos vemos en segunda oprtunidad D,:");
         }
    }
    
}
