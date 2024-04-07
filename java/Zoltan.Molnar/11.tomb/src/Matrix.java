public class Matrix {
    public static void main(String[] args) throws Exception {
        int[][] matrix = new int[3][4];

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.print("]");
            if (i != matrix.length - 1) {
                System.out.print(", ");
            }
            System.out.println();
        }
    }
}
