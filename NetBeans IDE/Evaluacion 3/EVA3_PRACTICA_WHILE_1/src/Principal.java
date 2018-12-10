
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
        //xU = Usuario / xC = Computadora
        int iUSum = 0;
        int iCSum = 0;
        
        String sResp;
        
        System.out.println("Quieres sacar una carta?");
            sResp = input.nextLine();
            
        while(sResp.toLowerCase().equals("si")){
            int iUNumAlea = (int)(Math.random() * 14) + 1;
            int iCNumAlea = (int)(Math.random() * 14) + 1;
            System.out.println("Computador = " + iCNumAlea);
            System.out.println("Tú = " + iUNumAlea);
                iUSum += iUNumAlea;
                iCSum += iCNumAlea;
            System.out.println("Quieres sacar otra carta?");
                sResp = input.nextLine();

        }
        System.out.println("Computador = " + iCSum);
        System.out.println("Tú = " +  iUSum);
        
        if(iUSum == 21 || (iCSum <= 21 && (iUSum >= iCSum && iUSum <= 21)) || (iCSum >= 21 && (iUSum <= iCSum && iUSum >= 21))){
            System.out.println("Ganaste morro!");
        }else if(iUSum == iCSum){
            System.out.println("Empate");
        }else
            System.out.println("Perdiste we");
    }
    
}
