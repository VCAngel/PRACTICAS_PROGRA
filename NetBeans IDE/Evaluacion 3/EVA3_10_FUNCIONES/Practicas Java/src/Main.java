
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        
        //Meses
        System.out.print("Introduce un número de mes: ");
            int iMes = input.nextInt();
        System.out.println("Mes:" + Meses(iMes));
        //Califa (letra a número)
        System.out.print("\nIntroduce una letra: ");
            String sCal = input.next().toLowerCase();
        System.out.println("Calificacion: " + sCalifa(sCal));
        //Califa (numero a letra)
        System.out.print("\nIntroduce una calificacion: ");
            int iCal = input.nextInt();
        System.out.println(iCalifa(iCal));
        
        System.out.println("-----------------------------------------------------------");
        //Metodo para solicitar una captura y devolver un valor (OVERLOAD)
        //INT
        System.out.println("Tu edad es: " + Capt("Introduce tu edad: ", 0));
        System.out.println("");
        //DOUBLE
        System.out.println("Respuesta = " + Capt("Int. dos valores a dividir", 0, 0));
        System.out.println("");
        //STRING
        System.out.println("Mucho gusto " + Capt("¿Cómo te llamas?", ""));
        System.out.println("");
        //BOOLEAN
        System.out.print("That is " + Capt("Are you an adult? ", true));
        System.out.println("");
        
        System.out.println("-----------------------------------------------------------");
        //NUMERO PRIMO
        System.out.print("Introduce un numero entero: ");
            int iNum = input.nextInt();
        System.out.println(iPrimo(iNum));
        //ANNIO BISIESTO
        System.out.println("\nIntroduce un annio: ");
            int iAnnio =  input.nextInt();
        Bisiesto(iAnnio);
    }
    public static String Meses(int x){
        String sMes;
        switch(x){
            case 1:
                sMes = "Enero";
                break;
            case 2:
                sMes = "Febrero";
                break;
            case 3:
                sMes = "Marzo";
                break;
            case 4:
                sMes = "Abril";
                break;
            case 5:
                sMes = "Mayo";
                break;
            case 6:
                sMes = "Junio";
                break;
            case 7:
                sMes = "Julio";
                break;
            case 8:
                sMes = "Agosto";
                break;
            case 9:
                sMes = "Septiembre";
                break;
            case 10:
                sMes = "Octubre";
                break;
            case 11:
                sMes = "Noviembre";
                break;
            case 12:
                sMes = "Diciembre";
                break;
            default:
                sMes = "Introduce un valor válido";
                break;
        }
        return sMes;
    }
    public static String sCalifa(String x){
        String sCali;
        switch(x){
            case "a":
                sCali = "100";
                break;
            case "b":
                sCali = "90";
                break;
            case "c":
                sCali = "80";
                break;
            case "d":
                sCali = "70";
                break;
            case "f":
                sCali = "50";
                break;
            default:
                sCali = "Introduce un valor válido";
                break;
        }
        return sCali;
    }
    public static String iCalifa(int x){
        String sCalifa;
        if(x<=100&&x>90){
            sCalifa = "A";
        }else if(x<=90&&x>80){
            sCalifa = "B";
        }else if(x<=80&&x>70){
            sCalifa = "C";
        }else if(x<=70&&x>60){
            sCalifa = "D";
        }else if(x<=60){
            sCalifa = "F";
        }else
            sCalifa = "Introduce un valor válido";
        return sCalifa;
    }
    public static int Capt(String sMsg, int iEdad){
        Scanner input = new Scanner(System.in);
        System.out.println(sMsg);
        iEdad = input.nextInt();
        return iEdad;
    }
    public static double Capt(String sMsg, double iVal1, double iVal2){
        Scanner input = new Scanner(System.in);
        System.out.println(sMsg);
        System.out.print("Número 1: ");
        iVal1 = input.nextDouble();
        System.out.print("Número 2: ");
        iVal2 = input.nextDouble();
        return iVal1 / iVal2;
    }
    public static String Capt(String sMsg, String sNom){
        Scanner input = new Scanner(System.in);
        System.out.println(sMsg);
        sNom = input.nextLine();
        return sNom;
    }
    public static boolean Capt(String sMsg, boolean sBool){
        Scanner input = new Scanner(System.in);
        System.out.print(sMsg);
        String sRes =  input.nextLine();
        if(sRes.toLowerCase().equals("yes")){
            sBool = true;
        }else if(sRes.toLowerCase().equals("no")){
            sBool = false;
        }
        return sBool;
    }
    public static String iPrimo(int iVal){
        String sPrimo;
        int iCount = 0;
        for (int i = 1; i <= iVal; i++){
            if((iVal % i) == 0){
                iCount++;
            }
        }
        
        if(iCount <= 2){
            sPrimo = "El numero es primo";
        }else{
            sPrimo = "El numero no es primo";
        }
        return sPrimo;
    }
    public static void Bisiesto(int iAnnio){
        int iMod = iAnnio % 4;
        int iMod2 = iAnnio % 100;
        int iMod3 = iAnnio % 400;
        
        if((iMod == 0) && ((iMod2 !=0) || (iMod3 == 0)))
            System.out.println("Es annio bisiesto");
        else
            System.out.println("No es annio bisiesto");
    }
}    

