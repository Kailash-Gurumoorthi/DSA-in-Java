//group anagrams
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class leetcode46 {
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.print(groupAnagrams(strs));
    }
    static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>(Arrays.asList(strs));
        while(!temp.isEmpty()) {
            List<String> list = new ArrayList<>();
            String s = temp.remove(0);
            list.add(s);
            int i=0;
            while(i<temp.size()) {
                String t = temp.get(i);
                if (s.length() != t.length()){
                    i++;
                    continue;
                }
                char[] a = s.toCharArray();
                char[] b = t.toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                boolean isanagram = Arrays.equals(a, b);
                if (isanagram) {
                    list.add(t);
                    temp.remove(i);
                }else{
                    i++;
                }
            }
            result.add(list);
        }
        return result;
    }
}
