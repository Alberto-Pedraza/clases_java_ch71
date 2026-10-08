package org.generation.arrays;

import java.util.Arrays;

public class ArraysC {
    public static void main(String[] args) {
        /**
         * REFERENCIAS
         * https://www.geeksforgeeks.org/java/collections-class-in-java/
         * https://www.w3schools.com/java/java_collections.asp
         */

        /**
         * Array primitivo
         * Es un tipo de dato primitivo
         * Características:
         * - Es una estructura de datos ordenada
         * - Tiene un índice
         * En Java
         * - Su tamaño no es modificable, si iniciamos un array con 5 espacios solo podemos ocupar 5 espacios
         * - Son de un solo tipo de dato
         *
         * También usan notación corchete para acceder a sus valores
         * A TENER EN CUENTA: No tiene métodos para trabajar con él.
         */

        //Inicializando un array vacío con 10 espacios
        int[] ages = new int[10];
        ages[0] = 5;
        ages[2] = 4;
        // ages[11] = 10; Esto no va a resultar bien porque no existe un elemento con índice 11 en el arreglo que se definió
        System.out.println(ages[5]);

        //Ver array completo
        System.out.println(Arrays.toString(ages));

        //Cómo inicializar un array con contenido
        String[] names = {"Alberto","Alexander","Aslan","Diana"};
        System.out.println(Arrays.toString(names));

        //Cambiar un elemento o dos
        names[0] = "Laberto";
        System.out.println(Arrays.toString(names));

        //Ver el tamaño de un array usando .length
        System.out.println(names.length);
    }
}
