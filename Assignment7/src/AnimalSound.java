abstract class Animal {
    abstract String makeSound();
}

class Dog extends Animal {
    String makeSound() {
        return "Dog says: Woof";
    }
}

class Cat extends Animal {
    String makeSound() {
        return "Cat says: Meow";
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
