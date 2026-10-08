package doWhileB;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        /**
         * DO WHILE
         * Se ejecuta por lo menos una vez
         * Importante:
         *  - Definir la condición que ejecuta el bucle
         *  - Siempre actualizar la variable de condición para no crear un bucle infinito
         */

        Scanner scan = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingresa un número positivo");
            num = scan.nextInt();
        } while(num<=0);

        int counter = 0;
        do{
            System.out.println(counter);
            counter++;
        }while(counter<=10);
        scan.close();
    }
}
