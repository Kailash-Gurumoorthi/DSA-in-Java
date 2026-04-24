public class contiguouswindow {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3, n = arr.length;
        int[] newarr = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) max = arr[j];

            }
            newarr[i] = max;

        }
        for (int i : newarr) {
            System.out.print(i + " ");
        }
    }}

