package doWhileB;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        /**
         * EJERCICIOS
         * 1.Mostrar al usuario un menú de opciones
         *      Ejemplo:
         *      1 Saludar
         *      2 Decir adiós
         *      3 Recomendar canción
         *      4 Salir
         *  Que siga apareciendo el menú hasta que no escojan la opción de salir.
         *
         *
         * 2. Usar el ejercicio del cajero
         *      - Añadir la opción de salir
         *      - Mientras el usuario no seleccione esta opción, puede seguir ejecutando operaciones
         *      - Todo se debe actualizar mientras se ejecutan las operaciones
         *      - Al salir mostrar el saldo final
         *      Extra: Poner si tiene saldo a favor o en contra al final de las operaciones
         *      Si el saldo es positivo, es a favor. Si el saldo es negativo, es en contra
         */

        Scanner scan = new Scanner(System.in);

        /**
         * EJERCICIO 1
         */

//        int option;
//
//        do{
//            //Menú de opciones impreso
//            System.out.println("¿De qué te gustaría recibir una recomendación?");
//            System.out.println("1. De una canción");
//            System.out.println("2. De un grupo musical");
//            System.out.println("3. De una película");
//            System.out.println("4. De una serie");
//            System.out.println("5. Salir");
//            System.out.println("Elija alguna de nuestras opciones.");
//
//            //Recibimos la opción del usuario
//            option = scan.nextInt();
//            switch (option){
//                case 1:
//                    //Recomendación de canción
//                    System.out.println("Creo que te puede gustar route no.3 shibuya - RYUSENKEI ft. Yasuyuki Horigome");
//                    System.out.println("");
//                    break;
//                case 2:
//                    //Recomendación de grupo musical
//                    System.out.println("¿Conóces a Hiatus Kaiyote? Si no, espero que sean una grata sorpresa");
//                    System.out.println("");
//                    break;
//                case 3:
//                    //Recomendación de película
//                    System.out.println("Una de mis nuevas películas favoritas es Project Hail Mary");
//                    System.out.println("");
//                    break;
//                case 4:
//                    //Recomendación de una serie
//                    System.out.println("Con mente abierta dale una oportunidad a Atlanta");
//                    System.out.println("");
//                    break;
//                case 5:
//                    //Mensaje de salida
//                    System.out.println("Espero que te gusten mis recomendaciones, vuelve pronto");
//                    System.out.println("");
//                    break;
//                default:
//                    //Por si escogen algo distinto a las opciones dadas
//                    System.out.println("Te recomiendo ir al oculista, creo que no viste bien qué número presionaste");
//                    System.out.println("");
//                    break;
//            }
//        }while(option!=5);

        /**
         * EJERCICIO 2
         */
        double saldo = 1000.0; //Saldo inicial
        int optionCajero;

        do{
            //Mostrar un menú y pedimos al usuario que elija una opción (1 al 4)
            System.out.println("Bienvenido al cajero automático de Generation. ¿Qué opción desea realizar?");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar en efectivo");
            System.out.println("3. Retirar en efectivo");
            System.out.println("4. Salir");
            System.out.println("Elija alguna de nuestras opciones.");

            optionCajero = scan.nextInt();

            //Usamos switch para elegir qué opción ejecutar según lo que elige el usuario
            switch (optionCajero){
                case 1: //Muestra el saldo actual
                    System.out.println("Tu saldo actual es: $"+saldo);
                    System.out.println("");
                    break;
                case 2: //Depositar dinero
                    System.out.println("Ingresa la cantidad a depositar:");
                    int deposito =  scan.nextInt();
                    saldo += deposito; //Suma y asigna
                    System.out.println("Has depositado $"+deposito+" pesos. Nuevo saldo: $"+saldo);
                    System.out.println("");
                    break;
                case 3: //Retiro
                    //Con el if verificamos que lo que quiere retirar no sea más que el saldo que tiene
                    System.out.println("Ingresa la cantidad a retirar:");
                    int retiro = scan.nextInt();
                    if (retiro<=saldo){
                        saldo -= retiro;//Resta y asigna
                        System.out.println("Has retirado $"+retiro+" pesos. Tu nuevo saldo es: $"+saldo);
                    } else{
                        System.out.println("Saldo insuficiente. Póngase a chambiar");
                    }
                    System.out.println("");
                    break;
                case 4: //Salir
                    System.out.println("Gracias por usar el cajero de Generation. Vuelva pronto");
                    break;
                default:
                    System.out.println("Aaaah, chistositoooo.");
                    System.out.println("Deberías chambear de comediante para que tengas más saldo en el cajero");
                    System.out.println("");
                    break;
            }//Cierre del switch
        }while(optionCajero!=4);

        scan.close();
    }
}
