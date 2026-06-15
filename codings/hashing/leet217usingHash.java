package hashing;
//217. Contains Duplicate
//Input: nums = [1,2,3]
//Output: true

import java.util.*;
public class leet217usingHash {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7,8,3};
        System.out.print(ans(nums));
    }
    static boolean ans(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
