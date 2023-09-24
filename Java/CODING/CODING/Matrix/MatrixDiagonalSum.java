public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        int[] diagonalSums = calculateDiagonalSums(matrix);

        System.out.println("Sum of Main Diagonal: " + diagonalSums[0]);
        System.out.println("Sum of Anti-Diagonal: " + diagonalSums[1]);
    }

    public static int[] calculateDiagonalSums(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[] diagonalSums = new int[2]; // 0: Main Diagonal, 1: Anti-Diagonal

        for (int i = 0; i < numRows; i++) {
            diagonalSums[0] += matrix[i][i]; // Sum of main diagonal
            diagonalSums[1] += matrix[i][numCols - 1 - i]; // Sum of anti-diagonal
        }

        return diagonalSums;
    }
}
