
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
        
        int iX, iY;
        
        System.out.print("Coordenada en X = ");
        iX = input.nextInt();
        
        System.out.print("Coordenada en Y = ");
        iY = input.nextInt();
        
        if(iX > 0 && iY > 0)
            System.out.println("Coordenadas del Cuadrante 1");
        else if(iX < 0 && iY > 0)
            System.out.println("Coordenadas del Cuadrante 2");
        else if(iX < 0 && iY < 0)
            System.out.println("Coordenadas del Cuadrante 3");
        else if(iX > 0 && iY < 0)
            System.out.println("Coordenadas del Cuadrante 4");
    }
    
}
