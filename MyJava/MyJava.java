package MyJava;

public class Box {
    int heihgt;
    int width;
    int length;
}

public class MyJava {
    static int number; // static variable

    public static void main(String[] args) {

        Box myBox = new Box();

        // declaring and initializing 2D array
        int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } }; // local variable

        /**
         * 1 2 3
         * 2 4 5
         * 4 4 5
         */

        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}