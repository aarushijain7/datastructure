package code.leetcode.graphs;

public class Display2D{
    public static void display2D(int[][] grid){
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" " );
            }
            System.out.println();
        }
    }
}
