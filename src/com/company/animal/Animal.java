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

    abstract void makeNoise();

    abstract void eat();

    void sleep() {
        System.out.println("Sleeping");
    }


}

class Cat extends Animal {

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
    void makeNoise() {
        System.out.println("Meow!");
    }

    @Override
    void eat() {
        System.out.println("Cat eat " + getFood());
    }


}

class Dog extends Animal {

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
    void makeNoise() {
        System.out.println("Woof!");
    }

    @Override
    void eat() {
        System.out.println("Dog eat " + getFood());
    }


}

class Horse extends Animal {


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
    void makeNoise() {
        System.out.println("Neigh!");
    }

    @Override
    void eat() {
        System.out.println("Horse eat " + getFood());
    }


}