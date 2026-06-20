//42. Trapping Rain Water
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Input: height = [4,2,0,3,2,5]
//Output: 9


public class leetcode42 {
    public static void main(String[] args){
        int[] height = {4,2,0,3,2,5};
        System.out.print(trap(height));
    }
    static int trap(int[] height){
        int left =0,right=height.length-1;
        int result=0;
        int leftmax =0,rightmax=0;
        int trapped=0;
        while(left<right){
            leftmax=Math.max(height[left],leftmax);
            rightmax=Math.max(height[right],rightmax);
            if(leftmax<rightmax){
                trapped = leftmax-height[left];
                result+=trapped;
                left++;
            }else{
                trapped = rightmax - height[right];
                result+=trapped;
                right--;
            }
        }
        return result;
    }
}
