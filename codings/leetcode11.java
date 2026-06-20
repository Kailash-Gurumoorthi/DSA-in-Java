//11. Container With Most Water

public class leetcode11 {
    public static void main(String[] args){
        int[] height = {1,1};
        System.out.print(maxArea(height));
    }
    static int maxArea(int[] height){
        int i=0,j=height.length-1;
        int max=0;
        while(i<j){
            int width = j-i;
            int area = width * Math.min(height[i],height[j]);
            max=Math.max(max,area);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
