package org.generation.arrays;

public class MethodsArray {
    public int[] multiplos(int[] arrNumbers, int multiplo){
        //1. Obtener el tamaño del array base
        int size = arrNumbers.length;
        //2. Crear un array nuevo vacío
        int[] result = new int[size]; //También se podría ahorrar la definición de size y poner el arrNumbers.length dentro de new int[]

        //3. Recorrer el array de entrada para poder multiplicar cada elemento por el múltiplo
        for (int i=0;i<size;i++){
            //Guardando el resultado de la operación en cada espacio del array nuevo
            result[i] = arrNumbers[i]*multiplo;
        }
        return result;
    }

    /**
     * EJERCICIO
     * Un método que reciba un array de números y devuelva el promedio del array
     */
    //Hacemos que devuelva un número con punto decimal y reciba como entrada un array de números enteros
    public Double meanOfArray(int[] numeros){
        //Creamos la variable que va a almacenar la suma total de los elementos del array
        Double sum = 0.0;
        //Se hace un ciclo for para ir sumando cada uno de los números.
        for (int i = 0; i<numeros.length ; i++){
            sum += (double) numeros[i];
        }
        return sum/numeros.length;
    }
}
