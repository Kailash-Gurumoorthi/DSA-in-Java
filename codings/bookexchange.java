import java.util.Scanner;

public class bookexchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println(0);
                return;
            }
            if (n == 2) {
                System.out.println(1);
                return;
            }

            long MOD = 100000007L;

            // We only need the last two values to calculate the next one
            long prev2 = 0; // D(1)
            long prev1 = 1; // D(2)
            long current = 0;

            for (int i = 3; i <= n; i++) {
                // Formula: D(i) = (i - 1) * (D(i-1) + D(i-2))
                current = ((i - 1) * (prev1 + prev2)) % MOD;

                // Update values for the next iteration
                prev2 = prev1;
                prev1 = current;
            }

            System.out.println(current);
        }
        sc.close();
    }
}