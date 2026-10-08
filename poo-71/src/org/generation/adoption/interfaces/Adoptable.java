package org.generation.adoption.interfaces;

public interface Adoptable {
    /**
     * Interfaz
     * Es un contrato que la clase que lo implementa debe seguir
     * Podemos implementar más de una interface por clase
     *
     * Declaran por defecto métodos abstractos
     * La clase que implementa la interfaz se verá obligada a crear y completar los métodos definidos en la interfaz
     *
     * Diferencias con una clase abstracta
     * 1. No tiene atributos
     * 2. No tiene un método constructor
     * 3. No puede tener métodos normales
     */

    void adopt();
}
