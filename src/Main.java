public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        Zoo zoo1 = new Zoo(dog);
        Zoo zoo2 = new Zoo(cat);

        zoo1.performAnimalActivities();
        zoo2.performAnimalActivities();
    }
}
