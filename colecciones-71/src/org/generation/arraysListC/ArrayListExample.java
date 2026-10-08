package org.generation.arraysListC;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        /**
         * REFERENCIAS:
         * https://www.w3schools.com/java/java_arraylist.asp
         * https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
         */

        /**
         * Arraylist
         * Clase la Java collection API
         * Combina una lista con un array
         * Las listas en Java tienen la característica que son de tamaño dinámico
         * Nos permite crear un array de tamaño dinámico
         * Respetando las características de un array
         * 1. Cada elemento tiene un índice que empieza en 0
         * 2. Es una colección ordenada
         *
         * Aparte de estás características al ser una clase ya tiene métodos preconstruidos para hacer las operaciones básicas:
         * Agregar elementos, Recuperar elementos y Eliminar elementos.
         */

        /*
         * ! IMPORTANTE
         * Cuando creamos un arraylist el tipo de dato a definir siempre se va a poner como el tipo de dato compuesto o wrapper
         * int ---> Integer
         * float ---> Float
         * boolean ---> Boolean
         */

        //Creando un arraylist
        ArrayList<String> cities = new ArrayList<>();
        //Agregando elementos
        cities.add("CDMX");
        cities.add("Vancouver");
        cities.add("Tokyo");
        System.out.println(cities);
        System.out.println("El tamaño actual del arraylist es es "+cities.size());
        //Agregando un elemento en un índice en específico
        cities.add(1,"Monterrey");
        System.out.println(cities);

        //Obteniendo un elemento
        System.out.println("El elemento en el índice 2 es: "+cities.get(2));
        //Eliminando un elemento
        System.out.println("Eliminando el elemento con índice 2: "+cities.remove(2));
        System.out.println("Eliminando el elemento CDMX: "+cities.remove("CDMX"));
        System.out.println("Ojalá fuera así de fácil");
        System.out.println(cities);

        //Verificando si existe
        System.out.println("Verificando si existe: "+cities.indexOf("CDMX"));
        System.out.println(cities.indexOf("Monterrey"));

        //Recorriendo el ArrayList
        for(int i=0;i<cities.size();i++){
            System.out.println(cities.get(i));
        }

        //Un ciclo for más sencillo
        for(String city : cities){
            System.out.println(city);
        }

    }
}
