
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vargas
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int iAnnio;
        System.out.println("INGRESE EL AÑO");
        iAnnio = input.nextInt();
        
        if((iAnnio % 4) == 0){
            if((iAnnio % 4) == 100){
                if((iAnnio % 4) == 400){
                    System.out.println("ES BISIESTO");
                }else{
                    System.out.println("NO ES BISIESTO");
                }
            }else{
                System.out.println("ES BISIESTO");
            }
        }else{
            System.out.println("NO ES BISIESTO");
        }
    }
    
    
}
