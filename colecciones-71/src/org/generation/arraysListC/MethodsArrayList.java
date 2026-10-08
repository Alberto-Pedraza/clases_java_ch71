package org.generation.arraysListC;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodsArrayList {
    //Método que reciba un arraylist de enteros y saque el total
    public static Integer getTotal(ArrayList<Integer> numbers){
        Integer total = 0;
        for (Integer number : numbers){
            total += number;
        }
        return total;
    }

    /**
     * EJERCICIOS:
     * 1. Hacer un método que va a retornar un arraylist de enteros, no recibe parámetros, con Scanner captura n cantidad de calificaciones del usuario.
     * Usar ciclos e ir agregando cada elemento ingresado por el usuario en el arraylist.
     * Si pone un número negativo se acaba el ciclo
     *
     * 2. Un método que reciba como parámetro un arraylist de enteros y retorne el valor promedio de la suma de todos los elementos float double.
     *
     * 3. Un método que reciba como parámetro un arraylist de enteros y retorne el número más grande dentro del arraylist (Usar ciclos).
     */

    //EJERCICIO 1
    public static ArrayList<Integer> scoreCapture(){
        ArrayList<Integer> scoreList = new ArrayList<>();
        Integer score;
        try (Scanner getScore = new Scanner(System.in)){
            System.out.println("Ingresa las calificaciones redondeadas a enteros que quieres almacenar, para terminar la lista ingresa un número negativo.");
            do{
                score = getScore.nextInt();
                scoreList.add(score);
            }while (score>=0);
        }
        scoreList.remove(scoreList.size()-1);
        return scoreList;
    }

    //EJERCICIO 2
    public static Double getAverage(ArrayList<Integer> scores){
        Integer totalSum = getTotal(scores);
        Double Average = totalSum.doubleValue() / scores.size();
        return Average;
    }

    //EJERCICIO 3
    public static Integer getMaxGrade(ArrayList<Integer> grades){
        Integer max = 0;
        for (Integer grade : grades){
            if(max < grade){
                max = grade;
            }else {
                continue;
            }
        }
        return max;
    }
}