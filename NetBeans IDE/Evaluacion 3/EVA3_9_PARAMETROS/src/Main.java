/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vargas Casavantes Ángel - 18550627
 */
public class Main {//CLASE - TIPO DE DATO ABSTRACTO

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(new Main());
        Main mObjeto = new Main();
        System.out.println(mObjeto);
        UnaClase ucObjeto2 = new UnaClase();
        System.out.println(ucObjeto2);
        //
        int iValor = 5;
        Incremento(iValor);
        System.out.println("El valor es " + iValor);
        //
        Valor vObjetoValor = new Valor();
        vObjetoValor.iValor = 5;
        Incremento(vObjetoValor);
        System.out.println("El valor 2 es " + vObjetoValor.iValor);
    }
    public static void Incremento(int iVal){
        iVal++; 
    }
    public static void Incremento(Valor vValor){
        vValor.iValor++;
    }
}
class UnaClase{}

class Valor{
    int iValor;
}