/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vargas Casavantes Ángel - 18550627
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mistackOverFlow();
   }
    //RECURSIVIDAD - NOS ACABAMOS LA MEMORIA (STACK OVERFLOW)
    public static void mistackOverFlow(){
        System.out.println("Hola usuario, buen día!");
        mistackOverFlow();
    }
    
}
