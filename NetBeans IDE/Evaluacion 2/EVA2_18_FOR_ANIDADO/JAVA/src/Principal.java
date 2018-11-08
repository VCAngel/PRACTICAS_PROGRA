
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
        //1 --> 10
        //LISTA DE COMBINACIONES POSIBLES:
        //1,1 1,2 1,3 1,4 1,5 ... 10,10
        Scanner input = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + ", " + j);
            }
 
        }
    }
}
