package controlflujo;

//1. Importamos el Scanner
import java.util.Scanner;

public class FlujoControl {
    public static void main(String[] args) {
        /**
         * CICLO PARA VERIFICAR SI UN PACIENTE ES MENOR DE EDAD
         * 1. Pedimos los datos: (Alberto, 28)
         * 2. Almacenamos el dato en una variable
         * 3. Aplicamos condiciones, si el paciente es menor de edad no se le puede brindar atención, solo valoración
         * 3.1 Si el paciente es adulto recibe valoración y atención médica.
         * */
        int edadPaciente = 31;
        if (edadPaciente<18){
            System.out.println("No entregamos drogas a menores");
        } else{
            System.out.println("Pásele a la revisión");
        }

        /// ==========================================================================

        //Validar la hora de cita, debe estar dentro del horario de atención
        int cita = 20;
        if ( (cita>=9 && cita<14) || (cita>=15 && cita <18) ){
            System.out.println("Tu cita se agendó con éxito");
        } else{
            System.out.println("Cita fuera del horario de atención");
        }

        ///===========================================================================

        /**
         * Scanner
         * Método de Java que nos permite solicitar al usuario cualquier tipo de dato
         * 1. Importar la clase a nuestra clase
         * 2. Instanciar un nuevo objeto de tipo Scanner
         * */

        //1. Importamos el Scanner hasta arriba del documento
        //2. Instanciamos un nuevo scanner
        Scanner src = new Scanner(System.in); //Le damos un nuevo nombre a la instancia que ocuparemos
        //Damos contexto al usuario
        System.out.println("Hola y bienvenido al sitio de la CH71");
        System.out.println("Ingresa tu nombre");
        //Guardamos el objeto scanner instanciado en una variable, según el tipo de dato que solicitemos
        String nombre = src.nextLine();
        //Imprimir el valor de la variable
        System.out.println("Hola "+nombre+", pasa un buen día en la CH71");
        //Podemos reutilizar el scanner para solicitar más información.
        System.out.println("Ingresa tu edad:");
        int edad = src.nextInt();

        //Imprimimos la info completa
        System.out.println(nombre+", tu edad es "+edad+" años.");

        //Por buena práctica debemos cerrar el scanner al terminar de usarlo.
        //src.close();

        ///==========================================================================================
        /**
         *EJERCICIO: CAJERO AUTOMÁTICO
         * Definimos una varible de saldo con un valor de $1000
         * Opción almacenar, que el usuario pueda elegir en el menú.
         * */

        Scanner scan = new Scanner(System.in);
        double saldo = 1000.0; //Saldo inicial
        int almacenar;
        //Mostrar un menú y pedimos al usuario que elija una opción (1 al 4)
        System.out.println("Bienvenido al cajero automático de Generation. ¿Qué opción desea realizar?");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Depositar en efectivo");
        System.out.println("3. Retirar en efectivo");
        System.out.println("4. Salir");
        System.out.println("Elija alguna de nuestras opciones.");

        almacenar = scan.nextInt();

        //Usamos switch para elegir qué opción ejecutar según lo que elige el usuario
        switch (almacenar){
            case 1: //Muestra el saldo actual
                System.out.println("Tu saldo actual es: $"+saldo);
                break;
            case 2: //Depositar dinero
                System.out.println("Ingresa la cantidad a depositar:");
                int deposito =  scan.nextInt();
                saldo += deposito; //Suma y asigna
                System.out.println("Has depositado $"+deposito+" pesos. Nuevo saldo: $"+saldo);
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
                break;
            case 4: //Salir
                System.out.println("Gracias por usar el cajero de Generation. Vuelva pronto");
            default:
                System.out.println("Aaaah, chistositoooo.");
                break;
        }//Cierre del switch

        //Aquí sí cerramos ambos scanners
        src.close();
        scan.close();



    }
}
