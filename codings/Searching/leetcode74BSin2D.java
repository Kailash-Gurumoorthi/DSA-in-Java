package Searching;

public class leetcode74BSin2D {
    public static void main(String[] args){
        int[][] matrix = {{1,3}};
        int target = 3;
        System.out.print(searchMatrix(matrix,target));
    }
    static boolean searchMatrix(int[][] matrix, int target){
        int rows=matrix.length,cols=matrix[0].length;
        int s =0,e=rows*cols-1;
        while(s<=e){
            int m = s+(e-s)/2,r=m/cols,c=m%cols;
            if(matrix[r][c] == target){
                return true;
            }else if(matrix[r][c] < target){
                s = m+1;
            }else{
                e=m-1;
            }
        }
        return false;
    }
}
