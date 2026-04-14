package LAB3;

/**
 * Write a Java program to illustrate that multiple inheritance does not support
 * in Java using
 * class.
 */

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {

    @Override
    public void methodA() {
        System.out.println("This is method A.");
    }

    @Override
    public void methodB() {
        System.out.println("This is method B.");
    }

}

public class TaskFive {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }

}
