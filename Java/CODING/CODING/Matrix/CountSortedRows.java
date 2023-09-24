public class CountSortedRows {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {10, 8, 9},
            {7, 12, 15},
        };

        int count = countSortedRows(matrix);

        System.out.println("Number of sorted rows: " + count);
    }

    public static int countSortedRows(int[][] matrix) {
        int count = 0;

        for (int[] row : matrix) {
            if (isSorted(row)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
