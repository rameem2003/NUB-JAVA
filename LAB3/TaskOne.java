// Write a Java program to illustrate the private, default, protected and public access
// modifiers.
package LAB3;

class AccessModifiers {
    String defaultVar = "This is a default variable.";
    public String publicVar = "This is a public variable.";
    private String privateVar = "This is a private variable.";
    protected String protectedVar = "This is a protected variable.";
}

public class TaskOne {
    public static void main(String[] args) {
        AccessModifiers access = new AccessModifiers();

        // Accessing default variable
        System.out.println(access.defaultVar);

        // Accessing public variable
        System.out.println(access.publicVar);

        // Accessing private variable (will cause an error)
        System.out.println(access.privateVar); // Uncommenting this line will cause a
        // compilation error

        // Accessing protected variable
        System.out.println(access.protectedVar);
    }
}
