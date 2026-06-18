package hashing;

//128. Longest Consecutive Sequence
//Example 1:
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Example 2:
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
//Example 3:
//Input: nums = [1,0,1,2]
//Output: 3

import java.util.*;
public class leetcode128 {
    public static void main(String[] args) {
        int nums = {100, 4, 200, 1, 3, 2};
        System.out.print(longestConsecutive(nums));
    }

    static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max=0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cur = num;
                int length = 1;
                while (set.contains(cur + 1)) {
                    cur++;
                    length++;

                }
                max=Math.max(max,length);
            }
        }
        return max;
    }
}
