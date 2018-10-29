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
        int iSuma = 0;//punto de partida
        iSuma = iSuma + 10; //0 + 10
        System.out.println("Valor de suma: " + iSuma);
        iSuma += 10;
        System.out.println("Valor de suma: " + iSuma);
        iSuma += 10;//Operador de incremento
        System.out.println("Valor de suma: " + iSuma);
        //MULTIPLICACION
        int iMult =1;
        System.out.println("Valor de iMult: " + iMult);
        iMult = iMult * 5;
        System.out.println("Valor de iMult: " + iMult);
        iMult *= 5;
        System.out.println("Valor de iMult: " + iMult);
        //RESTA
        int iResta = 100;
        System.out.println("Valor de iResta: " + iResta);
        iResta = iResta - 5;
        System.out.println("Valor de iResta: " + iResta);
        iResta -= 5;
        System.out.println("Valor de iResta: " + iResta);
        
        //CONTADOR
        //TIPO ESPECIAL DE ACUMULADOR
        int iCont = 0;
        System.out.println("Cuanto tienes = " + iCont);
        iCont = iCont + 1;
        System.out.println("Cuanto tienes = " + iCont);
        iCont += 1;
        System.out.println("Cuanto tienes = " + iCont);
        iCont++;
        System.out.println("Cuanto tienes = " + iCont);
        //te castigaron y te quitaron dinero
        iCont--;
        System.out.println("Cuanto tienes = " + iCont);
        //string
        String sCade = "Hola";
        System.out.println(sCade);
        sCade = sCade + " Mundo";
        System.out.println(sCade);
        System.out.println("**********");
        System.out.println("Valor iCont = " + iCont);
        System.out.println("Cuanto tienes = " + (iCont++));
        System.out.println("Cuanto tienes = " + (++iCont));
        //iCont++ --> Se aplica después
        //++iCont --> Se aplica al momento
        System.out.println("**********");
        System.out.println("Valor iCont = " + iCont);
        iCont++;
        System.out.println("Cuanto tienes = " + iCont);
        ++iCont;
        System.out.println("Cuanto tienes = " + iCont);
    }
    
}
