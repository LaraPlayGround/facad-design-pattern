// Zoo class interacting with animals using the Animal interface
class Zoo {
    private Animal animal;

    public Zoo(Animal animal) {
        this.animal = animal;
    }

    public void performAnimalActivities() {
        animal.makeSound();
        animal.eat();
    }
}
