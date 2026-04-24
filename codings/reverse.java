import java.util.Arrays;
public class reverse {
    public static void main(String[] args){
         int[] arr= {5,4,3,2,1};
         int i=0,end = arr.length-1;
         while( i< end) {
             int temp = arr[i];
             arr[i]=arr[end];
             arr[end]=temp;
             i++;
             end --;
        }
         System.out.print(Arrays.toString(arr));
    }
}
