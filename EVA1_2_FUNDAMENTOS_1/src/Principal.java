/*
 * Indentificar elementos básicos del lenguaje en Java
 */

/**
 *
 * @author Ángel Vargas Casavantes - 18550627
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TIPO DE DATO - NOMBRE DE LA VARIABLE | CONSTANTE | IDENTIFICADOR
        int iEdad; //Identficador valido
        int _iEdad; //Inicia con _ identificador válido
        int iEdad25; //Números no al inicio, identificador válido
        int iedad; //sensible a marúsculas y minúsculas
        int iEd$; //Signo de pesos (Java lo acepta)
        int String; //No es recomdable, String es un tipo de dato de Java
        //--------
        //EJEMPLOS ERRONEOS DE INDENTIFICADORES
        int 25edad;
        int tu edad;
        int iEdad;
        int algo-mas; //el "-" es un operador que representa una resta aritmética
        int float;
        
    }
    
}

class Algo{
    
}

class Algo25{
    
}

class _Algomas{
    
}

class $algomas{}
class algo mas{}
class algo-mas{}
class 25algomas{}
class algo{}