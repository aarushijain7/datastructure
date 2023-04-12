package code.leetcode.graphs;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid =
                {{'1','1','1','1','1','0','1','1','1','1'},
                {'1','0','1','0','1','1','1','1','1','1'},
                {'0','1','1','1','0','1','1','1','1','1'},
                {'1','1','0','1','1','0','0','0','0','1'},
                {'1','0','1','0','1','0','0','1','0','1'},
                {'1','0','0','1','1','1','0','1','0','0'},
                {'0','0','1','0','0','1','1','1','1','0'},
                {'1','0','1','1','1','0','0','1','1','1'},
                {'1','1','1','1','1','1','1','1','0','1'},
                {'1','0','1','1','1','1','1','1','1','0'}};
        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        if(grid==null){
            return 0;
        }
        int numOfIslands=0;
        int rows = grid.length;
        int columns = grid[0].length;
        for (int currRow=0;currRow<rows;currRow++){
            for(int currCol=0;currCol<columns;currCol++){
                if (grid[currRow][currCol] == '1') {
                    numOfIslands+=1;
                    markCurrentIsland(grid,currRow,currCol,rows,columns);
                }
                }
            }
        return numOfIslands;

        }

    private static void markCurrentIsland(char[][] grid, int currRow, int currCol, int rows, int columns) {
        if(currRow<0||currRow>=rows ||currCol<0||currCol>=columns||grid[currRow][currCol]!='1'){
            return;
        }
        grid[currRow][currCol]='2';

        markCurrentIsland(grid,currRow+1,currCol,rows,columns);
        markCurrentIsland(grid,currRow-1,currCol,rows,columns);
        markCurrentIsland(grid,currRow,currCol+1,rows,columns);
        markCurrentIsland(grid,currRow,currCol-1,rows,columns);


    }

}
