package org.generation.hashmapC;

import java.util.HashMap;

public class MethodsHashMap {
    /**
     * Contador de palabras
     * 1. Crear un método que reciba una frase tipo String
     * 2. Debe retornar un hashmap
     * 3. El hash map va a estar formado por:
     *      - Cada palabra única de la frase como llave
     *      - El número de veces que aparece esta palabra como valor
     * 4. Recomendaciones:
     * Usar el método split:
     * https://www.w3schools.com/java/ref_string_split.asp
     * Usar ciclos o getordefault:
     * https://www.w3schools.com/java/ref_hashmap_getordefault.asp
     */

    public static HashMap<String,Integer> wordCounter(String phrase){
        HashMap<String,Integer> list = new HashMap<>();
        String[] keys = phrase.split(" ");
        for(String key : keys){
            if (list.containsKey(key)){
                Integer currentValue = list.get(key);
                list.put(key,currentValue+1);
            }else{
                list.put(key,1);
            }
        }
        return list;
    }

    public static HashMap<String,Integer> wordCounter2(String phrase){
        HashMap<String,Integer> list = new HashMap<>();
        String[] keys = phrase.split(" ");
        for(String key: keys){
            Integer count = list.getOrDefault(key,0);
            list.put(key,count+1);
        }
        return list;
    }
}
