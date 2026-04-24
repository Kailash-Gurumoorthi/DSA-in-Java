public class findways {
    public static void main(String[] args){
        int[][] maze = {
                { 0, 0, 0 },
                { 0, 0, 0 },
                { 0, 0, 0 }
        };
        int m=maze.length,n=maze[0].length;
        System.out.print(ways(maze,m,n));
    }
    public static int ways(int[][] maze , int m ,int n ){

        if(maze[0][0] == 1 || maze[m-1][n-1] == 1) return 0;

        int[][] grid= new int[m][n];
        grid[0][0] =1;
        for(int i =0;i<m;i++){
            for(int j =0; j<n;j++){
                if(i == 0 && j == 0) continue;
                if(maze[i][j] == 1){
                    grid[i][j]=0;
                } else{
                    int up=(i>0)? (grid[i-1][j]):0;
                    int right=(j>0)? (grid[i][j-1]):0;
                    grid[i][j]=up+right;
                }
            }
        }

        return grid[m-1][n-1];
    }
}
