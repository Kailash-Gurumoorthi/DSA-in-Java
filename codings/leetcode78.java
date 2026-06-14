import java.util.ArrayList;
import java.util.List;
public class leetcode78 {
    public static void main(String[] args){
        int[] nums={1,2,3};
        System.out.print(subsets(nums));
    }
  
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int num : nums){
            int size=list.size();
            for(int i = 0;i<= size-1;i++){
                List<Integer> temp = new ArrayList<>(list.get(i));
                temp.add(num);
                list.add(temp);
            }
        }
        return list;
    }
  
}
