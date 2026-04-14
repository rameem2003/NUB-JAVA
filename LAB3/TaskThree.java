package LAB3;

//Write a Java program to illustrate the concept of Multilevel inheritance.
class GrandParent {
    void display() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends GrandParent {
    void show() {
        System.out.println("This is the parent class.");
    }
}

public class TaskThree {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); // Inherited method from GrandParent class
        parent.show(); // Method from Parent class; // Method from Parent class
    }

}
