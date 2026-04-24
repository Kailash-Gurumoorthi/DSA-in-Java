package Searching;

public class linearsearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int target =5;
        System.out.print(search(arr,target));
    }
    public static int search(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]== target) return i;
        }
        return -1;
    }
}
