//import java.util.ArrayList;
import java.util.List;
//
//class leetcode78rec {
//
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        backtrack(result, new ArrayList<>(), nums, 0);
//        return result;
//    }
//    private void backtrack(List<List<Integer>> result, List<Integer> currentPath, int[] nums, int index) {
//        if (index == nums.length) {
//            result.add(new ArrayList<>(currentPath));
//            return;
//        }
//        currentPath.add(nums[index]);
//        backtrack(result, currentPath, nums, index + 1);
//        currentPath.remove(currentPath.size() - 1);
//        backtrack(result, currentPath, nums, index + 1);
//    }