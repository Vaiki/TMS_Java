package com.company.animal;

public class Vet {

    void treatAnimal(Animal animal) {
        System.out.println("Eat " + animal.getFood() + "\nLives on " + animal.getLocation() + "\n");
    }

    public static void main(String[] args) {

        Animal[] any = {new Cat("fish", "Gagarina st. 17"),
                new Dog("meat", "Masherova st. 33"),
                new Horse("hay", "Ratomka village")};

        for (Animal animal : any) {
            new Vet().treatAnimal(animal);

        }
    }

}
