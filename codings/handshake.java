/*public class handshake {
    public static void main(String[] args){
        int h=5;
        System.out.print(find(h));

    }
    public static int find(int h){
        int x= (h*(h-1))/2;
        return x;
    }
}*/

import java.util.Scanner;

public class handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                if (sc.hasNextLong()) {
                    long n = sc.nextLong();

                    // Using the formula N * (N - 1) / 2
                    // We use long to handle large results
                    long result = (n * (n - 1)) / 2;

                    System.out.println(result);
                }
            }
        }
        sc.close();
    }
}
