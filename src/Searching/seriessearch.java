package Searching;

public class seriessearch {
    public static void main(String[] args){
        int[] arr={1, 1, 2};
        System.out.print(search(arr));
    }
    public static int search(int[] arr){
        int start=0,end = arr.length-1;

        while(start<end){
            int mid=start + (end-start)/2;

            if(mid%2 == 0){
                if(arr[mid]==arr[mid+1]){
                    start = mid+2;
                }else end =mid;
            }else {
                if(arr[mid ]== arr[mid-1]){
                    start = mid+1;
                }else end = mid;
            }
        }
        return arr[start];
    }
}
