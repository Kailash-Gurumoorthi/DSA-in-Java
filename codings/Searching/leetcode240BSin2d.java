package Searching;

public class leetcode240BSin2d {
    public static void main(String[] args){
        int[][] matrix = {{1,3}};
        int target = 3;
        System.out.print(searchMatrix(matrix,target));
    }
    static boolean searchMatrix(int[][] matrix, int target){
        int r= 0,c=matrix[0].length-1;
        while(r < matrix.length && c>=0){
            if(matrix[r][c] == target ) return true;
            else if(matrix[r][c] < target) r++;
            else c--;
        }
        return false;
    }
}
