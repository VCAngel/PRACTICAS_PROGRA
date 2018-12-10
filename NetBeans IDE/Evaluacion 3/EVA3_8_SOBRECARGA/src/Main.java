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
        System.out.println("Hola");
        System.out.println(7);
        System.out.println(true);
        System.out.println(new Main());//objeto de la clase main
        
        System.out.println(Suma(5, 8));
        System.out.println(Suma("Hola ", "Mundo!"));
    }
    
    public static int Suma(int iVal1, int iVal2){
        return iVal1 + iVal2;
    }
    public static String Suma(String sStr1, String sStr2){
        return sStr1 + sStr2;
    }
    public static void Suma(int iVal){   
    }
}
