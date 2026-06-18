import java.util.Arrays;

public class leetcodeproblem26 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2 ,3};
        System.out.println(nondupli(nums));
    }
    public static int nondupli(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        /*
        // using while loop
         int i=0,j=1;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        System.out.println(Arrays.toString(nums));
        return i+1; */

        // using for loop

        int i=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j-1]!=nums[i]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
