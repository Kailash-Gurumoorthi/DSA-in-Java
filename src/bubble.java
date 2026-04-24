import java.util.Arrays;
public class bubble {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 16, 7, 23, 4, 9};
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}