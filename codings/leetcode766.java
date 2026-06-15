
public class leetcode766 {
    public static void main(String[] args){
        int[][] nums={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.print(calc(nums));
    }
    public static boolean calc(int[][] nums){
        for(int i=nums.length-1;i>0;i--){
            for(int j=nums[0].length-1;j>0;j--){
                if(nums[i][j]==nums[i-1][j-1]){
                    return true ;
                }
            }
        }
        return false;
    }
}
