package methods;

public class MatrixOperations {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random()*10) + 1; 
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix, String label) {
        System.out.println("\n--- " + label + " ---");
        if (matrix == null) {
            System.out.println("Empty Matrix");
            return;
        }
        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int elem : row) {
                System.out.printf("%4d", elem); 
            }
            System.out.println(" ]");
        }
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;
        if (rowsA != rowsB || colsA != colsB) {
            System.out.println("Matrix addition requires same dimensions.");
            return null;
        }
        int[][] result = new int[rowsA][colsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;
        if (rowsA != rowsB || colsA != colsB) {
            System.out.println("Matrix subtraction requires same dimensions.");
            return null;
        }
        int[][] result = new int[rowsA][colsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;
        if (colsA != rowsB) {
            System.out.printf("Cannot multiply %dx%d by %dx%d.%n", rowsA, colsA, rowsB, colsB);
            return null;
        }
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrixA = createRandomMatrix(3, 3);
        int[][] matrixB = createRandomMatrix(3, 3);
        printMatrix(matrixA, "Matrix A");
        printMatrix(matrixB, "Matrix B");
        
        int[][] sumMatrix = addMatrices(matrixA, matrixB);
        printMatrix(sumMatrix, "Result: A + B");
        
        int[][] diffMatrix = subtractMatrices(matrixA, matrixB);
        printMatrix(diffMatrix, "Result: A - B");
        
        int[][] matrixC = createRandomMatrix(2, 3);
        int[][] matrixD = createRandomMatrix(3, 2); 
        printMatrix(matrixC, "Matrix C (2x3)");
        printMatrix(matrixD, "Matrix D (3x2)");
        
        int[][] productCD = multiplyMatrices(matrixC, matrixD);
        printMatrix(productCD, "Result: C * D (should be 2x2)");
        
        int[][] productDC = multiplyMatrices(matrixD, matrixC);
        printMatrix(productDC, "Result: D * C (should be 3x3)");
    }
}
