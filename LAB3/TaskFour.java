package LAB3;

//Write a Java program to illustrate the concept of Hierarchical inheritance.
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("This dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("This cat meows.");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("This bird flies.");
    }
}

public class TaskFour {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();

        bird.eat();
        bird.fly();
    }

}
