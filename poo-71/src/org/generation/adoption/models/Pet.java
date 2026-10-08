package org.generation.adoption.models;

import org.generation.adoption.exceptions.InvalidData;

/**
 * Una clase abstracta es una clase que sirve de molde para otras clases.
 * Molde para moldes
 * Importante:
 * <ul>
 *     <li>No puede ser instanciada (No podemos crear objetos)</li>
 *     <li>Pueden tener métodos abstractos
 *          <p>
 *              Los métodos abstractos solo declaran la firma, y la clase que herede a la clase abstracta se tiene que encargar de completarlos. Es obligatorio para la subclase implementar estos métodos
 *              Indica qué vamos a hacer pero no el cómo.
 *          </p>
 *     </li>
 *     <li>Puede tener atributos, propiedades</li>
 *     <li>Puede tener métodos normales</li>
 *     <li>Puede tener constructor</li>
 * </ul>
 */
public abstract class Pet {
    /**
     * Propiedades o atributos
     * Son características del objeto
     * Nota: Las clases no ocupan espacio en memoria.
     * Cuando creamos el objeto, se reserva un espacio en memoria para llenar las características
     */

    private String name;
    private Integer age;
    private String color;
    private Integer numPatas;

    /**
     * MÉTODO CONSTRUCTOR
     * <p>Es un método especial que ayuda a definir el estado inicial del objeto</p>
     * Características:
     * <ul>
     *     <li>Tiene el mismo nombre de la clase, igualito. En este caso, Pet</li>
     *     <li>Se ejecuta cuando usamos la palabra reservada new</li>
     *     <li>No retorna nada y no es necesario ponerle void</li>
     * </ul>
     */

    public Pet(String name, Integer age, String color, Integer numPatas) throws InvalidData{
        //Propagamos la excepción definida en los métodos setName y setAge para que a la hora de construir al objeto también se apliquen las excepciones. Esto se hace cambiando la parte comentada por la utilización del método que ya tiene la excepción.
//        this.name = name;
        setName(name);
//        this.age = age;
        setAge(age);
        this.color = color;
        this.numPatas = numPatas;
    }

    /**
     * Getters y Setters
     * Son métodos que permiten obtener la información de un atributo o fijar un valor a un atributo
     *
     * El getter retorna algo y no recibe parámetros
     * El setter recibe parámetros pero no retorna nada
     */

    /**
     * Retorna el valor del atributo name
     * @return tipo String name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Fija un nuevo valor al atributo name
     * @param newName tipo String
     */
    public void setName(String newName) throws InvalidData {
        // https://www.w3schools.com/java/ref_string_trim.asp
        if(newName==null || newName.trim().isEmpty())
            throw new InvalidData("El nombre no puede estar vacío o ser puros espacios.");
        this.name = newName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws InvalidData {
        if(age<=0 || age==null)
            throw new InvalidData("La edad tiene que ser mayor a cero o no estar vacía.");
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(Integer numPatas) {
        this.numPatas = numPatas;
    }

    /**
     * Método abstracto
     *
     * Los métodos abstractos solo se pueden crear en clases abstractas o interfaces
     * <p>
     *     Son métodos que definen qué se tiene que hacer, pero no cómo se hace.
     *     Esto quiere decir que nos brindan la firma del método sin el body.
     * </p>
     * <p>
     *     Las clases que heredan la clase abstracta se verán obligadas a implementar y complementar el método abstracto
     * </p>
     */
    public abstract void makeSound();

    /**
     * Método abstracto
     *
     * Los métodos abstractos solo se pueden crear en clases abstractas o interfaces
     * <p>
     *     Son métodos que definen qué se tiene que hacer, pero no cómo se hace.
     *     Esto quiere decir que nos brindan la firma del método sin el body.
     * </p>
     * <p>
     *     Las clases que heredan la clase abstracta se verán obligadas a implementar y complementar el método abstracto
     * </p>
     */
    public abstract void showDetails();


}
