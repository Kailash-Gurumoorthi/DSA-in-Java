import java.util.Scanner;
public class toeliptzfromTCS {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input rows and columns
            System.out.print("Enter number of rows (r): ");
            int r = sc.nextInt();
            System.out.print("Enter number of columns (c): ");
            int c = sc.nextInt();

            int[][] matrix = new int[r][c];

            // Populate the matrix
            System.out.println("Enter matrix elements:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Check the Toeplitz property
            // A matrix is Toeplitz if mat[i][j] == mat[i-1][j-1] for all non-edge elements
            boolean isToeplitz = true;
            for (int i = 1; i < r; i++) {
                for (int j = 1; j < c; j++) {
                    if (matrix[i][j] != matrix[i - 1][j - 1]) {
                        isToeplitz = false;
                        break;
                    }
                }
                if (!isToeplitz) break;
            }

            // Perform calculation on the first row
            if (isToeplitz) {
                long sum = 0;
                for (int j = 0; j < c; j++) {
                    sum += matrix[0][j];
                }
                System.out.println("The matrix is Toeplitz.");
                System.out.println("Sum of the first row: " + sum);
            } else {
                long product = (c > 0) ? 1 : 0;
                for (int j = 0; j < c; j++) {
                    product *= matrix[0][j];
                }
                System.out.println("The matrix is NOT Toeplitz.");
                System.out.println("Product of the first row: " + product);
            }

            sc.close();
        }
    }

