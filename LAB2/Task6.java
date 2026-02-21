package LAB2;

class Student {

    String name;
    int age;

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-------------------");
    }
}

public class Task6 {
    public static void main(String[] args) {

        // Original object
        Student s1 = new Student("Rameem", 22);

        // Creating copy of s1
        Student s2 = new Student(s1);

        System.out.println("Original Object:");
        s1.display();

        System.out.println("Copied Object:");
        s2.display();
    }
}
