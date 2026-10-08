package org.generation.hashsetC;

import java.util.HashSet;
import java.util.Locale;

public class MethodsHashSet {
    /**
     * Metodo de registro:
     * 1. Recibe como parámetros un hashset para llevar el registro
     *    Nombre que va a ser registrado en el hashset
     * 2. No retorna nada
     * 3. Debe mostrar en terminal lo siguiente:
     *      Si el usuario no ha sido registrado antes "El usuario tal fue registrado"
     *      Si el usuario ya había sido registrado "El usuario tal ya cuenta con un registro"
     */

    public static void logUser (HashSet<String> record, String name){
        String userName = name.toLowerCase();
        if (record.contains(userName)){
            System.out.println("El usuario "+name+" ya cuenta con un registro");
        } else{
            record.add(userName);
            System.out.println("El usuario "+name+" ha sido registrado con éxito");
        }
    }
}
