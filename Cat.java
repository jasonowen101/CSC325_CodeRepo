public class Cat extends Animal {
    // Constructor for Cat class, calling the superclass constructor
    public Cat(String name) {
        super(name);
    }

    // Implementation of the makeSound method for a cat
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Meow!");
    }

    // Implementation of the move method for a cat
    @Override
    public void move() {
        System.out.println(name + " moves on four legs.");
    }
}
