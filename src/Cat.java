// Cat class implementing the Animal interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}