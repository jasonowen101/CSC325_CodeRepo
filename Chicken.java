public class Chicken extends Animal {
    // Constructor for Cat class, calling the superclass constructor
    public Chicken(String name) {
        super(name);
    }

    // Implementation of the makeSound method for a chicken
    @Override
    public void makeSound() {
        System.out.println(name + " clucks: Cluck! Cluck!");
    }

    // Implementation of the move method for a chicken
    @Override
    public void move() {
        System.out.println(name + " moves on two legs.");
    }
}
