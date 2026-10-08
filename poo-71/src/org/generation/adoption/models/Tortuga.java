package org.generation.adoption.models;

import org.generation.adoption.exceptions.InvalidData;
import org.generation.adoption.interfaces.Adoptable;

/**
 * La palabra reservada para heredar es Extends
 */
public class Tortuga extends Pet implements Adoptable {
    private String breed;

    /**
     * Método constructor de una subclase
     * <p>
     *     En este método se reciben como parámetros también los atributos heredados de la superclase, para luego ser asignados mediante el método super()
     * </p>
     * @param name  Atributo heredado tipo String
     * @param age  Atributo heredado tipo Integer
     * @param color  Atributo heredado tipo String
     * @param numPatas  Atributo heredado tipo Integer
     * @param breed  Atributo propio tipo String
     */
    public Tortuga(String name, Integer age, String color, Integer numPatas, String breed) throws InvalidData {
        super(name,age,color, numPatas);
        this.breed= breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Override vs Overload
     * Override es cuando una subclase sobreescribe un método heredado usando exactamente la misma firma.
     *
     * Overload es cuando tenemos un método con el mismo nombre varias veces, pero que recibe diferente cantidad de parámetros o en diferente orden.
     */

    @Override
    public void makeSound() {
        System.out.println("La tortuga "+this.getName()+" hace AAAAaaaaah");
    }

    @Override
    public void showDetails() {
        System.out.println("La tortuga "+this.getBreed()+", llamada "+this.getName()+", es de color "+this.getColor()+", tiene "+this.getAge()+" años y "+this.getNumPatas()+" aletas o patas.");
    }

    @Override
    public void adopt() {
        System.out.println("Felicidades, "+this.getName()+" fue adoptad@. Trata a tu nueva mascota con cariño");
    }
}