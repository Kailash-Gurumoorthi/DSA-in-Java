package hashing;
//trying hashset,map,table for the 1st time
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class tryingHash {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int k = 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        for(int i=0;i<map.size();i++){
            System.out.println(map.get(i));
        }
    }
    static boolean containsNearbyDuplicate(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int find=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                find = Math.abs(map.get(i) - i );
                if(find<=k){
                    return true;
                }
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
