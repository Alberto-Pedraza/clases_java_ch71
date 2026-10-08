package controlflujo;

import java.util.Scanner;

public class TicketValidacionAcceso {
    public static void main(String[] args) {
        // Creamos Scanner para recibir información del usuario
        Scanner entrada = new Scanner(System.in);


        // Solicitamos el nombre
        System.out.println("Ingresa tu nombre:");
        String nombre = entrada.nextLine();


        // Solicitamos el tipo de usuario
        System.out.println("Selecciona tu tipo de usuario:");
        System.out.println("1. Administrador");
        System.out.println("2. Editor");
        System.out.println("3. Usuario");


        int tipoUsuario = entrada.nextInt();


        // Solicitamos la edad
        System.out.println("Ingresa tu edad:");
        int edad = entrada.nextInt();


        // Preguntamos si la cuenta está activa
        System.out.println("¿Tu cuenta está activa?");
        System.out.println("1. Sí");
        System.out.println("2. No");

        int opcionCuenta = entrada.nextInt();

        // Convertimos la opción en un valor booleano
        boolean cuentaActiva=false;
        if (opcionCuenta==1){
            cuentaActiva = true;
        } else if(opcionCuenta==2){
            cuentaActiva = false;
        } else{
            System.out.println("Opción de cuenta no válida");
        }

        // ========================================
        // PARTE 1: SWITCH
        // Identificar el tipo de usuario
        // ========================================


        switch (tipoUsuario) {


            case 1:
                System.out.println("Rol: Administrador");
                break;


            case 2:
                System.out.println("Rol: Editor");
                break;


            case 3:
                System.out.println("Rol: Usuario");
                break;


            default:
                System.out.println("Tipo de usuario no válido");
        }

        // ========================================
        // PARTE 2: IF / ELSE
        // Validar acceso
        // ========================================


        if (edad>=18 && cuentaActiva==true) {


            System.out.println("Acceso permitido.");

    
        } else {


            System.out.println("Acceso denegado.");
        }

        // ========================================
        // PARTE 3: OPERADOR ||
        // Detectar situaciones que requieren revisión
        // ========================================

        if (edad<18 || cuentaActiva==false) {


            System.out.println(
                    "Contacta al administrador para revisar tu acceso."
            );
        }

        // Cerramos Scanner
        entrada.close();
    }
}
