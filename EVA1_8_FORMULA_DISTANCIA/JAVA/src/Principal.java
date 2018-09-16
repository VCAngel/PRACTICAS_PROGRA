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
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Calcular la distancia. Introduce los datos.");
        float rVelI , rVelF , rTiem , rDist;
        
        System.out.println("Velocidad Inicial:");
        rVelI = input.nextFloat();
        
        System.out.println("Velocidad Final");
        rVelF= input.nextFloat();
        
        System.out.println("Tiempo:");        
        rTiem = input.nextFloat();
        
        System.out.println("La distancia es:");
        rDist = ((rVelF + rVelI) / 2) * rTiem;
        System.out.println(rDist);
        
        
        
        
    }
    
}
