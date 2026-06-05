import java.util.Arrays;
public class leetcode283 {
    public static void main(String[] args){
        int[] nums={0,1,1};
        calc(nums);
    }
    public static void calc(int[] nums){
        if(nums== null || nums.length == 0) return ;
        if(nums.length == 1) return ;
       /* int i=0,j=0;
        while(j<nums.length) {
            if (nums[j]!=0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            j++;
        }
       System.out.print(Arrays.toString(nums));*/

        // move all non zeros nums forward
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
        // fill remaining as zeros;
        while(i<nums.length){
            // note that i was already at its end
            nums[i]=0;
            i++;
        }
        System.out.print(Arrays.toString(nums));
    }
}
