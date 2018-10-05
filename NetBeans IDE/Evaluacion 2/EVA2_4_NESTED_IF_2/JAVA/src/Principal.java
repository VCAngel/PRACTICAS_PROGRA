
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
        int iCali;
            
            System.out.println("Introduce tu calificación");
        iCali = input.nextInt();
        if (iCali == 100) {
            System.out.println("A");
        } else if(iCali >= 90 && iCali < 100){
            System.out.println("B");
        } else if(iCali >= 80 && iCali < 90){
            System.out.println("C");
        } else if(iCali >= 70 && iCali < 80){
            System.out.println("D");
        } else if(iCali >= 0 && iCali < 70){
            System.out.println("F");
        } else {
            System.out.println("Fuera de rango");
      }
    }
    
}
