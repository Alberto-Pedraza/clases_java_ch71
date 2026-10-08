package forB;

public class Ejemplos {
    public static void main(String[] args) {
        /**
         * For
         * Bucle que sirve para cuando sabes cuántas iteraciones necesitas, controlado
         * Bucle definido
         * Partes que lo conforman:
         *      1. Inicialización de la variable de control
         *      2. Condición de paro
         *      3. Incremento de la variable
         */

        /*for(int i=0; i<=1000; i +=5){
            System.out.println(i);
        }*/
        int[] numeros = { 42, 17, 83, 5, 91, 36, 74, 28, 63, 11, 55, 97, 24, 68, 3, 79, 46, 14, 88, 31, 72, 9, 61, 25, 94, 50, 37, 81, 19, 66, 7, 43, 89, 12, 58, 34, 76, 21, 95, 48, 16, 70, 29, 85, 4, 53, 62, 18, 99, 40, 27, 73, 10, 87, 35, 64, 22, 92, 51, 6, 78, 13, 45, 86, 30, 59, 96, 23, 71, 8, 54, 39, 82, 15, 67, 26, 90, 49, 32, 75, 20, 57, 98, 44, 69, 33, 84, 1, 60, 47, 77, 38, 93, 56, 2, 80, 41, 65, 52, 100 };

        /*for(int j=0;j<numeros.length; j++){
            if(numeros[j]%2==0){
                System.out.println("El número "+numeros[j]+" es par");
            }else{
                System.out.println("El número "+numeros[j]+" es impar");
            }
        }*/

        /**
         * For anidados
         * El tiempo de ejecución crece de manera exponencial, por eso se intenta evitar su uso a lo que sea únicamente necesario
         */

        for(int i=0;i<=3;i++){
            System.out.println("Vuelta número "+i+" del for principal");
            for(int j=1;j<6;j++){
                System.out.println("Vuelta número "+j+" del for anidado");
            }
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println("");
        }
    }
}
