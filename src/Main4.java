class Animal {
    private String name;
    private String sound;

    public Animal() {}

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() { return name; }
    public String getSound() { return sound; }

    public void makeSound() {
        System.out.println(name
                + " is making sound: " + sound);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name, "Bark"); // calls Animal constructor
        this.breed = breed;
    }

    @Override //
    public void makeSound() {
        System.out.println(getName()
                + " says: Woof Woof!");
    }

    public void fetch() {
        System.out.println(getName()
                + " is fetching! Breed: " + breed);
    }
}

class Cat extends Animal {
    private String type; // indoor or outdoor

    public Cat(String name, String type) {
        super(name, "Meow"); //  calls Animal constructor
        this.type = type;
    }

    @Override //
    public void makeSound() {
        System.out.println(getName()
                + " says: Meow!");
    }

    public void purr() {
        System.out.println(getName()
                + " is purring... Purrrrr ");
        System.out.println("Type: " + type);
    }
}

public class Main4 {
    public static void main(String[] args) {

        // Test Animal directly
        Animal a = new Animal("Generic Animal", "...");
        a.makeSound();
        System.out.println("----------");

        // Test Dog
        Dog d = new Dog("Bruno", "Pitbull");
        d.makeSound();
        d.fetch();
        System.out.println("----------");

        // Test Cat
        Cat c = new Cat("Kitty", "Indoor");
        c.makeSound();
        c.purr();
        System.out.println("----------");

        // Polymorphism demo
        Animal[] animals = {
                new Dog("Rex", "German Shepherd"),
                new Cat("Whiskers", "Outdoor"),
                new Animal("Bird", "Tweet")
        };

        System.out.println("Polymorphism demo:");
        for(Animal animal : animals) {
            animal.makeSound(); // calls correct method
        }
    }
}