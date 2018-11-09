
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
        //0 --> 1 - Math.random() da numeros double
        //numeros entre 1 y 10
        int iNumAlea = (int)(Math.random() * 10) + 1;
        //System.out.println("Numero = " + iNumAlea);
        for (int i = 0; i < 3; i++) {
            System.out.println("Adivina el número");
            int iNume = input.nextInt();
            if(iNume == iNumAlea){
                System.out.println("Felicidades, ganaste!!!");
                break;
            }
            if(i == 2){
                System.out.println("Perdiste");
            }
        }
    }
    
}
