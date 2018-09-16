
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce tu nombre ");
        String sNombre; //DECLARANDO
        Scanner sInput; //DECLARANDO
        //SCANNER ES UNA CLASE, PARA USAR CLASES
        //SE HACE A TRAVÉS DE OBJETOS, Y LOS OBJETOS
        //SE CREAN CON LA PALABRA new
        sInput = new Scanner(System.in);
        //Scanner sInput2 = new Scanner(System.in);
        //int iVal = 10;
        sNombre = sInput.nextLine();//Se ejecuta cuando el usuario da "enter"
        //CONCATENAMOS CADENAS "texto" + variable tipo texto
        System.out.println("Tu nombre es " + sNombre);
    }
    
}
