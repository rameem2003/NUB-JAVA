package LAB3;

/**
 * Example of final keyword
 * for variable, method and class.
 */

final class FinalClass { // final class cannot be inherited
    void display() {
        System.out.println("This is a final class.");
    }
}

class FinalVariable {
    final int MAX_VALUE = 100; // final variable cannot be changed

    void show() {
        System.out.println("The maximum value is: " + MAX_VALUE);
    }
}

class FinalMethod {
    final void display() { // final method cannot be overridden
        System.out.println("This is a final method.");
    }
}

public class TaskSix {
    public static void main(String[] args) {
        FinalClass obj1 = new FinalClass();
        obj1.display();

        FinalVariable obj2 = new FinalVariable();
        obj2.show();

        FinalMethod obj3 = new FinalMethod();
        obj3.display();
    }
}
