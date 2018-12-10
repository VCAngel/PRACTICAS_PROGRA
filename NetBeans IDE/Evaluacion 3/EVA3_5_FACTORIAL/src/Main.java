
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int iVal;
        System.out.println("Calcular factorial");
        System.out.print("Introduce un valor: ");
            iVal = input.nextInt();
        int iResu = calcularFactorial(iVal);
        System.out.println("Resultado = " + iResu);
    }
    public static int calcularFactorial(int iVal){
    int iResu = 1;
    
        for (int i = iVal; i >= 1; i--) {
            iResu *= i;
        }
        return iResu;
    }
}
