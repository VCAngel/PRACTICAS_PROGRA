
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
        
        System.out.println("Ingrese un número 1: ");
        int iNum = input.nextInt();
        
        
        //System.out.println("Ingrese un número 2: ");
        //int iNum2 = input.nextInt();
        
        //double dResu;
        
        //DIVISION
        //dResu = (double)iNum / iNum2;
        //System.out.println("Resultado = " + dResu);
        
        //MODULO - RESIDUO
        int iMod = iNum % 2;
        System.out.println("Residuo = " + iMod);
        if(iMod == 0)
            System.out.println("Par");
        else 
            System.out.println("Impar");
        
        //RESULTADO
        
    }
    
}
