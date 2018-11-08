
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
        //ENCONTRAR SI UN NÚMERO ES PRIMO
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int iNum = input.nextInt();
        int cont = 0;
        for (int i = 1; i <= iNum; i++) {
            int imod = iNum % i;
            if(imod == 0)
                cont++;
        }
        if(cont <= 2){
            System.out.println("Es primo");
        }else{
            System.out.println("No es Primo");
        }
    }
}
