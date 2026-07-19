package hashing;

import java.util.*;
class leetcode383 {
    public static void main(String[] args){
        String ransomNote = "aaa";
        String magazine = "aldkjfa";
        System.out.print(canConstruct(ransomNote,magazine));
    }
    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> a = new HashMap<>();
        for(char c : magazine.toCharArray()){
            a.put(c,a.getOrDefault(c,0)+1);
        }
        int i=0;
        for(char c : ransomNote.toCharArray()){
            if(!a.containsKey(c) || a.get(c) <= 0){
                return false;
            }
            a.put(c,a.get(c)-1);
        }
        return true;
    }
}
