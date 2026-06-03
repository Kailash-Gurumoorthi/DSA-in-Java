import java.util.*;
public class slidingwindow {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,0,9,1,2,3,4};
        int k=3;
        cal(nums,k);
    }
    public static void cal(int[] nums , int k) {
        int now = 0, max = 0, left = 0;
        for (int i = 0; i < nums.length; i++) {
            now = now + nums[i];
            if (i >= k - 1) {
                max = Math.max(max, now);
                now = now - nums[left];
                left++;
            }
        }
        System.out.print(max);
    }
}

