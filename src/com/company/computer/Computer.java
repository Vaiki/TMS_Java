package com.company.computer;

public class Computer {
    private int cost;
    private String model;
    RAM ram;
    HDD hdd;

    public Computer(String model, int cost) {
        this.model = model;
        this.cost = cost;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(String model, int cost, String nameRAM, int capacityRAM, String nameHDD, int capacityHDD, String typeHDD) {
        this.model = model;
        this.cost = cost;
        ram = new RAM(nameRAM, capacityRAM);
        hdd = new HDD(nameHDD, capacityHDD, typeHDD);
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "\nComputer model: " + model +
                "\nCost: " + cost + "$" +
                "\nRAM model: " + ram.getName() +
                "\nRAM capacity: " + ram.getCapacity() + " GB" +
                "\nHDD model: " + hdd.getName() +
                "\nHDD capacity: " + hdd.getCapacity() + " GB" +
                "\nHDD type: " + hdd.getType();

    }

    public static void main(String[] args) {
        Computer com1 = new Computer("PentiumV", 550);
        Computer com2 = new Computer("Pentium VII", 1200, "HyperX", 16,
                "Barracuda", 512, "External");
        System.out.println(com1);
        System.out.println(com2);

    }
}
