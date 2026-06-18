//167. Two Sum II - Input Array Is Sorted
//Example 1:
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Example 2:
//Input: numbers = [2,3,4], target = 6
//Output: [1,3]
//Example 3:
//Input: numbers = [-1,0], target = -1
//Output: [1,2]

import java.util.*;
public class leetcode167 {
    public static void main(String[] args){
        int[] numbers={2,7,11,15};
        int target = 9;
        System.out.print(Arrays.toString(twoSum(numbers,target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left != right) {
            int sum=numbers[left]+numbers[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{-1,-1};
    }
}











