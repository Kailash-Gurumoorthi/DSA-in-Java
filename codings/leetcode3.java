import java.util.Arrays;
public class leetcode3 {
    public static void main(String[] args){
        String s = "abbcca";
        System.out.print(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
       /*

        int[] carry= new int[128];
        Arrays.fill(carry,-1);
        int i = 0,j = 0,count = 0;
        while(j<s.length()) {
            char ch = s.charAt(j);
            if (carry[ch] >= i) {
                i = carry[ch] + 1;
            }
            
            carry[ch] = j;
            int length=j-i+1;
            count = Math.max(count,length);
            j++;
        }
        return count;
        */

        // updated logic
        int[] carry = new int[128];
        int max=0;
        for(int i=0,j=0;j<s.length();j++){
            char ch = s.charAt(j);
            i=Math.max(carry[ch],i);
            max=Math.max(j-i+1,max);
            carry[ch]=j+1;
        }
        return max;
    }
}
