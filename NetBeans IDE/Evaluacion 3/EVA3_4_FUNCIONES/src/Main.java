/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángel Vargas Casavantes - 18550627
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //LLAMADA A FUNCION
        Main mObjeto = new Main();
        mObjeto.printMsg("Ángel");
        Math.random();
    }
    void printMsg(String msg){
        System.out.println("Hola " + msg);
    }
    // PARADIGMAS DE PROGRAMACION:
    //  PROGRAMACION ESTRUCTURADA
    //  PROGRAMACION MODULAR, ORIENTADA A OBJETOS, ORIENTADA A EVENTOS
    //  LOGICA, FUNCIONAL
    
    //OOP
    //publico, privado, protegido, default
    //nivel de acceso valor de retorno nombre de la funcion
    //{cuerpo de la funcion}
}
