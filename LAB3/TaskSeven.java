package LAB3;

/**
 * Example of method overriding in Java.
 */
class Parent {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() { // method overriding
        System.out.println("This is the child class.");
    }
}

public class TaskSeven {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
