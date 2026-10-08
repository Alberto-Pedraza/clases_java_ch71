package org.generation.adoption.exceptions;

// https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html

public class InvalidData extends Exception{
    /**
     * Método constructor para recibir el mensaje y fijarlo en el atributo de la super clase
     * Exception
     * @param message type String
     */
    public InvalidData(String message){
        super(message);
    }


}
