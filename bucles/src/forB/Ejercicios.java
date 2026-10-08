package forB;

public class Ejercicios {
    public static void main(String[] args) {
        /**
         * EJERCICIOS
         * 1. Usar el array del ejemplo y sacar la suma total de todos los números del array
         * 2. Ejercicio FizzBuzz:
         *      -Todo multiplo de 3 se cambia por la palabra Fizz
         *      -Todo multiplo de 5 se cambia por la palabra Buzz
         *      -Todo múltiplo de 3 y 5 se cambia por FizzBuzz
         */

        /**
         * EJERCICIO 1
         */
        int[] numeros = { 42, 17, 83, 5, 91, 36, 74, 28, 63, 11, 55, 97, 24, 68, 3, 79, 46, 14, 88, 31, 72, 9, 61, 25, 94, 50, 37, 81, 19, 66, 7, 43, 89, 12, 58, 34, 76, 21, 95, 48, 16, 70, 29, 85, 4, 53, 62, 18, 99, 40, 27, 73, 10, 87, 35, 64, 22, 92, 51, 6, 78, 13, 45, 86, 30, 59, 96, 23, 71, 8, 54, 39, 82, 15, 67, 26, 90, 49, 32, 75, 20, 57, 98, 44, 69, 33, 84, 1, 60, 47, 77, 38, 93, 56, 2, 80, 41, 65, 52, 100 };

        /*
        int totalSum = 0;
        for(int i=0;i<numeros.length;i++){
            totalSum += numeros[i];
        }
        System.out.println("La suma de todos los números en el array es "+totalSum);
         */


        /**
         * EJERCICIO 2
         */
        /*
        for(int j=1; j<=100; j++){
            if(j%3==0 && j%5==0){
                System.out.println("FizzBuzz");
            } else if (j%3==0) {
                System.out.println("Fizz");
            }else if(j%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(j);
            }
        }
         */

        /**
         * EJERCICIO DE TABLERO DE AJEDREZ
         *      Sencillo
         * @ @ @ @
         * @ @ @ @
         * @ @ @ @
         * @ @ @ @
         *
         * Con condiciones
         *
         * @    @   @   @
         *   @    @   @
         * @    @   @   @
         */

        //SENCILLO
        for(int i=1; i<=8;i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print("| @ ");
            }
            System.out.println("");
        }

        System.out.println("TABLERO CON CONDICIONES");
        //CON CONDICIONES
        for(int i=1; i<=8;i++) {
            for (int j = 1; j <= 8; j++) {
                if(i%2==0){
                    if(j%2==0){
                        System.out.print("| @ ");
                    } else{
                        System.out.print("|   ");
                    }
                }else {
                    if(j%2==0){
                        System.out.print("|   ");
                    } else{
                        System.out.print("| @ ");
                    }
                }
            }
            System.out.println("");
        }

        //Con operador ternario


    }
}
