import java.util.Arrays;
public class median {
    public static void main(String[] args){
        int[] arr = {2,4,1,3,5};
        Arrays.sort(arr);
        float median= arr[arr.length/2];
        System.out.print(median);
    }
}
