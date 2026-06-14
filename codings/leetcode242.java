public class leetcode242 {
    public static void main(String[] args){
        System.out.print(isanagram("aacc","ccac"));
    }
    public static boolean isanagram(String s,String t){

       /* // O(n^2)
        if(s.length() != t.length()) return false;
        StringBuilder str = new StringBuilder(t);
        StringBuilder str1 = new StringBuilder(s);
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str.length();j++){
                if(str1.charAt(i)==str.charAt(j)){
                    str.deleteCharAt(j);
                    break;
                }
            }
        }
        if(str.length()==0) return true;
        return false;
        */
        /*
        //O(nlogn)
        if(s.length() != t.length()) return false;
        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(tt);
        if(Arrays.equals(st,tt)){
            return true;
        }
        return false;
        */
                // O(n)
                if(s.length() != t.length()) return false;
                int[] count = new int[26]; // s and t consist of lowercase English letters.
                for(int i =0 ;i<s.length();i++){
                    count[s.charAt(i) - 'a']++;
                    count[t.charAt(i) - 'a']--;
                }
                for(int i : count){
                    if(i != 0) return false;
                }
                return true;
            }
        }
