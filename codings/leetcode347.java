//347. Top K Frequent Elements
//Example 1:
//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
//Example 2:
//Input: nums = [1], k = 1
//Output: [1]
//Example 3:
//Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
//Output: [1,2]

import java.util.*;
public class leetcode347 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,3,3,1,3,3};
        int k = 2;
        System.out.print(Arrays.toString(topKFrequent(nums, k)));

    }

    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] list = new ArrayList[nums.length + 1];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            int key = i.getKey();
            int value = i.getValue();
            list[value].add(key);
        }
        int[] result = new int[k];
        int index = 0;
        for (int i = list.length - 1; i >= 0 && index < k; i--) {
            for (int num : list[i]) {
                result[index++] = num;
                if (index == k) {
                    break;
                }
            }
        }
        return result;
    }
}