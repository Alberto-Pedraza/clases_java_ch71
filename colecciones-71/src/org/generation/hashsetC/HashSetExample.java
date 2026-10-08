package org.generation.hashsetC;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        /**
         * Es una implementación de un set en java
         * Javi Collection API
         * https://www.w3schools.com/java/java_hashset.asp
         *
         * Set:
         *      Es una estructura de datos que no permite duplicados
         *      Es una estructura de datos desordenada, no garantiza un orden
         *      Se usa para registrar elementos y verificar si existen
         */

        //Crear un Hashset
        HashSet<String> names = new HashSet<>();
        //Agregando elementos
        names.add("Alberto");
        System.out.println(names.add("Javier"));
        names.add("Jaime");
        System.out.println(names.add("Alberto"));
        System.out.println(names);

        //Comprobando si existe el elemento con contains
        System.out.println(names.contains("Alberto")); // true
        System.out.println(names.contains("alberto")); // false

        //Eliminando elementos
        names.remove("Jaime");
        System.out.println(names);

        //for mejorado sí permite obtener cada elemento por separado
        for(String name : names){
            System.out.println(name);
        }
    }
}
