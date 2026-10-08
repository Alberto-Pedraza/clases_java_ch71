package org.generation.adoption.models;

import org.generation.adoption.exceptions.InvalidData;

public class Perro extends Pet{
    private boolean comeConfleisConCuchara;

    public Perro(String name, Integer age, String color, Integer numPatas, boolean comeConfleisConCuchara) throws InvalidData {
        super(name,age,color,numPatas);
        this.comeConfleisConCuchara = comeConfleisConCuchara;
    }

    public boolean isComeConfleisConCuchara() {
        return comeConfleisConCuchara;
    }

    public void setComeConfleisConCuchara(boolean comeConfleisConCuchara) {
        this.comeConfleisConCuchara = comeConfleisConCuchara;
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName()+" dice woof");
        if(this.comeConfleisConCuchara){
            System.out.println("Aunque a veces, por las noches, parece que hace otros sonidos...");
        }
    }

    @Override
    public void showDetails() {
        System.out.println("El/la perr@ "+this.getName()+", es de color "+this.getColor()+", tiene "+this.getAge()+" años y "+this.getNumPatas()+" patas.");
        if(this.comeConfleisConCuchara){
            System.out.println("También come confleis con cuchara...");
        }
    }
}
