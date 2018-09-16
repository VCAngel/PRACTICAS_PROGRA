
import java.util.Scanner;
import java.lang.Math;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cálcular fórmula de una pendiente. Introduce los datos");
        float rx1, rx2, ry1, ry2, rM;
        
        System.out.println("x1 = ");
        rx1 = input.nextFloat();
        
        System.out.println("x2 = ");
        rx2 = input.nextFloat();
        
        System.out.println("y1 = ");
        ry1 = input.nextFloat();
        
        System.out.println("y2 = ");
        ry2 = input.nextFloat();
        
        rM = (ry2 - ry1)/(rx2 - rx1);
        System.out.println("M = " + rM);
        
    }
    
}
