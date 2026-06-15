//combinations
//Input: n = 4, k = 2
//Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]

import java.util.*;
class leetcode77 {
    public static void main(String[] args){
        int n=6,k=4;
        System.out.print(combine(n,k));
    }
    static List<List<Integer>> combine(int n, int k) {
       List<List<Integer>> result = new ArrayList<>();
       permute(n,k,result,new ArrayList<>(),1);
       return result;
    }
    static void permute(int n ,int k,List<List<Integer>> result,List<Integer> list,int start){
        if(list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }
        int deadend= n-(k-list.size())+1;
        for(int i = start; i<=deadend ; i++){
            list.add(i);
            permute(n,k,result,list,i+1);
            list.remove(list.size() -1 );
        }
    }
}