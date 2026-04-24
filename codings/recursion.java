public class recursion {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }

    public static int factorial(int n) {
        // 1. Base Case: If n is 1, stop the recursion
        if (n <= 1) {
            return 1;
        }
        // 2. Recursive Step: n * factorial of (n-1)
        else {
            return n * factorial(n - 1);
        }
    }
}