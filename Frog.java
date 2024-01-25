public class Frog {
    public Frog(String name) {
        super(name);
    }

    // Implementation of the makeSound method for a frog
    @Override
    public void makeSound() {
        System.out.println(name + " ribbit: Ribbit! Ribbit!");
    }

    // Implementation of the move method for a frog
    @Override
    public void move() {
        System.out.println(name + " hops on four legs.");
    }
}