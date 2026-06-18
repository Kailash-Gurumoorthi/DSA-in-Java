package hashing;

// 1.Two Sum
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//Input: nums = [3,3], target = 6
//Output: [0,1]

import java.util.*;
public class leetcode1 {
    public static void main(String[] args){
        int[] nums={1,7,9,15};
        int target = 10;
        System.out.print(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need = target - nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
