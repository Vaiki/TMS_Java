package com.company.animal;

public abstract class Animal {
    String food;
    String location;

    abstract void makeNoise();

    abstract void eat();

    void sleep() {
        System.out.println("Sleeping");
    }


}

class Cat extends Animal {

    public Cat(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public int getNumOfMiceCaught() {
        return numOfMiceCaught;
    }

    public void setNumOfMiceCaught(int numOfMiceCaught) {
        this.numOfMiceCaught = numOfMiceCaught;
    }

    private int numOfMiceCaught;


    @Override
    void makeNoise() {
        System.out.println("Meow!");
    }

    @Override
    void eat() {
        System.out.println("Cat eat " + food);
    }


}

class Dog extends Animal {

    public Dog(String food, String location) {
        this.food = food;
        this.location = location;
    }

    String[] favoriteCommand;

    public String[] getFavoriteCommand() {
        return favoriteCommand;
    }

    public void setFavoriteCommand(String[] favoriteCommand) {
        this.favoriteCommand = favoriteCommand;
    }


    @Override
    void makeNoise() {
        System.out.println("Woof!");
    }

    @Override
    void eat() {
        System.out.println("Dog eat " + food);
    }


}

class Horse extends Animal {


    public Horse(String food, String location) {
        this.food = food;
        this.location = location;
    }

    double jumpHeight;

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Override
    void makeNoise() {
        System.out.println("Neigh!");
    }

    @Override
    void eat() {
        System.out.println("Horse eat " + food);
    }


}