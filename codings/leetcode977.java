import java.util.*;

public class leetcode977 {
    public static void main(String[] args){
        int[] nums={-4,-1,0,3,10};
        finished(nums);
    }
    public static int[] finished(int[] nums) {
        int left =0,right=nums.length-1;
        int index=nums.length-1;
        int[] result=new int[nums.length];
        while (left<=right){
            int start=nums[left]*nums[left];
            int end=nums[right]*nums[right];
            if(start<end){
                result[index]=end;
                right--;
            }else{
                result[index]=start;
                left ++;
            }
            index --;
        }
        System.out.print(Arrays.toString(result));
        return result;
    }
}
