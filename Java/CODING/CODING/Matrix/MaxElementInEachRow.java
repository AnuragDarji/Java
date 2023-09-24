public class MaxElementInEachRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i=0; i<matrix.length; i++){
            int max = matrix[i][0];

            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }

            System.out.println("Maximum element in Row " + (i + 1) + " : " + max);
        }
    }
}
