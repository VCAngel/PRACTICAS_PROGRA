/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vargas Casavantes Angel - 18550627
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Contar del 1 al 100 y del 100 al 1
        //FOR
        System.out.println("FOR");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "-");
        }
        System.out.println();
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + "-");
        }
        System.out.println("\nWHILE");
        //WHILE
        int i = 1;
        while(i <= 100){   
            System.out.print(i + "-");
            i++; 
        }
        i = 100;
        System.out.println();
        while(i >= 1){
            System.out.print(i + "-");
            i--;
        }
        //DO-WHILE
        System.out.println("\nDO/WHILE");
        i = 1;
        do{
            System.out.print(i + "-");
            i++;
        }while(i <= 100);
        System.out.println();
        i = 100;
        do{
            System.out.print(i + "-");
            i--;
        }while(i >= 1);
    }
    
}
