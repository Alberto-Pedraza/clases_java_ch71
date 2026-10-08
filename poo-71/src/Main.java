import org.generation.adoption.exceptions.InvalidData;
import org.generation.adoption.interfaces.Adoptable;
import org.generation.adoption.models.Perro;
import org.generation.adoption.models.Pet;
import org.generation.adoption.models.Tortuga;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * QUÉ VAMOS A VER EN LA CLASE DE HOY 22 DE SEP 2026
         *
         * Clase abstracta: qué es y para qué sirve
         * Cómo generar documentación de java usando javadoc (css y html)
         * Interfaces: qué son y para qué sirven (diferencia entre herencia e implementación)
         * Cómo heredar
         * Sobrecarga de métodos (durante el tiempo de compilación)
         * Override de métodos (durante el tiempo de ejecución)
         * Excepciones y cómo propagarlas
         * Polimorfismos y encapsulación
         */

        //Creando un arraylist de tipo pet
        ArrayList<Pet> mascotas = new ArrayList<>();

        try{
            mascotas.add(new Tortuga("Juan",60,"verde",4,"Verde"));
            mascotas.add(new Tortuga("Lista",20,"café",4,"boba"));
            mascotas.add(new Perro("Kàchi",5,"blanco",4,false));
            mascotas.add(new Perro("Justino",10,"gris",4,true));
        }catch(InvalidData e){
            System.out.println("Problemas al crear la mascota "+e.getMessage());
        }


        for(Pet mascota : mascotas){
            mascota.makeSound();
            mascota.showDetails();
            if(mascota instanceof Adoptable){
                ((Adoptable) mascota).adopt();
            }
        }
    }
}
