//392. Is Subsequence
//(i.e., "ace" is a subsequence of "abcde" while "aec" is not)
//Example 1:
//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//Input: s = "axc", t = "ahbgdc"
//Output: false

public class leetcode392opti {
    public static void main(String[] args){
        String s = "b", t = "abc";
        System.out.print(isSubsequence(s,t));
    }
    static boolean isSubsequence(String s, String t){
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}
