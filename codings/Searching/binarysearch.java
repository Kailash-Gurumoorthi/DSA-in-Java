package Searching;

public class binarysearch {
    public static void main(String[] args){
        int[] arr ={1,2,3,23,52,62,345,776};
        int target =62;
        System.out.print(search(arr,target));

    }
    public static int search(int[] arr,int target){
        int n=arr.length;
        int start=0,end=n-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]>target){
                end = mid-1;
            }else start=mid+1;
        }
        return -1;
    }
}
