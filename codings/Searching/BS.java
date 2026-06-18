package Searching;

public class BS {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int t=9;
        System.out.print(BSrec(nums,t,0,nums.length));
    }
    static int BSdirect(int[] nums, int t){
        int start =0,end=nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == t){
                return mid;
            }
            if(nums[mid] < t){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    static int BSrec(int[] nums , int t, int start ,int end){
        int mid=start + (end - start)/2;
        if(nums[mid]==t){
            return mid;
        }else if(nums[mid]<t){
            return BSrec(nums,t,mid+1,nums.length);
        }else{
            return BSrec(nums,t,0,mid-1);
        }
    }
}
