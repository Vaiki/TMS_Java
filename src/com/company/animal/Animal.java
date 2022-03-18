package com.company.animal;

public abstract class Animal {
    private final String food;
    private final String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

}

interface Actions {

    void makeNoise();

    void eat();

    void sleep();
}

class Cat extends Animal implements Actions {

    public Cat(String food, String location) {
        super(food, location);
    }

    public int getNumOfMiceCaught() {
        return numOfMiceCaught;
    }

    public void setNumOfMiceCaught(int numOfMiceCaught) {
        this.numOfMiceCaught = numOfMiceCaught;
    }

    private int numOfMiceCaught;


    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog extends Animal implements Actions {

    public Dog(String food, String location) {
        super(food, location);
    }

    private String[] favoriteCommand;

    public String[] getFavoriteCommand() {
        return favoriteCommand;
    }

    public void setFavoriteCommand(String[] favoriteCommand) {
        this.favoriteCommand = favoriteCommand;
    }


    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Horse extends Animal implements Actions {


    public Horse(String food, String location) {
        super(food, location);
    }

    private double jumpHeight;

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh!");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}