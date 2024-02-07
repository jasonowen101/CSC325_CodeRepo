package Aminals;
public abstract class Animal {
    // Field to store the name of the animal
    protected String name;

    // Constructor to initialize the name field
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method to make a sound (no implementation)
    public abstract void makeSound();

    // Abstract method to define how the animal moves (no implementation)
    public abstract void move();
    // comment goes here now lets make a change

}
