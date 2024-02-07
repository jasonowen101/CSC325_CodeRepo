package Aminals;
public class Dog extends Animal {
    // Constructor for Dog class, calling the superclass constructor
    public Dog(String name) {
        super(name);
    }

    // Implementation of the makeSound method for a dog
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    // Implementation of the move method for a dog
    @Override
    public void move() {
        System.out.println(name + " moves on four legs.");
    }
}
