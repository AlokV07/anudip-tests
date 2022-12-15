public class Matrix {

    public static void main(String[] args) {
        
    	int rows = 2, column = 3;
        
        int[][] firstMatrix = { {20, 30, 40}, {50, 60, 70} };
        int[][] secondMatrix = { {10, 11, 12}, {13, 14, 15} };

        // Add Two matrices
        
        int[][] sum = new int[rows][column];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Print the Output
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int columns : row) {
                System.out.print(columns + "    ");
            }
            System.out.println();
        }
    }
}