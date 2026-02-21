package LAB2;

class Employee {

    String name;
    int age;
    double salary;

    // Constructor 1: No parameters (Default Constructor)
    Employee() {
        name = "Unknown";
        age = 0;
        salary = 0.0;
    }

    // Constructor 2: Two parameters
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 0.0; // Default salary
    }

    // Constructor 3: Three parameters
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------");
    }
}

public class Task4 {
    public static void main(String[] args) {

        Employee e1 = new Employee(); // Constructor 1
        Employee e2 = new Employee("Rameem", 22); // Constructor 2
        Employee e3 = new Employee("Mahmood", 25, 50000); // Constructor 3

        e1.display();
        e2.display();
        e3.display();
    }
}
