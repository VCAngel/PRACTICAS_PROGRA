
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
        Scanner input = new Scanner (System.in);
        //for: no manipulamos la variable contador
        //DETENER EL FOR CUANDO ENCONTREMOS UN NÚMERO DIVISIBLE ENTRE 5
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            int iResi = i % 5;
            if(iResi == 0)
                break; //INTERRUMPE LA LÓGICA DEL PROGRAMA
        }
        //CONTINUE
        //IMPRIMIR TODOS LOS NÚMEROS QUE NO SEAN DIVISIBLE ENTRE 5
        for (int i = 1; i < 10; i++) {
            int iResi = i % 5;
            if(iResi == 0)
                continue; //INTERRUMPIR LA ITERACIÓN ACTUAL
            
            System.out.println(i);
        }
    }
    
}
