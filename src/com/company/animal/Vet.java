package com.company.animal;

public class Vet {
<<<<<<< HEAD
    void treatAnimal(Animal animal){
        System.out.println(" Eat "+animal.food+"\nLives on "+animal.location);

    }

    public static void main(String[] args) {
        Animal[] animals = {new Cat("fish","Masherova st. 19"),new Dog("meat","Gagarina st. 17"),new Horse("herb","Ratomka village, Lenin st. 33")};
        Vet vet = new Vet();
        for (Animal v:animals){
        vet.treatAnimal(v);
        }

    }
=======
    void treatAnimal(Animal animal) {
        System.out.println("Eat " + animal.food + "\nLives on " + animal.location+"\n");
    }

    public static void main(String[] args) {

        Animal[] any = {new Cat("fish", "Gagarina st. 17"),
                new Dog("meat", "Masherova st. 33"),
                new Horse("hay", "Ratomka village")};



        for (Animal animal : any) {
           new Vet().treatAnimal(animal);

        }
    }

>>>>>>> origin/master
}
