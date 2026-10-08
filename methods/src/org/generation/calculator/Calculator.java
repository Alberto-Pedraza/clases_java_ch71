package org.generation.calculator;

public class Calculator {
    //Esto de abajo es la firma del método
    public int sumar(int a, int b){
        //LO QUE ESTÁ DENTRO DE LAS LLAVES ES EL CUERPO DEL MÉTODO
        return a+b;
    }

    public int multiplicar(int a, int b){
        return a*b;
    }

    //Los métodos estáticos son los que se ejecutan desde la clase, no es necesario usar un objeto para utilizarlos
    public static Double getPi(){
        return 3.141592654;
    }
     public static Double getEuler(){
        return 2.7182818284;
     }

    /**
     * EJERCICIOS:
     *
     * Hacer dos métodos de instancia:
     * 1. Que divida dos números enteros y retorne un número decimal (float o double)
     * 2. Que saque la potencia de dos números dados,siendo el primero la base y el segundo el exponente.
     *
     * Hacer dos métodos estáticos:
     * 1. Uno que retorne el valor de phi (número áureo)
     * 2. Uno que imprima en pantalla una serie de números múltiplos de 5, como parámetro recibe el límite de elementos de la serie.
     */

    //https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html
    public Double dividir(int a, int b){
        //Si se reciben dos enteros y queremos de resultado una variable con decimales, es necesario castear a las variables
        // double ad = a;
        // double bd = b;
        return ((double)a)/((double)b);
    }

    public int potencia(int a, int b){
        int totalPow = 1;
        for(int i=1; i<=b; i++){
            totalPow *= a;
        }
        return totalPow;
    }

    public static Double getPhi(){
        return 1.618033988;
    }

    //Creo que se tiene que modificar porque sale nomás la dirección en memoria
    public static int[] multFiveSeries (int a){
        int[] serie = new int[a];
        for(int i = 0; i<a;i++){
            serie[i]=5*(i+1);
        }
        return serie;
    }

}
