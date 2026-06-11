public class leetcode125 {
    public static void main(String[] args){
        String s ="A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {


        // written by me runs at O(n) and O(n)

        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(ch);
            }
        }
        s = str.toString();
        //System.out.print(s);
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(j);
            if (ch != ch1) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

        // by ai runs at O(n) and O(1)
       /*public static boolean isPalindromeOptimal(String s) {
    int i = 0;
    int j = s.length() - 1;

    while (i < j) {
        char ch = s.charAt(i);
        char ch1 = s.charAt(j);
        if (!Character.isLetterOrDigit(ch)) {
            i++;
        }

        else if (!Character.isLetterOrDigit(ch1)) {
            j--;
        }

        else {
            if (Character.toLowerCase(ch) != Character.toLowerCase(ch1)) {
                return false;
            }
            i++;
            j--;
        }
    }

    return true;
} */

}
