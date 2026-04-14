package LAB3;
//Write a Java program to illustrate the concept of Single inheritance.

class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is the child class.");
    }
}

public class TaskTwo {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Inherited method from Parent class
        child.show(); // Method from Child class
    }

}
