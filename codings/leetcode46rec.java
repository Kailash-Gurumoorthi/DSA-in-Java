import java.util.ArrayList;
import java.util.List;
class leetcode46rec {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.print(permute(nums));
    }
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(),result,nums);
        return result;
    }
    public static void backtrack(List<Integer> list,List<List<Integer>> result,int[] nums){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=0 ;i<nums.length;i++){
            if(list.contains(nums[i])) {
                continue;
            }else{
                list.add(nums[i]);
                backtrack(list,result,nums);
                list.remove(list.size()-1);
            }
        }
    }
}