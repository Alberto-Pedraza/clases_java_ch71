package whileB;

import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        /**
         * EJERCICIOS
         *
         * 1. Hacer una serie hasta el número ingresado por el usuario
         * 2. Suma acumulativa
         *      Instrucciones
         *      - Pedir al usuario que ingrese un número
         *      - Ir sumando los números que ingresa el usuario
         *      - El programa solo debe terminar si el usuario ingresa un 0
         *      - Al finalizar la captura de números mostrar el resultado de la suma de todos los números que ingresó el usuario
         *
         * 3. Adivinar el número secreto
         *      Instrucciones:
         *      - Pedirle al usuario que ingrese un número
         *      - Si no es el número correcto repetir
         *      - Si es el número correcto terminamos
         */

        /**
         * PRIMER EJERCICIO
         */
//        try(Scanner scan = new Scanner(System.in)){
//            System.out.println("¿Hasta qué número quieres que se imprima la serie de números naturales?");
//            int limit = scan.nextInt();
//            int i = 1;
//            while (i<=limit){
//                System.out.println(i);
//                i++;
//            }
//        }catch (Exception e){
//            System.out.println("Algo salió mal");
//        }

        /**
         * SEGUNDO EJERCICIO
         */

//        try(Scanner scan1 = new Scanner(System.in)){
//            int sumResult = 0;
//            int userNumber = 1;
//            while(userNumber!=0){
//                System.out.println("Ingresa un número para sumarlo. Si ingresas 0 el proceso se detendrá");
//                userNumber = scan1.nextInt();
//                sumResult += userNumber;
//            }
//            System.out.println("El resultado final de la suma es:"+sumResult);
//        }catch (Exception e){
//            System.out.println("Algo salió mal");
//        }

        /**
         * TERCER EJERCICIO
         */
        try(Scanner scan2 = new Scanner(System.in)){
            int secretNum = (int)(Math.random()*(101));
            System.out.println("Adivina el número secreto, es un entero entre 0 y 100");
            int userTry = scan2.nextInt();
            while (userTry!=secretNum) {
                System.out.println("Ese no es el número secreto");
                if (userTry < secretNum) {
                    System.out.println("El número secreto es mayor a " + userTry);
                } else {
                    System.out.println("El número secreto es menor a " + userTry);
                }
                System.out.println("Ingresa otro número");
                userTry = scan2.nextInt();
            }
            System.out.println("Correcto, el número secreto es "+secretNum);
        }catch (Exception e){
            System.out.println("Algo salió mal");
        }


    }
}
