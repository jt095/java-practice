package ArraysAndStrings;

public class MatrixMult {
    public static void main(String[] args) {
        int[][] matrixA = new int[][]{
                {1, 2},
                {3, 4}
        };
        int[][] matrixB = new int[][]{
                {5, 6},
                {7, 8}
        };

        int[][] matrixC = new int[][] {
                {9, 10}
        };

        int[][] matrixD = new int[][] {
                {11},
                {12}
        };

        printMatrix(multiplyMatrices(matrixA, matrixB));
        printMatrix(multiplyMatrices(matrixA, matrixC));
        printMatrix(multiplyMatrices(matrixB, matrixD));
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
