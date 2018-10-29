/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_practica_10;

import java.util.Scanner;

/**
 *
 * @author Vargas Casavantes Angel - 18550627
 */
public class EVA2_PRACTICA_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int iMat, iFis, iQui;
        
        System.out.print("Calificacion en Matematicas: ");
            iMat = input.nextInt();
        System.out.print("Calificacion en Fisica: ");
            iFis = input.nextInt();
        System.out.print("Calificacion en Quimica: ");
            iQui = input.nextInt();
        
        int iSumTres = iMat + iFis + iQui; 
        
        //OPCION 1
        if((((iMat >= 65) && (iFis >= 55) && (iQui >= 50)) && (iSumTres >= 180))
                || (iMat >= 65) && (iSumTres >= 140))
            System.out.println("El candidato es elegible para el curso");
        else   
            System.out.println("El candidato no es elegible para el curso");
       //OPCION230
       
    }
    
}
