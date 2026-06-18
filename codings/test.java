import java.util.ArrayList;
import java.util.List;
class solution{
    List<List<Integer>> list = new ArrayList<>();
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void find(int[] nums, int idx){
        if(idx == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            list.add(temp);
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(nums, idx, i);
            find(nums, idx + 1);
            swap(nums, idx, i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        find(nums, 0);
        return list;
    }
}