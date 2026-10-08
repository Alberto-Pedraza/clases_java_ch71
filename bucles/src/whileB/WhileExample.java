package whileB;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        /**
         * Es una estructura de repetición
         * Recibe una variable para evaluar
         * Ejecuta las instrucciones dentro de él mientra se continúe cumpliendo una condición sobre la variable
         *
         * IMPORTANTE:
         * Actualizar la variable de control, para evitar bucles infinitos
         * Se declara la variable de control fuera del bucle (ejemplo:contador)
         * Evalúa una condición booleana
         *
         * Si ponemos la variable de control al inicio o al final de las instrucciones puede afectar el comportamiento.
         *
         * OPERADOR DE INCREMENTO O DECREMENTO:
         * i++ Esto le va a sumar 1 a la i (primero lee el valor de i y luego le suma)
         * ++i Esto le va a sumar 1 a la i (primero suma y luego lee el valor de i)
         */

        int i = 1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
        /**
         * Try with resources adminstra el cierre de recursos de java como puede ser el scanner.
         */
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Ingresa qué número factorial quieres");
            int num = scan.nextInt();
            int factorial = 1;
            int count = 1;

            while (count<=num){
                factorial *= count;
                System.out.println("Hasta el momento la multiplicación va así: "+factorial);
                count++;
            }
            System.out.println("El valor del factorial "+num+"! es "+factorial);
        }catch (Exception e){
            System.out.println("Algo salió mal");
        }
    }
}
