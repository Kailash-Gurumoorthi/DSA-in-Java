//15. 3Sum
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//Example 1:
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Example 2:
//Input: nums = [0,1,1]
//Output: []
//Example 3:
//Input: nums = [0,0,0]
//Output: [[0,0,0]]

import java.util.*;

public class leetcode15 {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.print(threeSum(nums));
    }
    static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 2 ;i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum= nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }else if(sum < 0 ){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return result;
    }
}
