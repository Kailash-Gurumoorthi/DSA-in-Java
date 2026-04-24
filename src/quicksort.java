import java.util.*;
public class quicksort {
    public static void main(String[] args) {
        int[] arr = {4,2,8,6,15,5,9,20};
        Arrays.sort(arr);
        int n = arr.length-1,m=arr.length/2;
        int temp;
        while( m<(n)){
            temp=arr[m];
            arr[m] = arr[n];
            arr[n]= temp;
            m++;n--;

        }
        System.out.print(Arrays.toString(arr));
    }
}