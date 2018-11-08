
import java.util.Scanner;

/*
 * Programa para reconocer si una ecuacion es un TCP
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
        Scanner input = new Scanner(System.in);
        
        int iA, iB, iC;
        System.out.println("Ax^2 + Bx + C = 0");
        System.out.print("A = ");
        iA = input.nextInt();
        
        System.out.print("B = ");
        iB = input.nextInt();
        
        System.out.print("C = ");
        iC = input.nextInt();
        
        //Indicar si se puede resolver, si es un TCP, o si es otro tipo de ecuación
        //Usando el discriminante (SQRT(B^2 - 4AC))
        //No se puede resolver si es negativo, es TCP si es 0, es otro tipo si es positivo
        
        System.out.println(iA + "x^2 + " + iB + "x + " + iC + " = 0");
            double dRaiz = Math.pow(iB, 2) - 4*iA*iC;
            double dDisc = Math.sqrt(dRaiz);
            
            double dX1 = (-iB + dDisc)/(2 * iA);
            double dX2 = (-iB - dDisc)/(2 * iA);
        if(dRaiz == 0){
            System.out.println("Es un Trinomio Cuadrado Perfecto");
            System.out.print("Sus raices son: ");
            System.out.println("x1 = " + dX1 + ", x2 = " + dX2);
        }else if(dRaiz > 0)
            System.out.println("Es otro tipo de Trinomio");
        else
            System.out.println("No se puede resolver");
           
    }
}
