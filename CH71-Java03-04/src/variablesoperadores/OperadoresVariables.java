package variablesoperadores;

public class OperadoresVariables { //Atajo psvm+Tab genera el inicio que está en la siguiente línea
    public static void main(String[] args) {
        //Atajo para imprimir en consola sout+Tab

        //1. Declarar y asignar variables
        int edad = 28; //Entero
        String nombre = "Laberto"; //Texto
        System.out.println("Hola "+nombre+", no se nota que tienes "+edad+" años");

        //2. Tipos de datos primitivos
        boolean activo =  true; // true o false
        byte nivel = 127; // Hasta el 127 o hasta el -128 (negativo)
        char inicial = 'A'; //Uso de comillas simples.  https://symbl.cc/es/unicode-table/
        short puntos = 32767; // Entero corto 32767 a -32768
        long población = 78000234L; //Entero largo (al final se agrega la letra L)
        float precio = 59.99f; // Decimal corto (se agrega la f al final)
        double pi = 3.141592653; // Decimal largo
        System.out.println("Tipos de datos primitivos: "+activo+", "+nivel+", "+precio);

        //3. Sintaxis básica para definir variables
        int numero = 12; // tipo + nombre + valor
        double promedio ; // Podemos declarar la variable sin asignarle el valor
        promedio = 9.9; // Ahora sí asignamos el valor.

        System.out.println("El promedio de la CH71 es "+promedio+" porque son muy aplicados");

        //4. Conversión de tipos
        int entero = 10;
        double noEntero = entero; // Conversión implícita int => double
        System.out.println("El entero es ahora "+noEntero+" por la conversión implícita.");

        double decimalLargo = 10.89;
        int noDecimal = (int) decimalLargo; // Conversión explícita (llamada casting o casteo)
        System.out.println("El decimal corto ahora es "+noDecimal+", por conversión explícita");

        //5. Operadores aritméticos
        int suma = 5+3;
        int resta = 10-2;
        int multiplicacion = 2*4;
        double division = 5/3;
        int modulo = 20%3;
        System.out.println("División: "+division+" Módulo: "+modulo);

        //6. Operadores compartativos
        int valor = 10 , otro= 20;
        System.out.println("¿Es la variable valor igual a la variable otro? valor == otro : "+(valor == otro)); // Igualdad
        System.out.println("¿Es la variable valor diferente a la variable otro? valor != otro : "+(valor != otro)); // Diferente
        System.out.println("¿Es la variable valor menor que la variable otro? valor < otro : "+(valor < otro)); // Menor que
        System.out.println("¿Es la variable valor mayor o igual que la variable otro? valor >= otro : "+(valor >= otro)); // Mayor o igual que

        //7. Operadores lógicos
        boolean condicional1 = true;
        boolean condicional2 = false;
        System.out.println("AND: condicional1 && condicional2 => "+(condicional1 && condicional2));
        System.out.println("OR: condicional1 || condicional2 => "+(condicional1 || condicional2));
        System.out.println("NOT: !condicional1 => "+(!condicional1));

        //8. Expresiones lógicas
        int edadPersona = 150;
        boolean puedeVotar = (edadPersona >= 18) && (edadPersona < 100);
        System.out.println("¿Puede votar el ansiano?: "+ puedeVotar);

        //El ejercicio sobre lo que vimos está en la clase EjercicioUno





    } //Cierre del método
} //Cierre de la clase
