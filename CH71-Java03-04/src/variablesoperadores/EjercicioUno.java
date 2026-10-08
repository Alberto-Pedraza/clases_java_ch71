package variablesoperadores;

public class EjercicioUno {
    public static void main(String[] args) {
        /**
         *Ejercicio: Validación de perfil de un participante
         *Crear un programa en Java que registre información de un participante y determine si cumple las
         * condiciones necesarias para participar en una actividad especial del proyecto.
         *El programa debe almacenar:
         * Nombre → String
         * Edad → int
         * Promedio → double
         * ¿Tiene experiencia previa? → boolean
         * Número de proyectos realizados → int
         * Inicial del apellido → char
         * Reglas del ejercicio
         * El participante cumple con el perfil cuando:
         *
         * Condición 1
         *Tiene 18 años o más.
         *
         * Condición 2
         *Tiene un promedio de 80 o superior.
         *
         * Condición 3
         *Además, debe cumplir al menos una de estas condiciones:
         *Tiene experiencia previa.
         * Ha realizado 2 o más proyectos.
         *
         * Una vez que funcione, tenemos estos cambios sin modificar la estructura del programa:
         * Cambiar los datos para que:
         *No tenga experiencia, pero haya realizado 2 proyectos.
         * int edad = 17;
         *double promedio = 75.5; */

        String nombreParticipante = "Alberto";
        int edadParticipante = 28;
        double promedioParticipante = 91.6;
        boolean prevExp = true;
        int numProyects = 1;
        char inicialApellido = 'P';
        boolean cond1 = edadParticipante>=18;
        boolean cond2 = promedioParticipante>=80;
        boolean cond3 = (prevExp || numProyects>=2);

        System.out.println("¿El participante "+nombreParticipante+" "+inicialApellido+" puede participar en la actividad especial del proyecto?: "+(cond1 && cond2 && cond3));

        prevExp = false;
        numProyects = 2;
        edadParticipante = 17;
        promedioParticipante = 75.5;

        System.out.println("¿El participante "+nombreParticipante+" "+inicialApellido+" puede participar en la actividad especial del proyecto?: "+( edadParticipante>=18 && promedioParticipante>=80 && (prevExp || numProyects>=2) ) );

    }
}
