
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
        
        boolean bMaterias, bServicio, bResidencias;
        
        System.out.print("Acreditaste tus materias? ");
            bMaterias = input.nextBoolean();
        System.out.print("Hiciste tu servicio? ");
            bServicio = input.nextBoolean();
        System.out.print("Terminaste tus residencias? ");
            bResidencias = input.nextBoolean();
            
        if((bMaterias && bServicio && bResidencias) == true)
            System.out.println("Te puedes titular");
        else
            System.out.println("No te puedes titular");
    }
    
}
