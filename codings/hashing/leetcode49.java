package hashing;

//49. Group Anagrams
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

import java.util.*;
public class leetcode49 {
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.print(groupAnagrams(strs));

    }
    static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for(int i = 0; i < str.length(); i++) {
                count[str.charAt(i) - 'a']++;
            }
        StringBuilder key = new StringBuilder();
        for(int num : count){
            key.append(num).append('#');
        }
        String sign = key.toString();
        map.computeIfAbsent(sign,k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
