import java.util.*;
public class leetcode2570 {
    public static void main(String[] args){
        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};
        System.out.print(Arrays.deepToString(ans(nums1,nums2)));
    }
    static int[][] ans(int[][] nums1,int[][] nums2){
        List<int[]> list = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length ){
            if(nums1[i][0] == nums2[j][0]){
                list.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
                i++;
                j++;
            }else if(nums1[i][0] < nums2[j][0]){
                list.add(new int[]{nums1[i][0],nums1[i][1]});
                i++;
            }else{
                list.add(new int[]{nums2[j][0],nums2[j][1]});
                j++;
            }
        }
        while(i<nums1.length){
            list.add(new int[]{nums1[i][0],nums1[i][1]});
            i++;
        }
        while(j<nums2.length){
            list.add(new int[]{nums2[j][0],nums2[j][1]});
            j++;
        }
        return list.toArray(new int[list.size()][]);
    }
}
