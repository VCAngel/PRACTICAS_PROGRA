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
        int iSum = 0;
        for (int i = 1; i <= 100; i++) {
            iSum += i;
            System.out.println(i);
        }
        System.out.println("Sumatoria de todos los números = " + iSum);
    }
    
}
