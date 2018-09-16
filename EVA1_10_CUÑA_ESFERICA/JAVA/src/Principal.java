
import java.util.Scanner;

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
    
    System.out.println("Calcular el valor de una Cuña Esférica. Introduce los datos.");
    float rVol, rRad, rGrad;
    
    System.out.println("Radio:");
    rRad = input.nextFloat();
    
    System.out.println("Grados de apertura:");
    rGrad = input.nextFloat();
    
    rVol = (float) ((double)4/3 * (3.14159 * Math.pow(rRad, 3)/360)* rGrad);
    System.out.println("Volumen = " + rVol);
    }
    
}
