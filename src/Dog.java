// Dog class implementing the Animal interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats dog food.");
    }
}