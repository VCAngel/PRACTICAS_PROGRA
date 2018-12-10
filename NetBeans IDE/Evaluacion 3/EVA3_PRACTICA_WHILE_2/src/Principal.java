
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
        Scanner  input = new Scanner(System.in);
        
        String sUser, sPass, sUser2, sPass2;
        int iTry = 1;
        System.out.println("Crea un usuario:");
        sUser = input.nextLine();
        System.out.println("Crea una contraseña:");
        sPass = input.nextLine();
        
        while(iTry <=3){
            System.out.println("Introduce tu Usuario:");
                sUser2 = input.nextLine();
            System.out.println("Introduce tu Contraseña:");
                sPass2 = input.nextLine();
            if(sUser2.equals(sUser) && sPass2.equals(sPass)){
                System.out.println("Bienvenido");
                System.exit(0);
            } else {
                iTry++;
            }
        }
        System.out.println("Acceso Denegado");
    }
    }
    
