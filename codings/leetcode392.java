//392. Is Subsequence
//(i.e., "ace" is a subsequence of "abcde" while "aec" is not)
//Example 1:
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//Input: s = "axc", t = "ahbgdc"
//Output: false
public class leetcode392 {
    public static void main(String[] args){
        String s = "b", t = "abc";
        System.out.print(isSubsequence(s,t));
    }
    static boolean isSubsequence(String s, String t){
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;
        String ans = "";
        int i=0,j=0;
        while(j<t.length()){
            if(s.equals(ans)) return true;
            if(s.charAt(i) == t.charAt(j)){
                ans= ans + s.charAt(i);
                i++;
                j++;

            }else{
                j++;
            }
        }
        if(s.equals(ans)) return true;
        return false;
    }
}
