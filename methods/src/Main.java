import org.generation.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/tutorial/java/package/namingpkgs.html documentación sobre nomenclatura para paquetes

        //Crear una instancia de una clase o crear un objeto.
        Calculator calc = new Calculator();

        //Para ver el resultado de su uso se puede crear una variable o imprimir en pantalla. En este caso se imprime el resultado en pantalla
        System.out.println(calc.sumar(2 , 3));
        System.out.println(calc.multiplicar(3,5));

        //Para llamar a un método estático no hay necesidad de instanciar la clase, aunque si ya se hizo para usar los otros métodos, se puede utilizar. Abajo hay ejemplo de ambas situaciones.
        System.out.println(calc.getEuler());
        System.out.println(Calculator.getPi());

        //Pruebas para los ejercicios
        System.out.println("============Pruebas de los ejercicios=============");
        System.out.println(calc.dividir(35,10));
        System.out.println(calc.potencia(2,6));
        System.out.println(Calculator.multFiveSeries(6));
    }
}