import java.util.Arrays;
public class leetcode53tweak {
    public static void main(String[] args){
        int[] nums={-2, 1, -3, 4, -1, 2, 1};
        System.out.print(Arrays.toString(maxsubarray(nums)));
    }
    public static int[] maxsubarray(int[] nums){
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        int max=nums[0];
        int cur=nums[0];
        int start=0;
        int beststart=0;
        int end=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>cur+nums[i]){
                cur=nums[i];
                start =i;
            }else{
                cur=cur+nums[i];

            }
            if(cur>max){
                max=cur;
                beststart = start;
                end =i;
            }
        }
        return new int[]{beststart,end};
    }
}
