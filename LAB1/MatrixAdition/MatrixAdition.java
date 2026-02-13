package MatrixAdition;

// Class for matrix addition logic
class Matrix {

    // Method to add two matrices
    void addMatrices(int[][] a, int[][] b, int rows, int cols) {

        int[][] sum = new int[rows][cols];

        // Adding matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Display result
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Class containing main method
class MatrixAdition {

    public static void main(String[] args) {

        int rows = 2, cols = 2;

        // Given matrices
        int[][] matrix1 = {
                { 1, 2 },
                { 3, 4 }
        };

        int[][] matrix2 = {
                { 5, 6 },
                { 7, 8 }
        };

        Matrix m = new Matrix();

        // Add matrices
        m.addMatrices(matrix1, matrix2, rows, cols);
    }
}
