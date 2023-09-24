// import java.util.*;

// public class Sort {
//     public static void main(String[] args) {
//         int[][] matrix = {
//                 { 5, 3, 2 },
//                 { 8, 1, 4 },
//                 { 6, 7, 9 }
//         };

//         for (int[] rows : matrix) {
//             Arrays.sort(rows);
//         }

//         for (int[] rows : matrix) {
//             System.out.println(Arrays.toString(rows));
//         }
//     }
// }

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[][] matrix = {
                { 5, 3, 2 },
                { 8, 1, 4 },
                { 6, 7, 9 }
        };

        // Flatten the matrix into a 1D array
        int[] flattenedMatrix = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();

        // Sort the flattened array
        Arrays.sort(flattenedMatrix);

        // Reshape the sorted array back into a 2D matrix
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] sortedMatrix = new int[numRows][numCols];

        int index = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                sortedMatrix[i][j] = flattenedMatrix[index++];
            }
        }

        // Optionally, you can print the sorted matrix
        for (int[] row : sortedMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
